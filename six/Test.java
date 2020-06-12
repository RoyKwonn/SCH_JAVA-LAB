package six;

class Base{
	public Base() {
		System.out.println("Base() 생성자 ");
	}
}

class Derived extends Base{
	public Derived() {
		System.out.println("Derived() 생성자 ");
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived r = new Derived();
	}

}
