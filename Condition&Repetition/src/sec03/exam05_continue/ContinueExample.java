package sec03.exam05_continue;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i =1; i<=10;i++) {
			if(i%2 != 0) {
				continue;
			} // i가 홀수라면 continue로 밑의 코드들을 스킵한다
			System.out.println(i);
		} // 결과적으로 짝수만 출력
	}

}
