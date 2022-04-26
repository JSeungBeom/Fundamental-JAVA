package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		// 열거 타입의 name 메소드
		// 열거 타입 변수에 저장된 문자열을 반환
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		// ordinal() 메소드 : 열거 타입 변수의 순번을 리턴 (0부터 시작)
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		// compareTo() 메소드 : 열거 타입 상수끼리의 상대 위치를 계산하여 리턴

		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			}
			else {
				System.out.println("평일 이군요");
			}
		} // valueOf() 메소드 : 주어진 문자열의 열거 객체를 리턴
		
		Week days[] = Week.values();
		for(Week day : days){
			System.out.println(day);// values() 메소드 : 모든 열거 객체들을 배열로 리턴
		}
	}

}
