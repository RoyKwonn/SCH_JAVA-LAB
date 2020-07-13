package eleven;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bouncing_Ball extends JFrame  {

	int x, y;
	
	static final int WIDTH = 500;
	static final int HEIGHT = 300;
	static final int PERIOD = 10;
	
	public class MyPanel extends JPanel implements ActionListener{

		
		
		public Ball basket[] = new Ball[10];
		
		public MyPanel() {
			Timer timer = new Timer(PERIOD, this);
			timer.restart();
			
			for(int i = 0; i < 10; i++)
				basket[i] = new Ball(30);
		}
		
		
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			for(Ball b : basket) {
				b.paint(g);
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			repaint();
		}
		
	}
	
	class Ball {
		int x, y, xlnc, ylnc;
		int diameter;
		
		public Ball(int d) {
			this.diameter = d;
			x = (int)(Math.random()*(MyPanel.WIDTH -d) +3);
			y = (int)(Math.random()*(MyPanel.WIDTH -d) +3);
			xlnc = (int)(Math.random()*3 + 1);
			ylnc = (int)(Math.random()*3 + 1);
		}
		
		public void paint(Graphics g) {
			if(x < 0 || x > (MyPanel.WIDTH - diameter))
				xlnc = -xlnc;
			if(y < 0 || y > (MyPanel.WIDTH - diameter))
				ylnc = -ylnc;
			
			x += xlnc;
			y += ylnc;
			g.setColor(Color.RED);
			g.fillOval(x, y, diameter, diameter);
		}
	}
	
	void Bouncing_Ball()
	{
		add(new MyPanel());
		setSize(WIDTH, HEIGHT);
		setTitle("Bouncing Ball");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bouncing_Ball f = new Bouncing_Ball();
		
	}

}
