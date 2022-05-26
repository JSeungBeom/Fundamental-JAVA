package JComboBox;

import javax.swing.*;
import java.awt.*;

public class ComboBoxEx extends JFrame {
	private String fruits[] = {"apple", "banana", "kiwi"};
	private String names[] = {"kitae", "jaemoon", "hyosoo", "namyun"};
	
	public ComboBoxEx() {
		setTitle("�޺��ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits); // �迭�� �޺��ڽ� ����
		c.add(strCombo);
		
		JComboBox<String>nameCombo = new JComboBox<String>();
		for(int i = 0; i <names.length;i++) {
			nameCombo.addItem(names[i]); // addItem() �޼ҵ�� ������ ���� ����
			c.add(nameCombo);
		}
		
		setSize(300, 300);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new ComboBoxEx();
	}
}
