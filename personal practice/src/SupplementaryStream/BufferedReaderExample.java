package SupplementaryStream;

import java.io.*;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("�Է�: ");
		String lineString = br.readLine();
		
		System.out.println("���: " + lineString);
	}

}
