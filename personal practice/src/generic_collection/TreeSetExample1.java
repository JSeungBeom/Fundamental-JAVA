package generic_collection;

import java.util.*;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("���� ���� ����: " + score);
		
		score = scores.last();
		System.out.println("���� ���� ����: " + score);
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score);
		}
	}
}
