
public class Grade {
	int math;
	int science;
	int english;
	// 필드
	
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	} // 생성자
	
	double average() {
		double sum = math + science + english;
		return sum / 3;
	} // 수학, 과학, 영어 점수의 평균을 리턴하는 메소드
}
