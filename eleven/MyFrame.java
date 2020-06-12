package eleven;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	
	
	
	public MyFrame() {
		setSize(300, 150);
		
		setTitle("Layout Test");
		// ---------------------------------------
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.orange);
		
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.YELLOW);
		
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.GREEN);
		
		panel.add(b1);
		panel.add(b2);
		add(panel);
		setSize(300, 150);
		
		
		
		
		// ----------------------------------------
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}
