package five;

class Dog {					// 클래스 Dog 
	String name;			// 인스턴스 변수
	int age;				// 인스턴스 변수
	String color;			// 인스턴스 변수 
	static int count = 0;	// 정적변수 
	
	public Dog(String name, int age, String color) { // 생성자.
		this.name = name;	// this.는 이 클래스에 존재하는 변수를 뜻하고 뒤에 name은 매계변수로 들어온 변
		this.age = age;
		this.color = color;
		count++;			// 정적변수의 값을 증가시킨다. 어떤 객체를 통해 들어와도 같은 클래스형식이 이 값은 공유된다.
	}
}

//강아지의 나이를 5살 어리게 만드는 마술사 클래
class Witch {		 
	static int younger(Dog obj) {	// 정적 메소
		obj.age = obj.age - 5;
		return obj.age;
	}
}


public class Dog_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog("Molly", 10, "brown");	// 객체 생성과 동시에 생성자를 통하여 매계변수 전달 
		Dog d2 = new Dog("Daisy", 6, "black");
		Dog d3 = new Dog("Bella", 7, "white");
		
		System.out.println("강아지 #1 = \"" + d1.name +"\", " + d1.age + ", \"" + d1.color +"\"");
		System.out.println("강아지 #2 = \"" + d2.name +"\", " + d2.age + ", \"" + d2.color +"\"");
		System.out.println("강아지 #3 = \"" + d3.name +"\", " + d3.age + ", \"" + d3.color +"\"");
		System.out.println("현재까지 생성된 강아지의 수 = " + Dog.count);	// 정적변수가 출력됨을 통해 변수가 공유됨을 알 수 있다.
		System.out.println(); // 그냥 한줄뛰기.
		
		
		// 강아지를 마술사에게 보내보도록 하자.
		d1.age = Witch.younger(d1);
		d2.age = Witch.younger(d2);
		d3.age = Witch.younger(d3);
				
		// 변화된 강아지의 나이를 확인해보자.
		System.out.println("강아지 #1 = \"" + d1.name +"\", " + d1.age + ", \"" + d1.color +"\"");
		System.out.println("강아지 #2 = \"" + d2.name +"\", " + d2.age + ", \"" + d2.color +"\"");
		System.out.println("강아지 #3 = \"" + d3.name +"\", " + d3.age + ", \"" + d3.color +"\"");
				
	}

}
