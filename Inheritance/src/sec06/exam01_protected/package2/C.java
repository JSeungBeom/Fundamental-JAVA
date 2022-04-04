package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class C {
	public void method() {
		/*
		자식 클래스가 아닌 다른 패키지의 클래스 C는 A의 protected 멤버에 접근 불가능하다
		A a = new A();
		a.field = "value";
		a.method();
		*/
	}
}
