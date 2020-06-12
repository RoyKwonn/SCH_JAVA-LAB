package seven;

public class ArrayError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5};
		int i = 0;
		
		try {
			for (i = 0; i <= array.length; i++)	// 일부로 <= 이라는 조건을 주어 예외 처리문을 실행시켜보았다.
			{
				System.out.print(array[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 " + i + "는 사용할 수 없네요!");
		}
	}

}
