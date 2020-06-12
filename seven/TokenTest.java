package seven;

public class TokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = "I am a boy.".split(" ");
		for(String token : tokens) // 토큰으로 쪼개진 문장을 하나씩 받아오는 구 
		{
			System.out.println(token);
		}
	}

}
