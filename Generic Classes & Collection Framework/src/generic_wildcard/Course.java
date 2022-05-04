package generic_wildcard;

// T를 타입 파라미터로 하는 제네릭 타입 
public class Course<T> {
	// 필드
	private String name;
	private T[] students;
	
	// 생성자
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]); // 타입 파라미터 배열 생성
	}
	
	// 메소드
	public String getName() {
		return name;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
