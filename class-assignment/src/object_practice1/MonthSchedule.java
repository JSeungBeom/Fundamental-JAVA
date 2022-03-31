package object_practice1;

import java.util.Scanner;

class Day{
	// 필드
	private String work;
	// 생성자
	
	// 메소드
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show(){
		if(work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}
public class MonthSchedule {
	// 필드
	private int nDays;
	private Day[] days;
	private Scanner scanner;
	
	// 생성자
	public MonthSchedule(int nDays) {
		scanner = new Scanner(System.in);
		this.nDays = nDays;
		this.days = new Day[nDays];
	}
	
	// 메소드
	private void input() {
		System.out.print("날짜(1~30)?");
		int num;
		num = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = scanner.next();

		days[num - 1].set(work);
	}
	private void view() {
		System.out.print("날짜(1~30)?");
		int num = scanner.nextInt();
		if(num < 1 || num > 30) {
			System.out.println("날짜 잘못 입력하였습니다.");
			return;
		}
		System.out.print(num + "일의 할 일은 ");
		days[num - 1].show();
	}
	private void finish() {
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
	public void run() {
		while(true) {
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
		int menu = scanner.nextInt();
		switch(menu) {
		case 1:
			input();
			break;
		case 2:
			view();
			break;
		case 3:
			finish();
			return;
		default:
			System.out.println("잘못 입력하였습니다.");
			System.out.println();
			break;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("이번달 스케쥴 관리 프로그램");
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
