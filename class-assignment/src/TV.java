
public class TV {
	String company;
	int year;
	int size;
	// �ʵ�
	
	TV(String company, int year, int size){
		this.company = company;
		this.year = year;
		this.size = size;
	} // ������
	
	void show(){
		System.out.println(company + "���� ���� " + year + "���� " + size + "��ġ TV");
	} // ��� �޼ҵ�
	
}
