package sec07.exam02_default_method_extends;

public class DefaultMethodExample {

	public static void main(String[] args) {
		// 익명 구현 객체 생성
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {

			}
			@Override
			public void method3() {
				
			}
		};
		
		ci1.method1();
		ci1.method2(); // ParentInterfacce의 method2() 호출
		ci1.method3();
		
		//-----------------------------------------------------------------------------------
		
		ChildInterface2 ci2 = new ChildInterface2(){
			@Override
			public void method1(){
				
			}
			public void method3(){
				
			}
		};
		ci2.method1();
		ci2.method2(); // ChildInterface2의 method2() 호출
		ci2.method3();
		
		//-----------------------------------------------------------------------------------
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				
			}
			@Override
			public void method2() {
				
			}
			@Override
			public void method3() {
				
			}
		};
		ci3.method1();
		ci3.method2(); // 위의 익명 구현 객체에서 재정의한 method2()가 호출 
		ci3.method3();
	}

}
