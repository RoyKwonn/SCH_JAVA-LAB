package twelve;

import java.awt.event.*;
import javax.swing.*;

public class Image extends JFrame {

	int img_x = 150, img_y = 150;
	
	Image()
	{
		setSize(600, 300);
		JButton b = new JButton("");
		ImageIcon icon = new ImageIcon("/Users/skan/Pictures/rocket.jpg");
		b.setIcon(icon);
		b.setLocation(img_x, img_y);
		JPanel panel = new JPanel();
		panel.add(b);
		panel.requestFocus();
		panel.setFocusable(true);
		panel.addKeyListener(new KeyListener() {
		
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keycode = e.getKeyCode();
				switch(keycode) {
				case KeyEvent.VK_UP: img_y -= 10; break;
				case KeyEvent.VK_DOWN: img_y += 10; break;
				case KeyEvent.VK_LEFT: img_x -= 10; break;
				case KeyEvent.VK_RIGHT: img_x += 10; break;
				}
				b.setLocation(img_x, img_y);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}});
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image f = new Image();
	}

}
