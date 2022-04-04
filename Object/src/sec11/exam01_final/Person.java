package sec11.exam01_final;

public class Person {
	// 필드
	final String nation = "Korea"; // final 필드, 값을 변경할 수 없다
	final String ssn;
	String name;
	
	// 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
