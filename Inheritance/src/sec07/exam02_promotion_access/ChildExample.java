package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		// Up-casting을 통해, Parent 타입의 참조 변수 parent는 child 객체를 가리킨다.
		Parent parent = child; 
		
		// parent의 method1
		parent.method1();
		// Child 클래스에서 Overriding(재정의)된 메소드가 호출
		parent.method2();
		
		// parent.method3(); Child 클래스의 Overriding되지 않은 메소드에는 접근이 불가
	}

}
