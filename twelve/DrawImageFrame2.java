package twelve;

import javax.swing.*;
import java.awt.*;


public class DrawImageFrame2 extends JFrame {

	java.awt.Image img;
	int pos_x = 100, pos_y = 0;
	
	
	class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, pos_x, pos_y, this);
		}
	}
	
	public DrawImageFrame2()
	{
		ImageIcon icon = new ImageIcon("/Users/skan/Pictures/rocket.jpg");
		img = icon.getImage();
		setSize(500, 200);
		
		add(new MyPanel(), BorderLayout.CENTER);
		JPanel panel = new JPanel();
		Button b1 = new Button("왼쪽으로 이동");
		Button b2 = new Button("오른쪽으로 이동");
		b1.addActionListener(e->{pos_x -= 10; repaint();});
		b2.addActionListener(e->{pos_x += 10; repaint();});
		panel.add(b1);
		panel.add(b2);
		add(panel, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawImageFrame2 f = new DrawImageFrame2();
	}

}
