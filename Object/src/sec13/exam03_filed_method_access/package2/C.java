package sec13.exam03_filed_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	// ������
	public C() {
		A a = new A();
		a.field1 = 1; // public �ʵ� ����
 		// a.field2 = 1; default �ʵ� ����
		// a.field3 = 1; private �ʵ� ����
		
		a.method1(); // public �޼ҵ� ����
		// a.method2(); default �޼ҵ� ����
		// a.method3(); private �޼ҵ� ����
	}
	
}