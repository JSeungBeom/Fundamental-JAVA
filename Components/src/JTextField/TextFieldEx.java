package JTextField;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		setTitle("�ؽ�Ʈ�ʵ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�̸� ")	);
		c.add(new JTextField(20)); // ����Ű�� �ԷµǸ� Action �̺�Ʈ �߻�
		c.add(new JLabel("�а� "));
		c.add(new JTextField("��ǻ�Ͱ��а�", 20)); // �ʱ� ���ڿ���, �Է� â�� ���� ���� ����
		c.add(new JLabel("�ּ�"));
		c.add(new JTextField("����� ...", 20));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldEx();
	}
}
