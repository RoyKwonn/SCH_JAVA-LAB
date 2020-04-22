package four;


class Counter {
	int counter;
	
	public int getCounter() { 				// get 
		return counter;
	}

	public void setCounter(int counter) {	// set 1
		this.counter = counter;
	}

	void up() {								// set 2
		counter++;
	}
	
	Counter(){								// 생성자 
		System.out.println("Counter의 생성자를 호출하였습니다");
	}
}

public class CounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c = new Counter();	// 객체 생성 
		c.setCounter(100);			// 카운터의 값을 100으로 정해주는 코드
		c.up();						// set을 통한 c.counter의 값 변경 
		c.up();
		System.out.println("두번의 up() 실행 후 counter의 값은? \n" + c.getCounter());	// get을 통해 값 받아오기 
		
		
	}

}
