package ContentPane;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	// ������
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		// �������� ���� ��, ���α׷� ������ ���� �ǵ��� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �����̳� : �ٸ� GUI ������Ʈ�� ������ �� �ִ� ������Ʈ
		// ContentPane : ȭ�鿡 ��µ� ��� ������Ʈ���� �����Ǵ� ����
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); // ��ġ������ FlowLayout���� ����
		
		contentPane.add(new JButton("OK")); // ��ư ������Ʈ �߰�
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
