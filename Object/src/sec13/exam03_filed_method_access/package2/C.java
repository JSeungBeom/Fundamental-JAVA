package sec13.exam03_filed_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	// 생성자
	public C() {
		A a = new A();
		a.field1 = 1; // public 필드 접근
 		// a.field2 = 1; default 필드 접근
		// a.field3 = 1; private 필드 접근
		
		a.method1(); // public 메소드 접근
		// a.method2(); default 메소드 접근
		// a.method3(); private 메소드 접근
	}
	
}
