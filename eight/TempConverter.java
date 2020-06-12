package eight;

import java.awt.*;
import javax.swing.*;

public class TempConverter extends JFrame {

	public TempConverter()
	{
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환");
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		setSize(300, 150);
		setTitle("온도변환기");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempConverter f = new TempConverter();
	}

}
