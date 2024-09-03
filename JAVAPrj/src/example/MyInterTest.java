package example;

public class MyInterTest {
	public static void main(String[] args) {
		
  MyFunctionalInterface mf = new MyFunClass();
		
		mf.myfun();
		
 //무명인터페이스구현체		
  MyFunctionalInterface mf2 = new MyFunctionalInterface(){
	
	@Override
	public void myfun() {
		System.out.println("구현체의 메소드2");
	}
};
    mf2.myfun();
    
    //
    MyFunctionalInterface mf3 = ()-> System.out.println("구현체의 메소드3");
  mf3.myfun();
        
	}
}
