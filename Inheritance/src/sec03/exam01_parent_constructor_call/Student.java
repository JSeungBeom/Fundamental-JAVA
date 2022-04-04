package sec03.exam01_parent_constructor_call;

// People을 상속 받는 Student 클래스
public class Student extends People {
	// 필드
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // super()으로 부모 클래스의 생성자 호출(parameter를 갖는 생성자)
		this.studentNo = studentNo;
	}
}
