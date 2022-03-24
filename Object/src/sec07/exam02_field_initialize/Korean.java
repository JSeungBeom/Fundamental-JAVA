package sec07.exam02_field_initialize;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	// 필드
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		// 메소드의 parameter와 필드의 이름이 동일할 경우 this를 이용하여 둘을 구분 
	}
}
