package sec07.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface{
	// default 메소드 method2()를 재정의
	@Override
	public default void method2() {
		
	}
	public void method3();
}
