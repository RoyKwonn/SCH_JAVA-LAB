package ten;

import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Distance extends JFrame implements ActionListener{

	private JButton  button1;
    private JLabel label;
    private JTextField field1;
    private JTextField field2;
    private JLabel label2;
	Distance()
	{
		setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mile -> Km");
        
        label = new JLabel("마일을 입력하시오");
        field1 = new JTextField(10);
        label2 = new JLabel("->");
        field2 = new JTextField(10);
        button1 = new JButton("변환");
        button1.addActionListener(this);
        JPanel panel = new JPanel();
       
        panel.add(label);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(button1);
        
       
        add(panel);
       
        setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent g) {
        // TODO Auto-generated method stub
		if(g.getSource() == button1)
        {
			field2.setText(Double.parseDouble(field1.getText())*1.6 + " km");
        }
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Distance f = new Distance();
	}

}



