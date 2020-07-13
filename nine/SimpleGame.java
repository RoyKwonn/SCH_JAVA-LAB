package nine;

import java.awt.event.*;
import javax.swing.*;

public class SimpleGame extends JFrame {

	int n1, n2, n3;
	JButton b1, b2, b3;
	
	
	SimpleGame()
	{
		setTitle("Simple Game Machine");
		setSize(300, 150);
		JPanel panel = new JPanel();
		b1 = new JButton(""+n1);
		panel.add(b1);
		b2 = new JButton(""+n2);
		panel.add(b2);
		b3 = new JButton(""+n3);
		panel.add(b3);
		
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
				if(keycode == KeyEvent.VK_ENTER) {
					n1 = (int)(Math.random()*10);
					n2 = (int)(Math.random()*10);
					n3 = (int)(Math.random()*10);
					
					b1.setText(""+n1);
					b2.setText(""+n2);
					b3.setText(""+n3);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGame f = new SimpleGame();
	}

}
