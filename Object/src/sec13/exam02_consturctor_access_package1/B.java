package sec13.exam02_consturctor_access_package1;

public class B {
	// 필드
	A a1 = new A(true); // public 생성자에 접근
	A a2 = new A(1); // default 생성자에 접근
	// A a3 = new A("문자열"); private 생성자에 접근, private은 자신의 클래스 내에서만 사용 가능
}
