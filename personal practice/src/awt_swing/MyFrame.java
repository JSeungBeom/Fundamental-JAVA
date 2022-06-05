package awt_swing;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300");
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}

}
