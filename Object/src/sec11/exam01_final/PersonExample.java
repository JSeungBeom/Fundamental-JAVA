package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("900212-2234567", "pby"); // 객체 생성
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";
		// p1.ssn = "930516-2654321";
		// final 필드의 값을 임의로 변경할 수 없기 때문에, 에러 발생
		p1.name = "dlwlrma";
		
	}

}
