package four;

import java.lang.*;

public class Dice {
	
	private int value; //클래스 안에서만 사용가능한 접근지정자
	
	public Dice()	// 생성자 : 객체를 생성하면 바로 실행되는 method
	{
		this.value = (int)(Math.random()*6) + 1; // 1~6의 랜덤한 
	}
	
	public int getValue() {
		return value;	// private의 값을 불러오기 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		int counter = 0;
		
		while(true)	// 무한루프 
		{
			Dice f = new Dice();	// 주사위 1 생성 
			Dice g = new Dice();	// 주사위 2 생성 
			
			i = f.getValue();	// f객체 속 value값을 가져오기 
			j = g.getValue();	// g객체 속 value값을 가져오기 
			
			System.out.println("주사위 1 = " + i + " 주사위 2 = " + j);
			
			counter++;	// 실행할 때마다 counter에 1씩 증가시켜주
			
			if(i + j == 2)	// 만약, 두 주사위의 합이 2일 경
				break;	// 반복문 종
		}
		System.out.println("(1, 1)이 나오는데 걸린 횟수 = " + counter);
	}

}
