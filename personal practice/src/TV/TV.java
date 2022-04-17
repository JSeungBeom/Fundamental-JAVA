package TV;

public class TV {
	private String company;
	private int year;
	private int size;
	
	TV(String company, int year, int size){
		this.company = company;
		this.year = year;
		this.size = size;
	}
	
	void show() {
		System.out.println(company + "에서 만든 " + year + "년형 " + size + "인치 TV");
	} 
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32	);
		myTV.show();
	}

}
