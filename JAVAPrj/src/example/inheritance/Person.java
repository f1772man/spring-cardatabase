package example.inheritance;

public class Person {
	String name;
	int age;
	
	void getDetail() {
		System.out.println(name + ":" + age);
	}
}

class Student extends Person{
	String studentId;
	public Student() {
		// TODO Auto-generated constructor stub
	}	
}

class Employee extends Person{
	String department;
}

class Teacher extends Person{
	String subject;
}