package sec13.exam03_field_method_access.package1;

public class A {
	// 필드
	public int field1; // public 필드
	int field2; // default 필드
 	private int field3; // private 필드
 	
 	// 생성자
 	public A() {
 		field1 = 1;
 		field2 = 1;
 		field3 = 1;
 		
 		method1();
 		method2();
 		method3();
 	}
 	
 	// 메소드
 	public void method1() {} // public 메소드
 	void method2() {} // default 메소드
 	private void method3() {} // private 메소드
}
