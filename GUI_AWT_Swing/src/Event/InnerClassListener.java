package Event;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new InnerClassListener();
	}
	
	// ���� Ŭ������ Action �̺�Ʈ ������ ����
	// �̺�Ʈ �����ʸ� Ư�� Ŭ���������� ����� �� ����
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");
			// ������ ���� ����� InnerClassListener�� ����� ȣ�� ����
			InnerClassListener.this.setTitle(b.getText());
		}
	}

}