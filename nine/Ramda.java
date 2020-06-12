package nine;

import javax.swing.*;
import java.awt.event.*;

public class Ramda extends JFrame {

	private JButton button;
	private JLabel label;
	int counter = 0;
	
	
	public Ramda()
	{
		this.setSize(400, 150);
		this.setTitle("이벤트 예제");
		
		JPanel panel = new JPanel();
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값 : " + counter);
		
		button.addActionListener(e -> {
			counter++;
			label.setText("현재의 카운터값 : " + counter);
		});
		
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ramda t = new Ramda();

	}

}
