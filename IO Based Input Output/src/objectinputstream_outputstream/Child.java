package objectinputstream_outputstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable {
	// 부모 클래스가 Serializable 구현 X, 자식 클래스만 구현
	public String field2;
	
	// 부모 클래스의 필드가 private인 경우, getter / setter 메소드 이용
	// writeObject()에서 부모 필드 직렬화
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(field1); // 부모 필드 직렬화
		out.defaultWriteObject(); // 자식 클래스 필드 직렬화 (기본 WriteObject)
	}
	
	// readObject()에서 부모 필드 역직렬화
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		field1 = in.readUTF();
		in.defaultReadObject();
	}
}
