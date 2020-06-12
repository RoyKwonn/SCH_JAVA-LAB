// (3) 위 프로그램의 예외 처리를 try-with-resources 방법으로 해결해보자.

package eight;

import java.io.*;

public class TryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// fr이 가리키는 리소스는 사용이 끝나면 자동으로 닫혀진다.
		try (FileReader fr = new FileReader("test.txt")) {
			char[] a = new char[50];
			fr.read(a);
			for (char c : a)
				System.out.print(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
