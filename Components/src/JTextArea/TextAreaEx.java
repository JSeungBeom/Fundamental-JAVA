package JTextArea;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20); // 7 x 20의 입력 창
	
	public TextAreaEx() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
		c.add(tf);
		c.add(new JScrollPane(ta)); // JScrollPane 컴포넌트에 텍스트 에어리어를 삽입하여 스크롤바 지원
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 텍스트를 입력 후 엔터
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n"); // 텍스트 필드의 내용을 텍스트 에어리에에 추가
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
