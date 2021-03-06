package ObjectsClass;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2)); // o1.equals(o2)와 동일
		System.out.println(Objects.equals(o1, null)); // false
		System.out.println(Objects.equals(null, o2)); // false
		System.out.println(Objects.equals(null, null)); // true
		System.out.println(Objects.deepEquals(o1, o2) + "\n"); // o1.equals(o2)와 동일
		
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		System.out.println(Objects.equals(arr1, arr2)); // arr1.equals(arr2)와 동일, false
		System.out.println(Objects.deepEquals(arr1, arr2)); // Arrays.deepEquals(a, b)
		System.out.println(Arrays.deepEquals(arr1, arr2)); // 비교 객체 배열 -> 항목 값 비교
		System.out.println(Objects.deepEquals(null, arr2)); // false
		System.out.println(Objects.deepEquals(arr1, null)); // false
		System.out.println(Objects.deepEquals(null, null)); // true
	}
}
