
public class TV {
	String company;
	int year;
	int size;
	// 필드
	
	TV(String company, int year, int size){
		this.company = company;
		this.year = year;
		this.size = size;
	} // 생성자
	
	void show(){
		System.out.println(company + "에서 만든 " + year + "년형 " + size + "인치 TV");
	} // 출력 메소드
	
}
