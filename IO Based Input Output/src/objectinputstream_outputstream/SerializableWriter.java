package objectinputstream_outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		// 객체 직렬화 과정에서, static 필드와 transient 필드는 포함되지 않는다.
		classA.field3 = 3;
		classA.field4 = 4;
		oos.writeObject(classA);
		oos.flush();
		oos.close();
		fos.close();
		
	}

}
