package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A {
	// A�� �ڽ� Ŭ������ D�� �ٸ� ��Ű������ A�� protected ����� ������ �����ϴ�
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
