package eleven;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyFrame extends JFrame {
JButton converter;
JButton canceler;
JTextArea textIn;
JTextArea textOut;

public MyFrame(){
super("텍스트 변환");


textIn = new JTextArea(12, 18);
textOut = new JTextArea(12, 18);
textIn.setLineWrap(true);
textOut.setLineWrap(true);
textOut.setEnabled(false);


JPanel textAreaPanel = new JPanel(new GridLayout(1, 2, 20, 20));
textAreaPanel.add(textIn);
textAreaPanel.add(textOut);


converter = new JButton("변환");
canceler = new JButton("취소");
converter.addActionListener(new ButtonActionListener());
canceler.addActionListener(new ButtonActionListener());


JPanel buttonPanel = new JPanel(new FlowLayout());
buttonPanel.add(converter);
buttonPanel.add(canceler);


JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
mainPanel.add(BorderLayout.CENTER, textAreaPanel);
mainPanel.add(BorderLayout.SOUTH, buttonPanel);


setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
add(mainPanel);
pack();
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
}


private class ButtonActionListener implements ActionListener{
@Override
public void actionPerformed(ActionEvent e) {

if(e.getSource() == converter){
textOut.setText("");
String result = toEnglish(textIn.getText());
textOut.append(result);
}
if(e.getSource() == canceler){
textOut.setText("");
}
}

private String toEnglish(String korean){
String result = korean;
result = result.replace("텍스트", "Text");
result = result.replace("영어", "English");
return result;
}
}
}
public class Pro3 {
public static void main(String[] args) {
new MyFrame();
}
}