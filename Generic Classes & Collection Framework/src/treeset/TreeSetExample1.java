package treeset;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		// Binary Tree�� ������� �� Set �÷��� TreeSet
		TreeSet<Integer> scores = new TreeSet<Integer>();
		// *new Integer(int e)�� ���� ������ ȣ����, ���Ŀ� �������� ���� �����̹Ƿ�
		// Integer.valueOf(int e)�� ���� ȣ���� �ٶ����ϴ�
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(Integer.valueOf("75"));
		scores.add(Integer.valueOf(95));
		scores.add(80); // �ڵ� boxing
		
		Integer score = null;
		
		score = scores.first(); // ���� ���� �� ����
		System.out.println("���� ���� ����: " + score);
		
		score = scores.last(); // ���� ū �� ����
		System.out.println("���� ���� ����: " + score + "\n");
		
		
		score = scores.lower(new Integer(95)); // 95�� �̸��� ���� ����
		System.out.println("95�� �Ʒ� ����: " + score);
		
		score = scores.higher(new Integer(95)); // 95�� �ʰ��� ���� ����
		System.out.println("95�� ���� ����: " + score + "\n");
		
		score = scores.floor(new Integer(95)); // 95�� ������ ���� ����
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: " + score);
		
		score = scores.ceiling(new Integer(85)); // 85�� �̻��� ���� ����
		System.out.println("85�� �̰ų� �ٷ� ���� ����: " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst(); // ���� ���� ���� �����ϰ� ����
			System.out.println(score + "(���� ��ü ��: " + scores.size() + ")");
		}
	}

}
