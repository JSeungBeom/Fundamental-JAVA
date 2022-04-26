package a;

class ArrayUtil{
	public static int[]concat(int a[], int b[]){
		int temp[] = new int[a.length + b.length];
		for(int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		for(int i = a.length; i < a.length + b.length; i++) {
			temp[i] = b[i - a.length];
		}
		return temp;
	}
	public static void print(int[] a) {
		System.out.print("[ ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
	}
}

public class StaticEx {

	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3); // static 메소드는 객체 외부의 메소드로 클래스 단위 사용 가능
	}

}
