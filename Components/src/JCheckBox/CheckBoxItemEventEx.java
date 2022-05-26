package JCheckBox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox fruits[] = new JCheckBox[3]; // üũ�ڽ� �迭
	private String names[]	 = {"���", "��", "ü��"}; // String �迭
	private JLabel sumLabel; // ���̺�
	
	public CheckBoxItemEventEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));
		
		MyItemListener listener = new MyItemListener(); // ItemListener ��ü ����
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			// �� üũ�ڽ��� ������ ������ ������ �߰�, sum�� ���� ��ü���� ����
			// new MyItemListener()�� ���� ����Ͽ��ٸ�, sum�� ���� �ٸ� ��ü���� ����
			fruits[i].addItemListener(listener);
		}
		sumLabel = new JLabel("���� 0 �� �Դϴ�.");
		c.add(sumLabel);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		private int sum = 0; // ������ ��
		public void itemStateChanged(ItemEvent e) { // üũ�ڽ��� ����/���� ���°� ���ϴ� ���
			if(e.getStateChange() == ItemEvent.SELECTED) { // ���õǾ��� ��
				if(e.getItem() == fruits[0])
					sum += 100;
				else if(e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 20000;
			}
			else { // �����Ǿ��� ��
				if(e.getItem() == fruits[0])
					sum -= 100;
				else if(e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 20000;
			}
			sumLabel.setText("����" + sum + "�� �Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}
