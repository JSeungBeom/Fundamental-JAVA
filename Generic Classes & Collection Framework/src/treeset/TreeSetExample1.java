package treeset;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		// Binary Tree를 기반으로 한 Set 컬렉션 TreeSet
		TreeSet<Integer> scores = new TreeSet<Integer>();
		// *new Integer(int e)와 같은 생성자 호출은, 추후에 지원되지 않을 예정이므로
		// Integer.valueOf(int e)와 같은 호출이 바람직하다
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(Integer.valueOf("75"));
		scores.add(Integer.valueOf(95));
		scores.add(80); // 자동 boxing
		
		Integer score = null;
		
		score = scores.first(); // 가장 작은 값 리턴
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last(); // 가장 큰 값 리턴
		System.out.println("가장 높은 점수: " + score + "\n");
		
		
		score = scores.lower(new Integer(95)); // 95점 미만의 점수 리턴
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(new Integer(95)); // 95점 초과의 점수 리턴
		System.out.println("95점 위의 점수: " + score + "\n");
		
		score = scores.floor(new Integer(95)); // 95점 이하의 점수 리턴
		System.out.println("95점 이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(new Integer(85)); // 85점 이상의 점수 리턴
		System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst(); // 가장 작은 값을 삭제하고 리턴
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
	}

}
