package Wrapper;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; // �ڵ� �ڽ�
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10; // �ڵ� ��ڽ�
		System.out.println("m = " + m);
	}
}
