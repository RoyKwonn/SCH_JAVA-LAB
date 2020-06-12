package seven;

class Car { }

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj = new Car();
		System.out.println("obj is of type " + obj.getClass().getName());
		System.out.println("obj의 해쉬코드 = " + obj.hashCode());
	}

}
