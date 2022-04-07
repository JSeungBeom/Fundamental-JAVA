package sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// Up-casting으로 부모 클래스 타입의 참조 변수에 자식 객체 할당
		A a1 = b; // a <- b
		A a2 = c; // a <- c
		A a3 = d; // a <- b <- d
		A a4 = e; // a <- c <- e
		
		B b1 = d; // b <- d
		C c1 = e; // c <- e
		
		// B b3 = e; 상속 관계에 있지 않다. 
		// C c2 = d; 상속 관계에 있지 않다.
	}

}
