package project19;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class labellll {

	public static void main(String[] args) {
		ImageIcon image = new ImageIcon("download.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);
     
     JLabel label = new  JLabel(); // Create a label
     
     label.setText("PEOPLE CALL ME CAT"); // set text of label
     label.setIcon(image);
	 label.setHorizontalTextPosition(JLabel.CENTER);// set text top,center, bottom of imageicon
	 label.setVerticalTextPosition(JLabel.TOP);// set text top,center, bottom of iamgeicon
	 label.setForeground(new Color(0x00FF00));// set font color of text
	 label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font of text
	 label.setIconTextGap(-04);// sest gap of text to image
	 label.setBackground(Color.black);// set background color
	 label.setOpaque(true); // display backgroundd color
	 label.setBorder(border);
	 label.setVerticalAlignment(JLabel.CENTER);// set vertical position of icon+text within label
	 label.setHorizontalAlignment(JLabel.CENTER);// set horizontal position of icon+text within label
	 label.setBounds(100, 200, 250, 250);
	 
	 
	 JFrame frame = new JFrame();
	 
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setSize(500,500);
	 frame.setLayout(null);
	 frame.setVisible(true);
	 frame.add(label);
	 
	}

}
