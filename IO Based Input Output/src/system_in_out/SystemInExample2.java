package system_in_out;

import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws Exception{
		InputStream is = System.in; // InputStream Ÿ���� ������ System.in �ʵ� ����
		
		byte[] datas = new byte[100];
		
		System.out.print("�̸�: ");
		// �ѱ��� ���� ��, read() �޼ҵ�� 1����Ʈ ���� �����Ƿ� ������ �ʰ�
		// ��ü ������ ����Ʈ �迭�� �޾� String ��ü ���� �� �о�� ��
		int nameBytes = is.read(datas);
		// len�� -2�� �ϴ� ������ �о���� ���� \n\r�� �߰��Ǳ� ������, �̸� ���ܽ�Ű�� ���� 
		String name = new String(datas, 0, nameBytes-2); //
		
		System.out.print("�ϰ� ������: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("�Է��� �̸�: " + name);
		System.out.println("�Է��� �ϰ� ������: " + comment);
	}

}
