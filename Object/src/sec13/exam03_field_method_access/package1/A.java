package sec13.exam03_field_method_access.package1;

public class A {
	// �ʵ�
	public int field1; // public �ʵ�
	int field2; // default �ʵ�
 	private int field3; // private �ʵ�
 	
 	// ������
 	public A() {
 		field1 = 1;
 		field2 = 1;
 		field3 = 1;
 		
 		method1();
 		method2();
 		method3();
 	}
 	
 	// �޼ҵ�
 	public void method1() {} // public �޼ҵ�
 	void method2() {} // default �޼ҵ�
 	private void method3() {} // private �޼ҵ�
}
