package example;

public class Pen {
	String color = "black";
	int price;										// 멤버변수, int 정수 0, float/double 은 0.0으로 초기화
	
	public void write(int count) {
		int data = 1;								// 지역변수
		System.out.println("멈버변수 : " + price);		// 멈버변수 선언후 초기화 하지않으면 기본 초기값으로 자동 초기화
		System.out.println("지역변수 : " + data);		// 지역변수는 선언 후 초기화안하면 값을 읽을 때 오류
		System.out.println("매개변수 : " + count);
		System.out.println("Hello World");
	}

}
