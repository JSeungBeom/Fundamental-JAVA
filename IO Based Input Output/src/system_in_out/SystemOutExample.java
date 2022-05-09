package system_in_out;

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {
		// System.out �ʵ�� PrintStream Ÿ���� ��� ��Ʈ��
		// �ƽ�Ű �ڵ带 ����ϸ� �ֿܼ��� ���ڰ� ���
		// ���ڿ��� ����Ϸ��� ����Ʈ �迭�� ���� ��
		OutputStream os = System.out;
		
		for(byte b=48; b<58; b++) {
			os.write(b);
		}
		os.write(10); // \n
		
		for(byte b=97; b<123; b++) {
			os.write(b);
		}
		os.write(10);
		
		String hangul = "�����ٶ󸶹ٻ������īŸ����";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}
}
