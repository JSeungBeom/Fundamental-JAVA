package generic_wildcard;

public class Person {
	// 필드
	private String name;
	
	// 생성자
	public Person(String name) {
		this.name = name;
	}
	
	// 메소드
	public String getName() {
		return name;
	}
	
	// Object 클래스의 toString 메소드 재정의
	public String toString() {
		return name;
	}
}
