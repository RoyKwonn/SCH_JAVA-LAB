// 컴퓨터공학과 20184646 권석환 
package six;
import java.util.*;

abstract class Sprite { // 추상화 클래스 
	int x = 3, y = 3;	// x, y 좌표 
	int oldx, oldy;		// x, y 옮기기 전 좌
	
	void previous() {	// 옮기기전 저장을 해둔다.
		oldx = x;
		oldy = y;
	}
	
	abstract void move(char c); // 추상화 메소드 
}


class Main extends Sprite {  	//추상화 클래스를 상속받는다 
    void move(char c) {  		// 캐릭터를 옮기는 값을 받는다.
        previous();				// 이전 값을 저장해둔다.
        if(c=='h') --y;			// h가 입력된 경우 왼쪽으로 
        else if(c=='j') --x;	// j가 입력된 경우 위로 
        else if(c=='k') ++x;	// k가 입력된 경우 아래로 
        else if(c=='l') ++y;	// l이 입력된 경우 오른쪽으로 
        Game.invalidMove(this); 	// 변화된 위치값을 프린트한다.
    }
}


class Monster extends Sprite {	// 추상화 클래스를 상속받는다.
    public Monster() {			// 몬스터의 생성자.
        x = y = (int)Math.random()*8+1; // 랜덤한 위치에 생성한다.
    }
    void move(char c) {			// 추상화 메소드로 정의되어 있기 때문에 c를 쓰지 않아도 매개변수로 받는다.
        previous();
        double d = Math.random(); 	// 랜덤한수를 입력받는다.
        x += (d-0.25)>0? 1: -1;		// 랜덤한 방향으로 몬스터를 옮긴다.
        y +=(d-0.75)>0? 1:-1;
        Game.invalidMove(this);		// 변화된 위치값을 프린트 한다.
    }
}

class Game{		// 게임의 캐릭터 생성과 룰을 정의한 클래스.
	Scanner sc = new Scanner(System.in);	
	static char[][] board = new char[10][19]; // 맵을 정의한다. 
	char c;
	
	Main user = new Main(); // 유저를 생성한다. 
	Monster mnstr = new Monster(); // 몬스터를 생성한다.
	static int gx, gy;	// 금의 위치를 랜덤하게 지정한다.
	
	Game(){				// 생성자 맵의 경계를 표시한다.
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<19; j++)
			{
				if(i == 0 || i == 9) board[i][j] = '#';
				else {
					if(j==0||j==18) board[i][j] = '#';
					else board[i][j] = ' ';
				}
			}
		}
		gold(); // 랜덤한 골드의 위치선정
	}
	
	void print(){ // 각 배열에 저장된 값을 출력한다.
		
		for(int i = 0; i<10; i++)
		{
			for(int j = 0; j<19; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println(" ");
		}
		System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l): ");
		c = sc.next().charAt(0);	// 사용자로부터 입력을 받는다.
	}
	
	void gold() {	// 골드의 위치를 맵 안쪽 영역에 랜덤하게 지정한다.
		gx = (int)(Math.random()*8 + 1);
		gy = (int)(Math.random()*17 + 1);
		board[gx][gy] = 'G';
	}
	
	void init() {	// 초기 유저의 위치와 몬스터의 위치를 선정한다.
		board[user.x][user.y] = '@';
		board[mnstr.x][mnstr.y] = 'M';
	}
	
	void move() {	// 유저와 스터가 이동 했을 때 이전에 있던 위치의 표시를 지워준다.
        user.move(c);
        board[user.oldx][user.oldy] = ' ';
        mnstr.move(c);
        board[mnstr.oldx][mnstr.oldy] = ' ';
    }
	
	boolean getGold(Sprite s) {		// 사용자가 금을 먹은 경우 
		boolean get = false;
		if(s.x == gx && s.oldy == gy) get = true;
		return get;
	}
	
	boolean attackMonster() {		// 몬스터와 사용자의 위치가 동일해진 경우
		boolean attack = false;
		if(user.x == mnstr.x && user.y == mnstr.y)
			{ 
			attack = true;
			board[mnstr.x][mnstr.y] = 'M';
			}
		return attack;
	}
	
	static void invalidMove(Sprite sprite) { // 맵을 벗어난 경우 
        if(sprite.x>8 || sprite.x<1) {
            sprite.x = sprite.oldx;
            System.out.println("you can't go there");
        }
        if(sprite.y>17 || sprite.y<1) {
            sprite.y = sprite.oldy;
            System.out.println("you can't go there");
        }
   
    }
	
	void endprint() {		// 게임이 종료된 경우 
		System.out.println("\n!!!!!!!!!!!!!!!!!");
		for(int i = 0; i<10;i++)
		{
			for(int j = 0; j<19; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
		System.out.println("Game ended");
		
		if(getGold(user)) System.out.println("You got the GOLD!");
		if(getGold(mnstr)) System.out.println("Monster got the GOLD!");
		if(attackMonster()) System.out.println("Monster attacked you!");
	}
}


public class Text_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game obj = new Game();
        do {
            obj.init();
            obj.print();
            obj.move();
        }while(obj.c!='q' && !obj.getGold(obj.mnstr) && !obj.getGold(obj.user) && !obj.attackMonster());
        // 게임이 종료되는 조건은 q를 입력 받거나 사용자가 금을 먹거나, 몬스터가 금을 먹거나, 몬스터에게 사용자가 잡힌 경우다.
        obj.endprint();	// 게임 종료 메시지 
	}

}
