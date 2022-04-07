package sec07.exam07_instanceof;

public class InstanceofExample {
	// Down-casting이 유효한지 검사 후 진행
	public static void method1(Parent parent) {
		// parent 매개변수가 참조하는 객체가 Child 인지 조사
		if(parent instanceof Child) {
			Child child = (Child) parent; // parent 매개 변수를 Child 타입으로 down-casting
			System.out.println("method1 - Child로 변환 성공");
		}
		else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	// Down-casting 진행
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	public static void main(String[] args) {
		Parent parentA = new Child(); // Parent 타입의 Child 객체를 Up-casting 생성
		method1(parentA); // method1 호출
		method2(parentA); // method2 호출
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); // Up-casting 되지 않은 Parent 타입의 Parent 객체를 down-casting, 예외 발생
	}

}
