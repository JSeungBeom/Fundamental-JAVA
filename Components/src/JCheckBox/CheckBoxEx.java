package JCheckBox;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryicon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryicon = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("���"); // ���ڿ��� ���� üũ�ڽ�
		JCheckBox pear = new JCheckBox("��", true); // ���ڿ��� ���� üũ�ڽ�, �⺻ ������ ����
		// ���ڿ��� �̹����� ���� üũ�ڽ�, �⺻ üũ�ڽ� ����� �����Ƿ�
		// �������� ���� �̹����� ���� ����
		JCheckBox cherry = new JCheckBox("ü��", cherryicon);
		cherry.setBorderPainted(true); // ��輱 ����
		cherry.setSelectedIcon(selectedCherryicon); // ���õǾ��� ���� �̹���
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
