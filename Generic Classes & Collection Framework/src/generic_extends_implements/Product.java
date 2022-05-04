package generic_extends_implements;

public class Product <T, M> {
	// 필드
	private T kind;
	private M model;
	
	// 메소드
	public T getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
}
