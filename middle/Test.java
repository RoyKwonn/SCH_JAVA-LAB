// 컴퓨터공학과 20184646 권석환 

// Base

/**
package middle; 

import java.io.*;

public class Test {

	public static void main(String[] args) {
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
**/


//(1) 위 프로그램의 예외 처리를 try-catch 방법으로 해결해보자.

package middle;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr = null;
		File file = new File("test.txt");
		
		try {
		fr = new FileReader(file);
		char [] a = new char[50];
		fr.read(a);
		for(char c: a)
			System.out.print(c);
		
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("오류가 발생했습니다.");
		}
		
		
	}

}