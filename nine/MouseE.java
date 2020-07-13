package nine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseE extends JFrame implements MouseListener {

	
	public MouseE()
	{
		addMouseListener(this);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.ORANGE);
		g.fillOval(e.getX()-30, e.getY()-30, 60, 60);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseE f = new MouseE();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

}
