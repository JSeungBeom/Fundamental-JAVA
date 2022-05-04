package MathClass;

// Math 클래스의 메소드들은 모두 static 메소드로 클래스 단위 호출이 가능
public class MathEx {
	public static void main(String[] args) {
		double a = Math.PI;
		System.out.println(Math.PI); // 원주율 상수 출력
		System.out.println(Math.ceil(a)); // ceil(올림)
		System.out.println(Math.floor(a)); // floor(내림)
		System.out.println(Math.sqrt(9)); // 제곱근
		System.out.println(Math.exp(2)); // e의 2승
		System.out.println(Math.round(3.14)); // 반올림
		
		// Math.random() 메소드는 0 <= x < 1의 실수를 발생
		// [1, 45] 사이의 정수형 난수 5개 발생
		System.out.println("이번주 행운의 번호는 ");
		for(int i = 0; i < 5; i++) {
			System.out.print((int)(Math.random()*45 + 1) + " ");
		}
	}
}
