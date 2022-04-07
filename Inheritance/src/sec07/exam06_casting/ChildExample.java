package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		// 부모 타입의 parent 참조 변수에 Child 객체를 Up-casting하여 대입
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 parent.field2 = "data2";
		 parent.method3();
		 자식 클래스의 Overriding되지 않은 메소드는 접근이 불가
		 */
		
		// Up-casting 되었던 parent를 다시 down-casting 
		Child child = (Child) parent;
		// Down-casting이 되었으니, Child 클래스의 멤버를 사용 가능
		child.field2 = "yyy";
		child.method3(); 
	}

}
