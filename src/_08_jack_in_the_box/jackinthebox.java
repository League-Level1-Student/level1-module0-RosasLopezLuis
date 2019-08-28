package _08_jack_in_the_box;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class jackinthebox implements ActionListener{
	public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
	}
@Override
	public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, "Surprise");
	
}
private void showPicture(String pic) {
	try {
			JLabel imageLabel = createLabelImage("jackInTheBox.png");
			JFrame imageFrame = new JFrame();
			imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			imageFrame.add(imageLabel);
			imageFrame.setVisible(true);
			imageFrame.pack();
	}
	catch (Exception e) {
		e.printStackTrace();
		}
	}
private JLabel createLabelImage(String pic) {
	try {
		URL imageURL = getClass().getResource("jackInTheBox.png");
		if(imageURL == null) {
			System.err.println("Could not find" + "jackInTheBox.png");
			return new JLabel();
		}
		catch (Exception e){
			System.err.println("Could not find ");
			
		}
	}
	
}
}


