import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        //JPanel = a GUI component that function as a container to other components.
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0,250,250,250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,0,250);
        greenPanel.setLayout(null);



        ImageIcon newimage= new ImageIcon("starbucks.png");

        Border border = BorderFactory.createLineBorder(Color.black, 0x3);
        //JLabel = a GUI display area for a string of text, an image, or both
        JLabel label = new JLabel();//create a label
        label.setText("Order drinks");//set text of label
        label.setVisible(true);
        label.setIcon(newimage);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT, CENTER, RIGHT of image
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP, CENTER,BOTTOM of image.
        label.setForeground(Color.BLACK);//set font color of text
        label.setFont(new Font("Arial",Font.BOLD,20));//set font of text
        label.setIconTextGap(10);//set gap of text to image
        label.setBackground(Color.green);//set background color
        label.setOpaque(true);//to display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon +text within label
        label.setBounds(0,0,75,75);//set x,y position within frame as well as dimension

        //JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); //creates a frame
        frame.setVisible(true);// make frame visible
        frame.setSize(420, 420);// set x-dimension and y -dimension of frame
        frame.setTitle("Starbucks website");// set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setResizable(true);//prevent frame from being resized
        ImageIcon image = new ImageIcon("starbucks.png");//create an image icon
        frame.setIconImage(image.getImage());//change icon of frame
        frame.getContentPane().setBackground(Color.white);//change color of background
        //frame.setLayout(null);
       // frame.add(label);
        frame.pack();//must put "add label" before pack or else do not work.
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        redPanel.add(label);




    }
}
