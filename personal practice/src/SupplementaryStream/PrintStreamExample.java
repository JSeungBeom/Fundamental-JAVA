package SupplementaryStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/file2.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("ss");
		ps.print("deq");
		
		ps.flush();
		ps.close();
		fos.close();
	}

}
