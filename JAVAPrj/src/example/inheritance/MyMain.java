package example.inheritance;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.name = "홍길동";
		student.studentId = "Alll";
		
		student.getDetail();

		  
	  //질문 
	  //부모객체도 생성될까요?생성됨.
	  //순서는? 부모객체 먼저, 자식객체 나중
	  new Student(); //부모객체도 생성될까요?생성됨.
	  
	  
	  //다형성polymorphism
	  Student s = new Student();
	  s.name="길동";
	  s.age=10;
	  s.studentId="B111";
	  s.getDetail();
	  
	  Person p = s;
	  p.name="길동";
	  p.age=13;
	  p.getDetail();
	  //p.studentId;
	  
	  Student s2 = (Student)p;
	  s2.name="길동";
	  s2.age=10;
	  s2.studentId="B111";
	  s2.getDetail();
	  
	  //다형성polymorphism
	  Student s3=new Student();
	  s3.getDetail();
	  
	  Employee e1 = new Employee();
	  e1.getDetail();
	  
	  Teacher t1 = new Teacher();
	  t1.getDetail();
	  
	  //동적바인딩 (부모클래스의 메소드실행시에 자식메소드의 내용일 실행)
	  //자식클래스에서 재정의된 메소드는 부모타입으로 형변환하더라도 실행내용은 자식메소드내용
	  Person p3 = s3;
	  p3.getDetail();
	  
	  
	  
	  
	  
	}
}