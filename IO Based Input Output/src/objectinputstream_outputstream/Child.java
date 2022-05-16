package objectinputstream_outputstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable {
	// �θ� Ŭ������ Serializable ���� X, �ڽ� Ŭ������ ����
	public String field2;
	
	// �θ� Ŭ������ �ʵ尡 private�� ���, getter / setter �޼ҵ� �̿�
	// writeObject()���� �θ� �ʵ� ����ȭ
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(field1); // �θ� �ʵ� ����ȭ
		out.defaultWriteObject(); // �ڽ� Ŭ���� �ʵ� ����ȭ (�⺻ WriteObject)
	}
	
	// readObject()���� �θ� �ʵ� ������ȭ
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		field1 = in.readUTF();
		in.defaultReadObject();
	}
}
