package sec10.exam02_static_block;

public class Television {
	// static �ʵ�
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	// static�� ��� ���� ����
	static {
		info = company + "-" + model;
	}
}
