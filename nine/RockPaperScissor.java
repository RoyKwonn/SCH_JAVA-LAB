package nine;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class RockPaperScissor extends JFrame implements ActionListener {

	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	private JPanel panel;
	private JLabel output, information;
	private JButton rock, paper, scissor;
	
	
	public RockPaperScissor()
	{
		setTitle("가위, 바위, 보");
		setSize(400, 150);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3)); // 그리드 배치 관리자 선택
		
		information = new JLabel("아래의 버튼 중에서 하나를 클릭하시오!");
		output = new JLabel("Good Luck");
		rock = new JButton("0 : Rock");
		paper = new JButton("1 : Paper");
		scissor = new JButton("2 : Scissor");
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RockPaperScissor gui = new RockPaperScissor();
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); // 이벤트 발생 컴포트 추출
		int user = Integer.parseInt("" + b.getText().charAt(0)); // 버튼 텍스트의 첫 번째 글자 추출
		
		Random random = new Random();
		int computer = random.nextInt(3); // 0~2 범위에서 난수 발생 
		if(user == computer)
			output.setText("인간과 컴퓨터가 비겼음");
		else if(user == (computer + 1)%3)
			output.setText("인간 : " + user + " 컴퓨터 : " + computer + " 인간 승리");
		else
			output.setText("인간 : " + user + " 컴퓨터 : " + computer + " 컴퓨터 승리");
	}

}
