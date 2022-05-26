package JLabel;

import javax.swing.*;
import java.awt.*;

public class JLabelEx extends JFrame {
	public JLabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����մϴ�."); // �ؽ�Ʈ�� ���� ���̺� ������Ʈ ����
		
		ImageIcon beauty = new ImageIcon("images/beauty.jpg"); // ImageIcon ��ü ���� (��θ�)
		JLabel imageLabel = new JLabel(beauty); // �̹����� ���� ���̺�
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		// �ؽ�Ʈ, �̹����� ��� ����ϴ� ���̺�, ������ ����
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", normalIcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelEx();
	}
}
