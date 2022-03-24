package sec06.exam02_field_default_value;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		// 객체 생성
		
		System.out.println("byteField : " + fiv.byteField); // 기본값 0
		System.out.println("shortField : " + fiv.shortField); // 기본값 0
		System.out.println("intField : " + fiv.intField); // 기본값 0
		System.out.println("longField : " + fiv.longField); // 기본값 0
		System.out.println("booleanField : " + fiv.booleanField); // 기본값 false
		System.out.println("charField : " + fiv.charField); // // 기본값 공백
		System.out.println("floatField : " + fiv.floatField); // 기본값 0.0
		System.out.println("doubleField : " + fiv.doubleField); // 기본값 0.0
		System.out.println("arrField : " + fiv.arrField); // 기본값 null
		System.out.println("referenceField : " + fiv.referenceField); // 기본값 null

	}

}
