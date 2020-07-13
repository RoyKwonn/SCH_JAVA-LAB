package thirteen;

import java.util.*;


class Player {
	double score;
	Player(double score)
	{
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "심사위원의 점수 : " + (int)this.score;
	}

	protected double getScore() {
		return score;
	}
	
}

public class Report01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Player> list = new ArrayList<>();
		double total = 0.0;
		
		for(int i = 1; i <= 10; i++)
		{
			list.add(new Player(i));
		}

		for(int i = 0; i< list.size(); i++)
		{
			System.out.println(list.get(i));
			if(i != 0  && i != list.size() -1)
			{
				total += list.get(i).getScore();
			}
		}
		
		System.out.println("점수의 합 : " + total);
	}

}
