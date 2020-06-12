// (2) 위 프로그램의 예외 처리를 throws 방법으로 해결해보자.

package middle;

import java.io.*;

public class Test2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = null;
		File file = new File("test.txt");
		
		fr = new FileReader(file);
		char [] a = new char[50];
		fr.read(a);
		for(char c: a)
			System.out.print(c);

	}

}


