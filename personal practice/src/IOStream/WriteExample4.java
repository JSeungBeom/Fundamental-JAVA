package IOStream;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test3.txt");
		String data = "dlwlrma wook";
		writer.write(data);
		writer.flush();
		writer.close();
	}
}
