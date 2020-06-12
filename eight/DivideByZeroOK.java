// (1) 위 프로그램의 예외 처리를 try-catch 방법으로 해결해보자.

package eight;

import java.util.*;

public class DivideByZeroOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피젯수: ");
		x = sc.nextInt();
		
		System.out.print("젯수: ");
		y = sc.nextInt();
		
		try {
			int result = x / y;				// 예외발생 
		} catch (ArithmeticException e) {
			// 여기서 오류를 처리한다. 현재는 그냥 콘솔에 오류 메시지를 출력하고 계속 실행한다. 
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램은 계속 진행됩니다.");

	}

}
