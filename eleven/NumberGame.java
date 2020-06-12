package eleven;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NumberGame extends JFrame implements ActionListener {
	
	JPanel panel, p1, p2;
	int num;
	JTextField text;
	JLabel result;
	JButton b1, b2;
	
	public NumberGame()
	{
		
		setSize(300, 200);
		setTitle("숫자게임");
		
		
		panel = new JPanel();
		JLabel label = new JLabel("숫자를 추측하시오 : ");
		text = new JTextField(3);
		
		num = (int)(Math.random()*100);
		text.addActionListener(this);
		panel.add(label);
		panel.add(text);
		
		add(panel, BorderLayout.NORTH);
		
		
		p1 = new JPanel();
		result = new JLabel("입력하세요");
		result.setForeground(Color.red);
		p1.add(result);
		add(p1, BorderLayout.CENTER);
		
		p2 = new JPanel();
		b1 = new JButton("다시 한번");
		b2 = new JButton("종료");
		b1.addActionListener(this);
		b2.addActionListener(this);
		p2.add(b1);
		p2.add(b2);
		add(p2, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
				String name = text.getText();
				int value = Integer.parseInt(name);
				
				if(num > value)
					{
						result.setText("작습니다");
					}
				else if (num < value)
					{
						result.setText("큽니다");
					}
				else
					{
						result.setText("같습니다");
					}
				
				if(e.getSource() == b1)
				{
					num = (int)(Math.random()*100);
				}else if(e.getSource() == b2)
				{
					System.exit(0);
				}
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberGame n = new NumberGame();
	}

}
