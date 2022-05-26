package JComponent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JComponentEx extends JFrame {
	public JComponentEx() {
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("Magenta/Yellow Button"); // 문자열을 갖는 버튼
		JButton b2 = new JButton(" Disable Button ");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW); // 배경색 설정
		b1.setForeground(Color.MAGENTA); // 글자색 설정
		b1.setFont(new Font("Arial", Font.ITALIC, 20)); // 폰트, 스타일, 크기 설정
		b2.setEnabled(false); // 버튼 비활성화
		b3.addActionListener(new ActionListener() { // ActionListener 인터페이스의 익명 구현 객체
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				// 컴포넌트의 최상위 컨테이너 얻어오기
				JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY()); // 타이틀에 버튼 좌표 출력
			}
		});
		c.add(b1); c.add(b2); c.add(b3);
		setSize(260, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEx();
	}

}
