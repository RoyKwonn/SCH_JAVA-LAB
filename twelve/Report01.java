package twelve;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Report01 extends JFrame implements ActionListener {

	
	private int xSpeed = 3, ySpeed = 3;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 300;
	private static final int PERIOD = 10;
	int x = 0, y = HEIGHT;
	java.awt.Image img;
	
	
	public void update() {
		x += xSpeed;
		y -= ySpeed;
		/**
		if(x > WIDTH || x < 0) {
			xSpeed = - xSpeed;
		}
		if(y > HEIGHT || y < 0) {
			ySpeed = - ySpeed;
		}
		**/
	} 
	
	
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, x, y, this);
		}
	}
	
	Report01()
	{
		ImageIcon icon = new ImageIcon("/Users/skan/Pictures/rocket.jpg");
		img = icon.getImage();
		
		setSize(WIDTH, HEIGHT);
		setTitle("Animation");
		
		add(new MyPanel());
				
		Timer timer = new Timer(PERIOD, this);
		timer.start();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		update();
		repaint();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Report01 f = new Report01();
	}

	

}
