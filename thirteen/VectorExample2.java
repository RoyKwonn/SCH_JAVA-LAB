package thirteen;

import java.util.*;

class Monster {
	
	String name;
	double hp;
	public Monster(String name, double hp)
	{
		this.name = name;
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "Monster [name=" + name + ", hp=" + hp + "]";
	}
	
}

public class VectorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Monster> list = new Vector<>();
		
		list.add(new Monster("Mon1", 100));
		list.add(new Monster("Mon2", 200));
		list.add(new Monster("Mon3", 300));
		
		System.out.println("벡터의 크기 : " + list.size());
		System.out.println(list);
	}
}
