package StringTokenizerClass;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// StringTokenizer ��ü�� delimiter�� ��������, ���ڿ��� �����Ͽ� ��ū���� ��ü�� ����
		StringTokenizer st = new StringTokenizer("ȫ�浿/¡ȭ/ȫ��/����/����", "/");
		while(st.hasMoreTokens()) // ��Ʈ�� ��ũ�������� ��ū�� �����ִ��� �Ǵ�
			System.out.println(st.nextToken()); // ��Ʈ�� ��ũ������ ��ü�� ���� ��ū�� ����
	}
}
