package sec08.exam02_abstract_method;

public class Cat extends Animal {
	// ������
	public Cat() {
		this.kind = "������";
	}
	
	// abstract �޼ҵ��� sound()�� �ڽ� Ŭ�������� �������Ͽ� ���
	// abstract Ŭ������ �ڽ� Ŭ���� ��ü�� �����ϱ� ���ؼ��� �ݵ�� abstract �޼ҵ带 �����ؾ� �Ѵ�.
	// abstract �޼ҵ带 ������ ���� ���� ���, �ڽ� Ŭ���� ���� abstract Ŭ�����̾�� �Ѵ�.
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}
