package sec02.exam02_switch;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");
		} // string을 이용한 switch문
		// c++에서는 string을 switch문에 이용 못하지만, java는 가능하다
	}

}
