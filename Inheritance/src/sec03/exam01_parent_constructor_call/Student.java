package sec03.exam01_parent_constructor_call;

// People�� ��� �޴� Student Ŭ����
public class Student extends People {
	// �ʵ�
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // super()���� �θ� Ŭ������ ������ ȣ��(parameter�� ���� ������)
		this.studentNo = studentNo;
	}
}
