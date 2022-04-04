package sec06.exam01_protected.package1;

// 같은 패키지 내의 클래스 B에서 protected 멤버들에 접근이 가능하다
public class B {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
