package sec08.exam01_abstract_class;

public class SmartPhone extends Phone{
	// ������
	public SmartPhone(String owner){
		super(owner); // ���� Ŭ����(�θ� Ŭ����)�� ������ ȣ��
	}
	
	// �޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}
