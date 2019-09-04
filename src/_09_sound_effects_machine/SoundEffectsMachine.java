package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
		
	public void showMachine() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		frame.pack();
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		playSound("fileName");
	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("sawing-wood-daniel_simon.wav"));
		sound.play();
	}
	}





