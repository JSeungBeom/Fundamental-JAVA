package IOStream;

import java.io.InputStream;

public class SystemInExample1 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		char inputChar = (char)is.read();
		System.out.println(inputChar);
	}

}
