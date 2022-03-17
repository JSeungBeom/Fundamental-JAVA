package sec06.exam06_array_reference_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String strArray[] = new String[3];
		// string 타입의 배열 생성
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		// strArray[2]에는 새로운 String 객체를 생성하여 저장
		
		System.out.println(strArray[0] == strArray[1]);
		// 두 참조 변수는, 같은 객체를 가리키므로 true	
		System.out.println(strArray[0] == strArray[2]);
		// 두 참조 변수는, 다른 객체를 가리키므로 false	
		System.out.println(strArray[0].equals(strArray[2]));
		// 두 배열 요소의 문자열은 동일하므로 true
	}

}
