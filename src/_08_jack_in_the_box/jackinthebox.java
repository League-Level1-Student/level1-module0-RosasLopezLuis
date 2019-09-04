package _08_jack_in_the_box;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class jackinthebox implements ActionListener{
	int actions = 0;
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
	actions++;
	if(actions == 5) {
		showPicture("pic");
		playSound("soundFile");
	}
	//JOptionPane.showMessageDialog(null, "Surprise");
	
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
		}	else {
			Icon icon = new ImageIcon(imageURL);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}
	}catch (Exception e){
			System.err.println("Could not find " + "jackInTheBox.png");
			return new JLabel();
		}
	}
private void playSound(String soundFile) {
	try {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("homer-woohoo.wav"));
		sound.play();
	}	catch (Exception e) {
		e.printStackTrace();
	}
}
	
}

