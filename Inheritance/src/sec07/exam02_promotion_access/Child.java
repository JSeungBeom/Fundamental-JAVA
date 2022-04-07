package sec07.exam02_promotion_access;

public class Child extends Parent{
	// Parent 클래스를 상속 받아, Overriding 된 메소드
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
