package generic_extends_implements;

// 제네릭 타입 Product를 상속 받는 클래스
// 자식 클래스에도 타입 파라미터를 기술해야 하며, 자식 클래스는 추가 타입 파라미터를 가질 수 있다.
public class ChildProduct<T, M, C> extends Product<T, M> {
	// 필드
	private C company;
	
	// 메소드
	public C getCompany() {
		return this.company;
	}
	
	public void setCompany(C company) {
		this.company = company;
	}
}
