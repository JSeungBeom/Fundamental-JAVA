package object_practice1;

import java.util.Scanner;

class Day{
	// �ʵ�
	private String work;
	// ������
	
	// �޼ҵ�
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show(){
		if(work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}
}
public class MonthSchedule {
	// �ʵ�
	private int nDays;
	private Day[] days;
	private Scanner scanner;
	
	// ������
	public MonthSchedule(int nDays) {
		scanner = new Scanner(System.in); // ��ĳ�� �ʱ�ȭ
		this.nDays = nDays;
		this.days = new Day[nDays]; // ��ü �迭 ����
		// * ��ü �迭�� �� ���Ҹ� �ʱ�ȭ
		for(int i = 0; i < days.length; i++) {
			days[i] = new Day();
		} 
	}
	
	// �޼ҵ�
	
	// �� ���� �Է��ϴ� �޼ҵ�
	private void input() {
		System.out.print("��¥(1~30)?");
		int num;
		num = scanner.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String work = scanner.next();
		if(num < 1 || num > 30) {
			System.out.println("��¥ �߸� �Է��Ͽ����ϴ�.");
			System.out.println();
			return;
		}
		days[num - 1].set(work);
	}
	// �� ���� ���� �޼ҵ�
	private void view() {
		System.out.print("��¥(1~30)?");
		int num = scanner.nextInt();
		if(num < 1 || num > 30) {
			System.out.println("��¥ �߸� �Է��Ͽ����ϴ�.");
			System.out.println();
			return;
		}
		System.out.print(num + "���� �� ���� ");
		days[num - 1].show();
	}
	// ���α׷� ����
	private void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		scanner.close();
	}
	// ���� �޼ҵ�
	public void run() {
		while(true) {
		System.out.print("����(�Է�:1, ����:2, ������:3) >> ");
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
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			System.out.println();
			break;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("�̹��� ������ ���� ���α׷�");
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}