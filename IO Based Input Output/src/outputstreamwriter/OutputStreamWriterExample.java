package outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/file1.txt");
		// ���� ��ȯ ���� ��Ʈ��, �ҽ� ��Ʈ���� ����Ʈ ��������� �����Ͱ� ������ ��� ���
		Writer writer = new OutputStreamWriter(fos); // OutputStream ��Ʈ���� ���ڷ� ����
		
		String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		writer.write(data); // String Ÿ������ �����͸� ��� ���� 
		
		writer.flush();
		writer.close();
		System.out.println("���� ������ �������ϴ�.");
	}

}
