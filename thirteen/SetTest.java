package thirteen;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set은 중복을 허용하지 않는다.
		
		//HashSet<String> set = new HashSet<String>();	// 집합은 순서가 없다.
		//LinkedHashSet<String> set = new LinkedHashSet<String>();	// 입력된 순서 
		TreeSet<String> set = new TreeSet<String>();	// 알파벳 순서 
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set);
		
		if(set.contains("Ham")) {
			System.out.println("Ham도 포함되어 있음");
		}
		
	}

}
