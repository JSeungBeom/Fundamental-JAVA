
public class Grade {
	int math;
	int science;
	int english;
	// �ʵ�
	
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	} // ������
	
	double average() {
		double sum = math + science + english;
		return sum / 3;
	} // ����, ����, ���� ������ ����� �����ϴ� �޼ҵ�
}
