package sec07.exam02_field_initialize;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("pby", "900212-2234567");
		// k1 객체를 생성하며, 생성자 함수 호출. name과 ssn을 해당 parameter로 초기화
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("dlwlrma", "930516-2654321");
		// 또 다른 k2 객체를 생성하고 생성자 함수 호출
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
	}
}
