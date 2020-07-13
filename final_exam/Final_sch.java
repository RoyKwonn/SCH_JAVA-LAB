package final_exam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;
import java.util.*;
import java.util.List;


public class Final_sch extends JFrame {

	static List<String> quiz_list = new LinkedList<String>();
	
	int quizIndex = 0;
	JLabel quiz;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	JLabel labelAns;
	
	class NextQuizListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			quizIndex += 5;
			
			labelAns.setText("");
			quiz.setText(quiz_list.get(quizIndex));
			b1.setText(quiz_list.get(quizIndex + 1));
			b2.setText(quiz_list.get(quizIndex + 2));
			b3.setText(quiz_list.get(quizIndex + 3));
			b4.setText(quiz_list.get(quizIndex + 4));
		}
		
	}
	
	class AnswerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			labelAns.setText(b.getText());
			
		}
	}
	
	
	
	public Final_sch()
	{
		setTitle("퀴즈 시스템");
		setSize(500, 400);
		
		
		// --------------------------------------------------------------------
		// 전체적인 판넬구조 선
		
		JPanel panel = new JPanel(new BorderLayout());  // 전체 
		JPanel panelA = new JPanel(); // 위에 타이틀이 달리는 판넬 
		JPanel panelB = new JPanel(new BorderLayout()); // 아래 문제와 답안이 출력되는 판넬 
		JPanel question = new JPanel(); // 문제가 붇는 판넬
		JPanel answer = new JPanel(new GridLayout(0,2, 15, 5)); // 답 버튼이 붙는 판넬 
		
		// ----------------------------------------------------------------------
		
		
		
		
		
		
		
		
		// -----------------------------------------------------------------------
		// 판넬 모서리라인 그리
		
		panelA.setBorder(new TitledBorder(new LineBorder(Color.black, 2)));
		panelB.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		question.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		question.setBackground(Color.white);
		
		// -----------------------------------------------------------------------
		
		
		
		
		
		
		
		
		// --------------------------------------------------------------------------------------------
		// 패딩공간에 관한 내용.
		
		JPanel padding = new JPanel();
		padding.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel paddingA = new JPanel(); // 위의 panelA가 떨어져있는 네모 박스가 나올 수 있도록 공간을 늘려주는 판넬 추가.
		paddingA.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel paddingB = new JPanel();
		paddingB.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel paddingQu = new JPanel();
		paddingQu.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JPanel paddingAn = new JPanel();
		paddingAn.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		// -----------------------------------------------------------------------------------------------
		
		
		
		
		
		
		// ==========================================================
		// PanelA에 붙는 내용
		
		JLabel title = new JLabel("Quiz Management System");
		title.setFont(new Font("SanSerif", Font.BOLD, 25));
		panelA.add(title);
		
		// ==========================================================
		
		
		
		
		// ===========================================================
		// PanelB에 붙는 내용
		
		
		
		// ----------------------------------------------------------
			// PanelB - question(JLabel)
		
		quiz = new JLabel(quiz_list.get(quizIndex));
		quiz.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		question.add(quiz);
		paddingQu.add(question);
		
		// ----------------------------------------------------------
		
		
		
		
		// ----------------------------------------------------------
			// PanelB - answer(JLabel)
		
		b1 = new JButton(quiz_list.get(quizIndex + 1));
		b2 = new JButton(quiz_list.get(quizIndex + 2));
		b3 = new JButton(quiz_list.get(quizIndex + 3));
		b4 = new JButton(quiz_list.get(quizIndex + 4));
		b1.addActionListener(new AnswerListener());
		b2.addActionListener(new AnswerListener());
		b3.addActionListener(new AnswerListener());
		b4.addActionListener(new AnswerListener());
		
		answer.add(b1);
		answer.add(b2);
		answer.add(b3);
		answer.add(b4);
		answer.setBackground(Color.GRAY);
		
		
		
		JButton bNext = new JButton("다음");
		bNext.addActionListener(new NextQuizListener());
		
		
		JPanel selAns = new JPanel();
		labelAns = new JLabel("");
		selAns.add(new JLabel("선택한 답 : "));
		selAns.add(labelAns);
		
		paddingAn.setLayout(new BorderLayout());
		paddingAn.add(selAns, BorderLayout.WEST);
		paddingAn.add(bNext, BorderLayout.EAST);
		paddingAn.add(answer, BorderLayout.SOUTH);
		
		// ----------------------------------------------------------
	
		
		
		panelB.add(paddingQu, BorderLayout.CENTER);
		panelB.add(paddingAn, BorderLayout.SOUTH);
		
		// ===========================================================
		
		
		
		paddingA.add(panelA);
		paddingB.add(panelB);
		
		
		panel.add(paddingA, BorderLayout.NORTH);
		panel.add(paddingB, BorderLayout.CENTER);
		
		padding.add(panel);
		
		
		add(panel);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) throws Exception { // 파일 읽기와 관련된 내용 throws Exception
		// TODO Auto-generated method stub
		
		// 파일 읽기와 관련된 내용 
		try(BufferedReader in = new BufferedReader(new FileReader("/Users/skan/eclipse-workspace/sch/src/final_exam/quiz.txt")))
		{
		String line;
		while((line = in.readLine()) != null) // 한줄 씩 읽어온다.
			quiz_list.add(line); // ArrayList에 한줄식 문자열로 저장한다.
		} catch(IOException e) { // 오류 정정
			e.printStackTrace();
		}
		
		// 확인하려고 넣어놓은 코드
		// System.out.println(quiz_list);
		
		Final_sch gui = new Final_sch();
		

	}


}
