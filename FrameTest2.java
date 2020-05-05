package four;

import javax.swing.*;		// JFrame 관련 
import java.lang.*;

public class FrameTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =0, j=0; 			// x축 좌표 !
		int ending_line = 1000;	// 골인 지점 
		
		JFrame f = new JFrame("Number 1");	// 1번 창 생성 
		f.setSize(300, 200);				// 창 크기 설정 
		f.setLocation(0, 20);				// 창 위치 설정 
		f.setVisible(true);					// 보여지기 
		
		JFrame g = new JFrame("Number 2");	// 2번 창 생성 
		g.setSize(300, 200);				// 창 크기 
		g.setLocation(0, 400);				// 창 위치 
		g.setVisible(true);					// 보여지기 
		
		while(true)					// 무한 루프 
		{
			if(i > ending_line)			// 1번 창이 먼저 골인에 도달했을 경우 
			{
				System.out.println("Winner is number 1 !!!!");
				break;
			}
			else if(j > ending_line)	// 2번창이 먼저 골인에 도달했을 경우 
			{
				System.out.println("Winner is number 2 !!!!");
				break;
			}
			
			i += (int)(Math.random()*4);	// 랜덤한 수를 만들어준다 
			j += (int)(Math.random()*4);
			
			f.setLocation(i,20);	// 각각의 랜덤한 수만큼 우측으로 이동시킨다. 
			g.setLocation(j,400);
			
			f.setVisible(true); 	// 변경된 사항 화면에 출력하기.	
			g.setVisible(true);
		}
		
	}

}
