package sec07.exam01_why_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2(); // �������̽� default �޼ҵ� ����
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2(); // ���� Ŭ�������� ������ �� �޼ҵ� ����
		
		/* default �޼ҵ�� �ʿ信 ���� �������̽����� ���ǵ� �޼ҵ带 �����ϰų�, ���� Ŭ�������� �������Ͽ� ����ϰų�,
		 �ٽ� �߻� �޼ҵ�� �����Ҽ� �ִ�. ����, �������̽��� �޼ҵ带 �߰��ϰ��� �� ���, �߻� �޼ҵ�� �߰��ϸ�
		 ��� ���� Ŭ�����鿡�� �߻� �޼ҵ带 �������ؾ� ������, default �޼ҵ�� �ʿ信 ���� ������ �Ҽ��� �ְ�,
		 �������̽��� �״�� ����� ���� �ִ�.
		 */
	}

}
