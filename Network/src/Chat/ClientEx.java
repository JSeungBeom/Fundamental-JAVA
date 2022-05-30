package Chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999); // Ŭ���̾�Ʈ ���� ����, ������ ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("������>>"); // ������Ʈ
				String outputMessage = scanner.nextLine(); // Ű���忡�� �� �� �б�
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n"); // bye ���ڿ� ����
					out.flush();
					break;
				}
				out.write(outputMessage + "\n"); // Ű���忡�� ���� ���ڿ� ����
				out.flush(); // out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
				String inputMessage = in.readLine(); // �����κ��� �� �� ����
				System.out.println("����: " + inputMessage);
			}
		} catch(IOException e){
			System.out.println(e.getMessage());
		} finally { // ���� �߻� ���ο� ���� ���� ����Ǵ� ����
			try {
				scanner.close();
				if(socket != null) socket.close(); // Ŭ���̾�Ʈ ���� �ݱ�
			} catch(IOException e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}

}