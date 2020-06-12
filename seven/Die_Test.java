package seven;
import java.util.*;

class Dice {
	
	private int value;
	
	// 생성자, 주사위 면을 1로 초기화 한다.
	public Dice()
	{
		this.value = 1;
	}
	
	// 주사위를 던진다. 1부터 까지의 숫자를 반환한다.
	int roll() {
		this.value = (int)(Math.random()*6) + 1; 
		return this.value;
	}

	protected int getValue() {
		return value;
	}

	protected void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "현재 주사위 상태 : " + value ;
	}
	
	
}

public class Die_Test {

}
