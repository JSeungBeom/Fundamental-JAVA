package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String oldStrArray[] = {"java", "array", "copy"}; // 길이 3의 string 타입 배열
		String newStrArray[] = new String[5]; // 길이 5의 string 타입 배열을 new로 생성
		
		System.arraycopy(oldStrArray,  0, newStrArray, 0, oldStrArray.length);
		/* arraycopy(src_array, src_start, dest_array, dest_start, length) : 배열 복사 메소드
		 기본 타입 배열을 복사하는 경우, 새로운 객체 배열을 생성하여 deep copy를 진행하지만,
		 참조 타입 배열은 각 배열의 요소가 참조 변수로서, 또 string 객체를 참조하므로 결과적으로
		 arraycopy 메소드로 string 타입의 deep copy는 진행되지 않는다. */
		
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		} // string 타입 배열의 요소는 null(주소값)로 초기화된다
	}

}
