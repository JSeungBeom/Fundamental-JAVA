package IOStream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test3.txt");
		char[] data = "dlwlrma".toCharArray();
		for(int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		
		writer.flush();
		writer.close();
	}

}
