package Wrapper;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		// delimiter /�� �������� ��ū ����
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens(); // ��ū�� �� ��ȯ
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken(); // ���� ��ū ����
			System.out.println(token);
		}
		
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) { // ��ū�� ���Ҵٸ� true, �ƴϸ� false
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
