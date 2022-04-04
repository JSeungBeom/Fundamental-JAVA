package sec13.exam02_consturctor_access_package1;

public class A {
	// 琶球
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("庚切伸");
	
	// 持失切
	public A(boolean b) {} // public 持失切
	A(int b){} // default 持失切
	private A(String s) {} // private 持失切
}
