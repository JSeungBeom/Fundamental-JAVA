package sec13.exam02_constructor_access.package2;

import sec13.exam02_consturctor_access_package1.A;

public class C {
	// 필드
	A a1 = new A(true); // public 생성자
	// A a2 = new A(1); // default 생성자, 다른 package에서 접근 불가
	// A a3 = new A("문자열"); // private 생성자, 다른 클래스에서 접근 불가
}
