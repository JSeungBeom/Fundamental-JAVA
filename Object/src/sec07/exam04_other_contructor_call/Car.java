package sec07.exam04_other_contructor_call;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	// 필드
	
	Car(){
		
	}
	
	Car(String model){
		this(model, null, 0);
	}
	// this() 메소드로 클래스 내의 다른 생성자를 호출
	Car(String model, String color){
		this(model, color, 0);
	}
	// this() 메소드로 클래스 내의 다른 생성자를 호출
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	// 호출되는 생성자
}
