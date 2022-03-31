package sec10.exam02_static_block;

public class Television {
	// static 필드
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	// static의 블록 단위 선언
	static {
		info = company + "-" + model;
	}
}
