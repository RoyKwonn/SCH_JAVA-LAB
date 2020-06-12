package seven;

// TRY CATCH의 오류 처리


import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피젯수 : ");
		x = sc.nextInt();
		System.out.print("젯수 : ");
		y = sc.nextInt();
		
		int result = -1;
		try
		{
			result = x / y;	// 예외가 발생할 수 있는 문
		}
		catch (ArithmeticException e)	// 여기서 오류를 처리한다. 현재는 그냥 콘솔에 오류 메시지를 출력하고 계속 실행한다.
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		finally
		{
			System.out.println("나눗셈 결과 : " + result);
		}
		
		
		
		
	}

}
