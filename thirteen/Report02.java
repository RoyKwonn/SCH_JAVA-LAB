package thirteen;

import java.util.*;

public class Report02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> set = new HashSet<Integer>();
		
		int i = 0;
		int temp;
		
		while(i <  6)
		{
			temp = (int)(Math.random()*44 + 1);
			
			if(set.contains(temp))
			{
				System.out.println("이미 포함되어 있는 숫자 : " + temp);
			}
			else
			{
				set.add(temp);
				i++;
			}
		}
		
		System.out.println("Lotto [set=" + set + "]");
	}

}
