package JCheckBox;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryicon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherryicon = new ImageIcon("images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과"); // 문자열을 갖는 체크박스
		JCheckBox pear = new JCheckBox("배", true); // 문자열을 갖는 체크박스, 기본 값으로 선택
		// 문자열과 이미지를 갖는 체크박스, 기본 체크박스 모양이 없으므로
		// 선택했을 때의 이미지를 따로 삽입
		JCheckBox cherry = new JCheckBox("체리", cherryicon);
		cherry.setBorderPainted(true); // 경계선 설정
		cherry.setSelectedIcon(selectedCherryicon); // 선택되었을 때의 이미지
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
