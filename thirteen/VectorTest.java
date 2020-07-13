package thirteen;

import java.util.*;


public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vc = new Vector();
		
		vc.add("Hello World");
		vc.add(new Integer(10));
		vc.add(20);
		
		System.out.println("Vector size : " + vc.size());
		
		for(int i = 0; i < vc.size(); i++)
		{
			System.out.println("vector element " + i + " : " + vc.get(i));
		}
		
		
	}

}
