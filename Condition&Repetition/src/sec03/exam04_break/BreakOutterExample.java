package sec03.exam04_break;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				} // break���� ���Ͽ� �ѹ��� for�� ���� ���� Ż���� �� �ִ�.
				// c++�� goto�� ����� ����
			}
		}
		System.out.println("���α׷� ���� ����");
	}

}
