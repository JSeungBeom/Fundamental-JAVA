package ObjectsClass;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		// 물리적으로는 다른 객체를 참조하므로, 해쉬코드가 다르지만 
		// hashCode() 메소드 재정의를 통해, 논리적으로 동등
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student{
		int sno;
		String name;
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		
		// 필드 값들로 hashCode 생성하여 return 하도록 Object 클래스의 hashCode() 메소드 재정의
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}
}


