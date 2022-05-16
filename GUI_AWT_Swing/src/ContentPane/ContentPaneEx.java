package ContentPane;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	// 생성자
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		// 프레임을 닫을 때, 프로그램 실행이 종료 되도록 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컨테이너 : 다른 GUI 컴포넌트를 포함할 수 있는 컴포넌트
		// ContentPane : 화면에 출력될 모든 컴포넌트들이 부착되는 공간
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); // 배치관리자 FlowLayout으로 설정
		
		contentPane.add(new JButton("OK")); // 버튼 컴포넌트 추가
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
