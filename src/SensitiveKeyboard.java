import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SensitiveKeyboard {

public static void main(String[] args) {
//	keyPressed();
	speak("");
	//JOptionPane.showMessageDialog(null, "ouch");
}

static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say "+ words).waitFor();
	}catch (Exception e) {
		e.printStackTrace();
	}
}
static void keyPressed(String key) {
	
}
	
}

