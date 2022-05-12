package inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		// ���� ��ȯ ���� ��Ʈ��, �ҽ� ��Ʈ���� ����Ʈ ��� ��Ʈ�������� �����Ͱ� ������ ��� ���
		Reader reader = new InputStreamReader(is); // InputStream ��Ʈ���� ���ڷ� ����
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}

}
