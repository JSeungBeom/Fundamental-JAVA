package JTextField;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 ")	);
		c.add(new JTextField(20)); // 엔터키가 입력되면 Action 이벤트 발생
		c.add(new JLabel("학과 "));
		c.add(new JTextField("컴퓨터공학과", 20)); // 초기 문자열과, 입력 창의 열의 개수 지정
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시 ...", 20));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldEx();
	}
}
