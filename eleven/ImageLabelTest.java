package eleven;


import java.awt.*;
import javax.swing.*;

public class ImageLabelTest extends JFrame {

	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ImageLabelTest() {
		setTitle("Image lable test");
		setSize(400,150);
		
		panel = new JPanel();
		label = new JLabel("Dog");
		label.setFont(new Font("Arial", Font.ITALIC, 30));
		label.setForeground(Color.ORANGE);
		
		ImageIcon icon = new ImageIcon("/Users/skan/eclipse-workspace/images/Dog.gif");
		label.setIcon(icon);
		
		button = new JButton("자세한 벙보를 보려면 클릭하세요!");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageLabelTest t = new ImageLabelTest();
	}

}
