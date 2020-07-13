package eleven;

import javax.swing.*;

import eleven.Bouncing_Ball.MyPanel;

import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JFrame implements ActionListener {

	
	int x, y;
	
	int xSpeed = 3, ySpeed = 3;
	static final int WIDTH = 500;
	static final int HEIGHT = 300;
	static final int PERIOD = 10;
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.orange);
			g.fillOval(x, y, 30, 30);
			
		}
	}
	
	public void update()
	{
		x += xSpeed;
		y += ySpeed;
		
		if(x < 0 || x > (MyPanel.WIDTH - 30))
			xSpeed = -xSpeed;
		if(y < 0 || y > (MyPanel.WIDTH - 30))
			ySpeed = -ySpeed;
	}
	
	public BouncingBall() {
		setSize(WIDTH, HEIGHT);
		setTitle("Bouncing Ball");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		Timer timer = new Timer(PERIOD, this);
		timer.start();
	}
	
	public void actionPerformed(ActionEvent evt) {
		update();
		repaint();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BouncingBall f = new BouncingBall();
	}

}
