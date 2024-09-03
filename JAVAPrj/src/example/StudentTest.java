package example;

import example.inheritance.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("홍길동", 20, "컴퓨터 공학");
		Student student2 = new Student("김철수", 22, "전자 공학");
		
		System.out.println("첫번째 학생 정보");
		student1.displayStudentInfo();
		
		System.out.println("첫번째 학생 정보");
		student2.displayStudentInfo();
	}

}
