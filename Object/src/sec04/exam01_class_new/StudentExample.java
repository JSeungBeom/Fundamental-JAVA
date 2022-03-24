package sec04.exam01_class_new;

public class StudentExample {

	public static void main(String[] args) {
			Student s1 = new Student(); // new 연산자를 통한 Student 클래스의 s1 객체 생성
			System.out.println("s1 변수가 Student 객체를 참조합니다.");
			
			Student s2 = new Student(); // new 연산자를 통한 Student 클래스의 s2 객체 생성
			System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
