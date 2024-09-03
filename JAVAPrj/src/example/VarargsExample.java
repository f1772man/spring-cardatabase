package example;

public class VarargsExample {
	//가변인자를 이용하여 숫자들의 합을 계산하는 메서드
	public static int calculateSum(int ... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		//가변인자를 사용하여 메서드 호출
		int sum1 = calculateSum(1,2,3,4,5);
		int sum2 = calculateSum(10,20);
		int sum3 = calculateSum(8,2,5,7);
		
		//결과 출력
		System.out.println("첫 번째 합계: "+sum1);
		System.out.println("두 번째 합계: "+sum2);
		System.out.println("세 번째 합계: "+sum3);
		
	}
}