package twelve;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;



class Monster extends JButton  {
	int x, y, hp;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 500;
	private int xSpeed = 3, ySpeed = 3;
	
	Monster(int x, int y, int hp)
	{
		this.x = x;
		this.y = y;
		this.hp = hp;
		ImageIcon icon = new ImageIcon("/Users/skan/Pictures/monster.jpeg");
		this.setIcon(icon);
	}
	
	public void update() {
		this.x += this.xSpeed;
		this.y += this.ySpeed;
		
		if(this.x > WIDTH - 40  || this.x < 0) {
			this.xSpeed = - this.xSpeed;
		}
		if(this.y > HEIGHT -40  || this.y < 0) {
			this.ySpeed = - this.ySpeed;
		}
		this.setLocation(this.x, this.y);
	}
	
}



public class Re03 extends JFrame implements ActionListener 
{
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 500;
	private static final int PERIOD = 10;
	
	
	//ArrayList<Monster> list = new ArrayList<>();
	
	//Monster m1 = new Monster(300, 50, 50);
	Monster m2 = new Monster(50, 300, 50);
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	//	m1.update();
		m2.update();
	}
	
	Re03()
	{	
		JPanel panel = new JPanel();
		setSize(WIDTH, HEIGHT);
		setTitle("Monster Catch Game");
			
		JPanel p = new JPanel();
		//p.add(m1);
		p.add(m2);
		add(p);
		Timer timer = new Timer(PERIOD, this);
		timer.start();
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Re03 f = new Re03();
	}
}
