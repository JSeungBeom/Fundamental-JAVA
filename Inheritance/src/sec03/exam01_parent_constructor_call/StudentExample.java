package sec03.exam01_parent_constructor_call;

public class StudentExample {
	public static void main(String[] args) {
		// Student Ŭ������ ��ü ����, �θ� �����ڰ� ���� ����ǰ� (name, ssn) �ڽ� ������ ����
		Student student = new Student("ȫ�浿", "123456-1234567", 1);
		// People�� �ʵ� ȣ��
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		// Student�� �ʵ� ȣ��
		System.out.println("studentNo : " + student.studentNo);
	}
}
