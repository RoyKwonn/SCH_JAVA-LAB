package seven;

import java.io.*;

// try-with-resources ('자동 리소스 관리'라고도 함)는 Java 7에서 도입된 새로운 예외 처리 메커니즘으로, try catch 블록 내에서 사용되는 리소스를 자동으로 닫는다.

public class TryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileReader fr = new FileReader("test.txt")) // fr이 가리키는 리소스는 사용이 끝나면 자동으로 닫혀진다.
		{
			char[] a = new char[50];
			fr.read(a);
			for (char c : a)
				System.out.print(c);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
