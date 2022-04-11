package sec07.exam01_why_default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2(); // 인터페이스 default 메소드 실행
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2(); // 구현 클래스에서 재정의 된 메소드 실행
		
		/* default 메소드는 필요에 따라 인터페이스에서 정의된 메소드를 실행하거나, 구현 클래스에서 재정의하여 사용하거나,
		 다시 추상 메소드로 선언할수 있다. 또한, 인터페이스에 메소드를 추가하고자 할 경우, 추상 메소드로 추가하면
		 모든 구현 클래스들에서 추상 메소드를 재정의해야 하지만, default 메소드는 필요에 따라 재정의 할수도 있고,
		 인터페이스의 그대로 사용할 수도 있다.
		 */
	}

}
