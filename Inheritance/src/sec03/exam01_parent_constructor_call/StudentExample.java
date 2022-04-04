package sec03.exam01_parent_constructor_call;

public class StudentExample {
	public static void main(String[] args) {
		// Student 클래스의 객체 생성, 부모 생성자가 먼저 실행되고 (name, ssn) 자식 생성자 실행
		Student student = new Student("홍길동", "123456-1234567", 1);
		// People의 필드 호출
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		// Student의 필드 호출
		System.out.println("studentNo : " + student.studentNo);
	}
}
