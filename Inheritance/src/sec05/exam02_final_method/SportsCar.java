package sec05.exam02_final_method;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/*
	final로 선언된 메소드를 Override 할 수 없다.
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}
