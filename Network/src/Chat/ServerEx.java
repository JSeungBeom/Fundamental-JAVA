package Chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		// ServerSocket 객체, 클라이언트로부터 접속 요청을 받으면 새로운 소켓의 연결을 만듦
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999); // 9999 포트로 서버 소켓 생성
			System.out.println("연결을 기다리고 있습니다....");
			socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
			System.out.print("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine(); // 클라이언트로부터 한 행 읽기
				if(inputMessage.equalsIgnoreCase("bye")) { 
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				System.out.println("클라이언트:" + inputMessage);
				System.out.print("보내기>>"); // 프롬프트
				String outputMessage = scanner.nextLine(); // 키보드에서 한 행 읽기
				out.write(outputMessage + "\n"); // 키보드에서 읽은 문자열 전송
				out.flush(); // out의 스트림 버퍼에 있는 모든 문자열 전송
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close(); // scanner 닫기
				socket.close(); // 소켓 닫기
				listener.close(); // 서버 소켓 닫기
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
		
	}
}
