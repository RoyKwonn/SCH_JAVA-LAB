package seven;

public class TestEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Kim");
		String s2 = new String("Kim");
		if(s1.equals(s2))	// Not s1 == s2
			System.out.println("동일한 문자열 입니다.");
		else
			System.out.println("동일한 문자열이 아닙니다.");

	}

}
