package object_practice1;

class ArrayUtil{
	// 메소드
	// 두 배열을 연결하는 static 메소드
	public static int [] concat(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for(int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}
		return c;
		}
	//  배열을 출력하는 static 메소드
	public static void print(int[] a) {
		System.out.print("[");
		for(int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}
		System.out.print("]");
	}
}
public class StaticEx {
	public static void main(String[] args) {
		int array1[] = {1, 5, 7, 9};
		int array2[] = {3, 6, -1, 100, 77, 22, 33, 44, 55};
		// static 메소드를 클래스 단위에서 호출하여 사용
		int array3[] = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
