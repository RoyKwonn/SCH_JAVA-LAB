package seven;

import java.util.*;

/**
Random 클래스의 객체는 난수를 발생하는데 사용된다. 48비트 길이의 SEED를 사용하며 알고리즘으로는 변형된 선형 합동 수식(Linear congruential formula)
**/
public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		for (int i = 0; i < 10; i++)
			System.out.print(random.nextInt(100) + ", ");
	}

}
