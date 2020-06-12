package seven;

import java.util.*;



// Arrays 클래스의 메소드들은 모두 객체를 생성하지 않고도 호출될 수 있는 정적 메소드이다.

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 9, 4, 5, 6, 2, 1 };
		System.out.println(Arrays.binarySearch(array,9));
		Arrays.sort(array);
		printArray(array);
		System.out.println(Arrays.binarySearch(array,9));
		Arrays.fill(array, 8);
		printArray(array);
	}
	
	private static void printArray(int[] array)
	{
		System.out.print("[");
		for(int i=0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("]");
	}

}
