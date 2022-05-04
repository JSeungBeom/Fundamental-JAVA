package generic_extends_implements;

// ���׸� Ÿ�� Product�� ��� �޴� Ŭ����
// �ڽ� Ŭ�������� Ÿ�� �Ķ���͸� ����ؾ� �ϸ�, �ڽ� Ŭ������ �߰� Ÿ�� �Ķ���͸� ���� �� �ִ�.
public class ChildProduct<T, M, C> extends Product<T, M> {
	// �ʵ�
	private C company;
	
	// �޼ҵ�
	public C getCompany() {
		return this.company;
	}
	
	public void setCompany(C company) {
		this.company = company;
	}
}
