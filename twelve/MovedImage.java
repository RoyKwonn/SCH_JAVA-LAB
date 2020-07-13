package twelve;

import java.awt.event.*;
import javax.swing.*;

public class MovedImage extends JFrame {
	
	int img_x = 150, img_y = 150;
	
	public MovedImage()
	{
		setSize(600, 300);
		JButton b = new JButton("");
		ImageIcon icon = new ImageIcon("/Users/skan/Pictures/rocket.jpg");
		b.setIcon(icon);
		b.setLocation(img_x, img_y);
		JPanel panel = new JPanel();
		panel.add(b);
		panel.requestFocus(true);
		panel.setFocusable(true);
		panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				img_x = e.getX();
				img_y = e.getY();
				b.setLocation(img_x, img_y);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovedImage f = new MovedImage();
	}

}
