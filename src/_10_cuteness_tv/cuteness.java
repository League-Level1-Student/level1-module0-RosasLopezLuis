package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.net.URI;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness implements ActionListener{

	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	public void cutenessMachine() {
		
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		frame.pack();
		button.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if(buttonPressed == button) {
			showDucks();
		}
		if(buttonPressed == button2) {
			showFrog();
		}
		if(buttonPressed == button3) {
			showFluffyUnicorns();
		}
}
	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}
	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
