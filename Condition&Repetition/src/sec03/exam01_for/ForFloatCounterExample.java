package sec03.exam01_for;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		} // float 타입으로 for문을 실행하였을 때, 정확한 값을 얻기 힘들단
	}

}
