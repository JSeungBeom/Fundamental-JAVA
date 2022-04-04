package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A {
	// A의 자식 클래스인 D는 다른 패키지여도 A의 protected 멤버에 접근이 가능하다
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
