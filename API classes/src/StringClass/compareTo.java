package StringClass;

public class compareTo {

	public static void main(String[] args) {
		String java = "java";
		String cpp = "C++";
		// int compareTo() 메소드 : 문자열이 같으면 0 리턴
		// 비교 문자열보다 사전에 먼저 나오면 음수, 나중에 나오면 양수 리턴
		int res = java.compareTo(cpp); // java가 c++보다 사전에 나중에 나오므로 양수
		if(res == 0) 
			System.out.println("the same");
		else if(res < 0)
			System.out.println(java + " < " + cpp);
		else
			System.out.println(java + " > " + cpp);
	}
}
