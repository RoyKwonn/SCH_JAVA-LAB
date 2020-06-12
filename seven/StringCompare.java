package seven;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Apple";
		String s2 = "Apple";
		String s3 = new String ("Apple");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}

}
