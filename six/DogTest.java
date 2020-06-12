package six;

class Animal {
	void eat() {
		System.out.println("먹고 있음 ...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("짖고 있음...");
	}
}

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}
