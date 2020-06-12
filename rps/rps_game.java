package rps;
import java.util.*; // for scanner()

public class rps_game {

	private int card;
	

	@Override
	public String toString() {
		
		switch(card)
		{
		case 0 :
			return "가위";
		case 1 :
			return "바위";
		case 2 :
			return "보";
		}
		return "error";
	}

	protected int getCard()
	{
		return card;
	}


	protected void setCard(int card) {
		
		this.card = card;
	}
	
	protected int for_computer()
	{
		card = (int)(Math.random()*2);
		return card;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		rps_game user = new rps_game();
		rps_game computer = new rps_game();
		int card;
		
		
		System.out.println("하나를 선택하시오 : 가위(0), 바위(1), 보(2) : ");
		while(true)
		{
			card = sc.nextInt();
			if(card < 0 || card > 2) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				user.setCard(card);
				computer.for_computer();
				System.out.println("컴퓨터는 " + computer.toString() + "를 냈습니다.");
				if(user.getCard() == computer.getCard())
				{
					System.out.println("비겼습니다.");
				} else if(user.getCard() == 0 && computer.getCard() == 2)
				{
					System.out.println("사용자가 이겼습니다."); break;
				} else if(user.getCard() == 2 && computer.getCard() == 0)
				{
					System.out.println("컴퓨터가 이겼습니다."); break;
				} else if(user.getCard() > computer.getCard()) {
					System.out.println("사용자가 이겼습니다."); break;
				} else if(user.getCard() < computer.getCard()) {
					System.out.println("컴퓨터가 이겼습니다."); break;
				}
				
			}
		}
				
	}

}
