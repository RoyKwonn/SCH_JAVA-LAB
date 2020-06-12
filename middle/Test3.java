// (3) 위 프로그램의 예외 처리를 try-with-resources 방법으로 해결해보자.

package middle;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File file = new File("test.txt");
		
		try(FileReader fr = new FileReader(file)){
			char [] a = new char[50];
			fr.read(a);
			for(char c: a)
				System.out.print(c);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("예외처리 !");
		}

	}

}
