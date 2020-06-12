package eleven;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends JPanel {
    static JFrame frame;

    static String birdString = "Bird";
    static String catString = "Cat";
    static String dogString = "Dog";
    static String rabbitString = "Rabbit";
    static String pigString = "Pig";

    JLabel picture;

    public RadioButtonDemo() {

        JRadioButton birdButton = new JRadioButton(birdString);
        birdButton.setMnemonic('b');
        birdButton.setActionCommand(birdString);
        birdButton.setSelected(true);

        JRadioButton catButton = new JRadioButton(catString);
        catButton.setMnemonic('c');
        catButton.setActionCommand(catString);

        JRadioButton dogButton = new JRadioButton(dogString);
        dogButton.setMnemonic('d');
        dogButton.setActionCommand(dogString);

        JRadioButton rabbitButton = new JRadioButton(rabbitString);
        rabbitButton.setMnemonic('r');
        rabbitButton.setActionCommand(rabbitString);

        JRadioButton pigButton = new JRadioButton(pigString);
        pigButton.setMnemonic('p');
        pigButton.setActionCommand(pigString);

        // Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Register a listener for the radio buttons.
        RadioListener myListener = new RadioListener();
        birdButton.addActionListener(myListener);
        catButton.addActionListener(myListener);
        dogButton.addActionListener(myListener);
        rabbitButton.addActionListener(myListener);
        pigButton.addActionListener(myListener);

        // Set up the picture label
        picture = new JLabel(new ImageIcon("/Users/skan/eclipse-workspace/images/Bird.gif"));

        // The preferred size is hard-coded to be the width of the
        // widest image and the height of the tallest image.
        // A real program would compute this.
        picture.setPreferredSize(new Dimension(177, 122));


        // Put the radio buttons in a column in a panel
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(0, 1));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        setLayout(new BorderLayout());
        add(radioPanel, "West");
        add(picture, "Center");
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }


    /** Listens to the radio buttons. */
    class RadioListener implements ActionListener { 
        public void actionPerformed(ActionEvent e) {
            picture.setIcon(new ImageIcon("/Users/skan/eclipse-workspace/images/"+ e.getActionCommand()+".gif"));
        }
    }

    public static void main(String s[]) {
         WindowListener l = new WindowAdapter() {
             public void windowClosing(WindowEvent e) {System.exit(0);}
         };
 
         frame = new JFrame("RadioButtonDemo");
         frame.addWindowListener(l);
         frame.getContentPane().add("Center", new RadioButtonDemo());
         frame.pack();
         frame.setVisible(true);
    }
}