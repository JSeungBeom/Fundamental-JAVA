package sec08.exam02_abstract_method;

// abstract 클래스 Animal
public abstract class Animal {
	// 필드
	public String kind;
	
	// 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// abstract 메소드, 선언만 하고 정의는 하지 않는다. 
	public abstract void sound();
}
