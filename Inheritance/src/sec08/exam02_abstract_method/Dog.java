package sec08.exam02_abstract_method;

public class Dog extends Animal{
	// 积己磊
	public Dog() {
		this.kind = "器蜡幅";
	}
	
	@Override
	public void sound() {
		System.out.println("港港");
	}
}
