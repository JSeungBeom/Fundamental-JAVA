package generic_extends_implements;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		// 타입 파라미터로 Tv, String, String을 갖는 객체 생성
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv()); // 부모 클래스 메소드
		product.setModel("SmartTV"); // 부모 클래스 메소드
		product.setCompany("Samsung"); // 자식 클래스 메소드
		
		// 인터페이스 Storage 타입 StorageImpl 객체 생성, 크기 100의 Tv 타입 배열 생성
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}

}
