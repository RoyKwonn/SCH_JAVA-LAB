package report;

import java.lang.*;

class Person{
	String name;
	int id;
	
	Person(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	protected String getName() {
		return name;
	}
	
	void printInfo() {
		
		System.out.print("name =  \"" + name + "\", id = " + id);
	}
}

class Student extends Person{
	double gpa;
	int credits;
	
	Student(String name, int id, double gpa, int credits){
		super(name, id);
		this.gpa = gpa;
		this.credits = credits;
		this.printInfo();
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println(" gpa = " + gpa + " credits = " + credits);
	}
}

class Employee extends Person{
	int salary;
	int years;
	
	Employee(String name, int id, int salary, int years){
		super(name, id);
		this.salary = salary;
		this.years = years;
		printInfo();
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println(" salary = " + salary + " years = " + years);
	}
}

public class Person_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] p = new Person[4];		
		System.out.println("생성자 호출! ");
		p[0] = new Student("Steve Jobs", 1, 3.9, 30);
		p[1] = new Employee("Jeff Bezos", 2, 10000, 10);
		p[2] = new Employee("Bill Gates", 3, 20000, 15);
		p[3] = new Employee("Steve Jobs", 4, 30000, 20);
		System.out.println("=======================");
		System.out.println("Steve Jobs인 사람만 찾기!");
		for(int i = 0; i<4; i++)
		{
			if(p[i].getName().equals("Steve Jobs"))
			{
				p[i].printInfo();
			}
		}
		
	}

}