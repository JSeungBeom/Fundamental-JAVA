package Object;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode()); // 재정의된 Object 클래스의 hashCode() 호출
		System.out.println(Objects.hashCode(s2)); // 내부적으로 s2.hashCode() 호출 
		// 결과적으로 같은 결과
	}
	
	static class Student{
		int sno;
		String name;
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno, name); // 매개값으로 해시코드를 생성하는 역할
		}
	}
}
