package eleven;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TrafficLight extends JFrame{
	
	class MyPanel extends JPanel implements ActionListener
	{
		int light_number = 0;
		
		public MyPanel()
		{
			setLayout(new BorderLayout());
			JButton b = new JButton("신호 변경");
			b.addActionListener(this);
			add(b, BorderLayout.SOUTH);
			
		}
		
		
			protected void paintComponent(Graphics g){
				// 신호등을그린다.
				
				g.setColor(Color.GRAY);
				g.fillOval(30, 10, 30, 30);
				g.fillOval(64, 10, 30, 30);
				g.fillOval(100, 10, 30, 30);
				
				switch(light_number){
				case 0:
					g.setColor(Color.RED);
					g.fillOval(100, 10, 30, 30);
					break;
				case 1:
					g.setColor(Color.YELLOW);
					g.fillOval(64, 10, 30, 30);
					break;
				case 2:
					g.setColor(Color.GREEN);
					g.fillOval(30, 10, 30, 30);
					break;
				}
			}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(++light_number >= 3) 
				light_number = 0;
				
			repaint();	// paintComponent를 호출한다.
		}
	}
	
	TrafficLight()
	{
		setSize(300,200);
		setTitle("Traffic Light");
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight f = new TrafficLight();
	}

}
