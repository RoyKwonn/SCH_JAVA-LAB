package thirteen;

import java.util.*;


class Student implements Comparable<Student> {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	/*
	public int compareTo(Student s) {
		return s.number - number;
	}*/
}

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student array[] = {
				new Student(2, "김철수"),
				new Student(3, "이철수"),
				new Student(1, "박철수")
		};
		
		List<Student> list = Arrays.asList(array);
		
		// 람다식 활용
		Collections.sort(list, (Student s1, Student s2)->{return (s1.number - s2.number);});
		System.out.println(list);
	}

}
