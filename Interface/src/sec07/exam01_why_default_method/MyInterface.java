package sec07.exam01_why_default_method;

public interface MyInterface {
	// �߻� �޼ҵ�
	public void method1();
	
	// default �޼ҵ�
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}