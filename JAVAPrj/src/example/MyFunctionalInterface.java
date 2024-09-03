package example;

//인터페이스는 기본적으로 생성자 없음.
//구현체를 만들어서 대입사용
//신텍스 체크
@FunctionalInterface
public interface MyFunctionalInterface {
	void myfun();
	//int yourfun();
}

//구현체(상속해서 추상메소드를 재정의 {})
class MyFunClass implements MyFunctionalInterface{
	MyFunClass(){}
	
	@Override
	public void myfun() {
		System.out.println("구현체의 메소드");
	}

}