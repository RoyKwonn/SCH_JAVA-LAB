package game;

public class Die {

	private int value;
	
	// 생성자, 주사위 면을 1로 초기화 한다.
	public Die()
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die f = new Die();
		Die g = new Die();
		
		System.out.println("주사위 게임 시작 ! ");
		while(true)
		{
			if(f.getValue() > g.getValue()) {
				System.out.println("사용자가 이겼습니다.");
				break;
			} else if(f.getValue() < g.getValue()) {
				System.out.println("컴퓨터가 이겼습니다.");
				break;
			}
			
			System.out.println("==================");
			f.roll();
			System.out.println("사용자 : " + f.toString());
			g.roll();
			System.out.println( "컴퓨터 : " + g.toString());
			
		}
	}

}
