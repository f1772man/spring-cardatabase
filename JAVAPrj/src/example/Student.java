package example;

public class Student {
	private String name;
	private int age;
	private String subject;
	
	
	public Student(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public void displayStudentInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 전공: " + subject);
	}
}
