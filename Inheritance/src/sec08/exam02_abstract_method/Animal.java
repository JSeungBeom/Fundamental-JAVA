package sec08.exam02_abstract_method;

// abstract Ŭ���� Animal
public abstract class Animal {
	// �ʵ�
	public String kind;
	
	// �޼ҵ�
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	// abstract �޼ҵ�, ���� �ϰ� ���Ǵ� ���� �ʴ´�. 
	public abstract void sound();
}
