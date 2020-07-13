package twelve;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;





public class Report02 extends JFrame {
	
	int x=0, y=0;
	
	class MyPanel extends JPanel 
	{
		public MyPanel()
		{
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent event) {
					x = event.getX();
					y = event.getY();
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(x, y, 40, 40);
		}
	}
	
	public Report02()
	{
		setSize(600, 150);
		setTitle("그래픽 기초 프로그램");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Report02 f = new Report02();
	}

}
