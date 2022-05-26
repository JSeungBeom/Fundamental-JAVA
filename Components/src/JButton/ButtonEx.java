package JButton;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalicon = new ImageIcon("images/normalicon.gif");
		ImageIcon rollovericon = new ImageIcon("images/rollovericon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedicon.gif");
		
		JButton btn = new JButton("call~~", normalicon); // ���ڿ��� �̹����� ���� ��ư
		btn.setPressedIcon(pressedIcon); // ��ư�� ������ ���� �̹����� ����ϴ� ��ư�� �޼ҵ�
		btn.setRolloverIcon(rollovericon); // ��ư�� ���콺�� �ö� �� �̹����� ����ϴ� ��ư�� �޼ҵ�
		
		c.add(btn);
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonEx();
	}
}
