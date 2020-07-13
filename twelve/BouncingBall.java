package twelve;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BouncingBall extends JFrame implements ActionListener {

	
	int x, y;
	private int xSpeed = 3, ySpeed = 3;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 200;
	private static final int PERIOD = 10;
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.ORANGE);
			g.fillOval(x, y, 40, 40);
		}
	}
	
	public void update() {
		x += xSpeed;
		y += ySpeed;
		
		if(x > WIDTH - 40 || x < 0) {
			xSpeed = - xSpeed;
		}
		if(y > HEIGHT - 40 || y < 0) {
			ySpeed = - ySpeed;
		}	
	}
	
	
	BouncingBall()
	{
		setSize(WIDTH, HEIGHT);
		setTitle("Animation");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		Timer timer = new Timer(PERIOD, this);
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		update();
		repaint();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BouncingBall f = new BouncingBall();
	}

	

}
