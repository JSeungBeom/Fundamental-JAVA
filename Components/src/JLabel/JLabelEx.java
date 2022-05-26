package JLabel;

import javax.swing.*;
import java.awt.*;

public class JLabelEx extends JFrame {
	public JLabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다."); // 텍스트를 갖는 레이블 컴포넌트 생성
		
		ImageIcon beauty = new ImageIcon("images/beauty.jpg"); // ImageIcon 객체 생성 (경로명)
		JLabel imageLabel = new JLabel(beauty); // 이미지를 갖는 레이블
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		// 텍스트, 이미지를 모두 출력하는 레이블, 정렬을 지정
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelEx();
	}
}
