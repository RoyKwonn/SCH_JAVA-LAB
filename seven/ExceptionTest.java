package seven;

import java.io.*;

public class ExceptionTest {

	public static void main(String[] args) throws IOException { // IOException이 발생하면 상위 메소드로 예외를 전달한다. 여기서는 예외가 발생하면 프로그램이 종료된다.
		
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("test.txt");
		char[] a = new char[50];
		fr.read(a);
		for (char c : a)
				System.out.print(c);

	}

}
