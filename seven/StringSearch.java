package seven;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The cat is on the table";
		int index = s.indexOf("table");
		
		if(index == -1)
			System.out.println("table은 업습니다.");
		else
			System.out.println("table의 위치 : " + index);
	}

}
