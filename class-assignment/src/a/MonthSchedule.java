package a;

import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		}
		else
			System.out.println(work + "입니다.");
	}
}
public class MonthSchedule {
	private int nDays;
	private Day[] days;
	private Scanner scanner;
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays];
		for(int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		scanner = new Scanner(System.in);
	}
	
	private void input() {
		System.out.print("날짜(1~30)?");
		int day = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = scanner.next();
		day--;
		if(day < 0 || day > nDays) {
			System.out.println("날짜 잘못 입력하였습니다.!");
		}
		else
		days[day].set(work);
	}
	
	private void view() {
		System.out.print("날짜(1~30)?");
		int day = scanner.nextInt();
		day--;
		if(day < 0 || day < nDays) {
			System.out.println("날짜 잘못 입력하였습니다.!");
			return;
		}
		System.out.print((day + 1) + "일의 할 일은 ");
		days[day].show();
	}
	
	private void finish() {
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
		int num = scanner.nextInt();
		switch(num) {
		case 1:
			input();
			System.out.println();
			break;
		case 2:
			view();
			System.out.println();
			break;
		case 3:
			finish();
			return;
			default:
				System.out.println("잘못 입력하였습니다.");
				System.out.println();
		}
		}
	}
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
