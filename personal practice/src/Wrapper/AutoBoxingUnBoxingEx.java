package Wrapper;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; // ÀÚµ¿ ¹Ú½Ì
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10; // ÀÚµ¿ ¾ð¹Ú½Ì
		System.out.println("m = " + m);
	}
}
