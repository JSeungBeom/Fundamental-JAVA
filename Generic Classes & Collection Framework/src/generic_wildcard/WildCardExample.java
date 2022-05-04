package generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
	// 제네릭타입<?> : Unbounded Wildcards (제한없음)
	// 타입 파라미터를 대치, 모든 클래스나 인터페이스 타입 사용 가능
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getStudents()));
	}
	// 제네릭타입<? extends 상위 타입>
	// 해당 상위 타입과 이의 하위 타입이 사용 가능(Student, HighStudent)
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getStudents()));
	}
	
	// 제네릭타입<? super 하위타입>
	// 해당 하위 타입과 이의 상위 타입이 사용 가능(Worker, Person)
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + 
				Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		// 제네릭 타입 Course의 타입 파라미터를 Person으로 하는 객체 생성
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		// 모든 타입 파라미터를 갖는 Course 객체가 사용 가능
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		// Course 객체 중, 타입 파라미터로 Student와 그 하위 타입인 highStudent를 갖는 객체만 사용 가능
		// registerCourseStudent(personCourse);
		// registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		// Course 객체 중, 타입 파라미터로 Worker와 그 상위 타입인 Person을 갖는 객체만 사용 가능
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		// registerCourseWorker(studentCourse);
		// registerCourseWorker(highStudentCourse);
	}

}
