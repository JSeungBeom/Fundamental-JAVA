package sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// ��ü ����
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// Up-casting���� �θ� Ŭ���� Ÿ���� ���� ������ �ڽ� ��ü �Ҵ�
		A a1 = b; // a <- b
		A a2 = c; // a <- c
		A a3 = d; // a <- b <- d
		A a4 = e; // a <- c <- e
		
		B b1 = d; // b <- d
		C c1 = e; // c <- e
		
		// B b3 = e; ��� ���迡 ���� �ʴ�. 
		// C c2 = d; ��� ���迡 ���� �ʴ�.
	}

}
