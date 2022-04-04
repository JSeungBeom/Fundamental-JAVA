package sec13.exam03_field_method_access.package1;

public class B {
	// 생성자
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1; private 필드에 대한 접근 X
		
		a.method1();
		a.method2();
		//a.methode3(); private 메소드에 대한 접근 X
	}
}
