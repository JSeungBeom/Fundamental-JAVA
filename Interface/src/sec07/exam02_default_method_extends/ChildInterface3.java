package sec07.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface{
	// default 메소드였던 method2()를 다시 추상 메소드로 재정의
	@Override
	public void method2(); 
	
	public void method3();
}
