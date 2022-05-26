package JRadioButton;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("������ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryicon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryicon = new ImageIcon("images/selectedCherry.jpg");
		
		// ��ư �׷쿡 ���� ��ư�� �߰��Ͽ�, �ߺ� ������ �Ұ����ϵ��� ��
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton cherry = new JRadioButton("ü��", cherryicon);
		cherry.setBorderPainted(true); // ��輱 ����
		cherry.setSelectedIcon(selectedCherryicon); // ������ư�� ���õǾ��� �� ��Ÿ�� �̹���
		
		// ��ư �׷쿡 ������ư �߰�
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
