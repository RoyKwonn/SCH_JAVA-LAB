package seven;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = "100,200,300".split(",");
		for(String token : tokens)
		{
			System.out.println(token);
		}
	}

}
