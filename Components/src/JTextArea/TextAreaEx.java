package JTextArea;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20); // 7 x 20�� �Է� â
	
	public TextAreaEx() {
		setTitle("�ؽ�Ʈ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�Է� �� <Enter> Ű�� �Է��ϼ���."));
		c.add(tf);
		c.add(new JScrollPane(ta)); // JScrollPane ������Ʈ�� �ؽ�Ʈ ���� �����Ͽ� ��ũ�ѹ� ����
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // �ؽ�Ʈ�� �Է� �� ����
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n"); // �ؽ�Ʈ �ʵ��� ������ �ؽ�Ʈ ������� �߰�
				t.setText("");
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}
}
