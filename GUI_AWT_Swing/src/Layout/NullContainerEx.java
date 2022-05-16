package Layout;

import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame {
	
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); // 배치 관리자가 없는 컨테이너
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); // 절대 위치 지정
		la.setSize(200, 20); // 절대 크기 지정
		c.add(la);
		
		JLabel la2 = new JLabel("2nd label");
		la2.setLocation(200, 80);
		la2.setSize(60, 20);
		la2.setOpaque(true); // component의 색 변경을 위해서 필요한 메소드 setOpaque(true)
		la2.setBackground(Color.YELLOW);
		// la2.setBackground(new Color(0xffd400)); 16진수 값으로 색상 지정
		// la2.setBackground(new Color(255, 255, 0)); R,G,B 값으로 색상 지정
		c.add(la2);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼 생성
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b); // 버튼을 컨텐트팬에 부착
		}
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullContainerEx();
	}

}
