package example;

public class StockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 (instance) 생성
		Stock myStock = new Stock();
		
		myStock.itemName = "새우깡";
		myStock.quantity = 100;
		
		// 현재고
		System.out.println(myStock.itemName+"의 재고 : "+myStock.getStock());
		
		// 입고 + 50
		myStock.inStock(50);
		System.out.println(myStock.itemName+"의 재고 : "+myStock.getStock());
		
		// 출고 - 70
		myStock.outStock(70);
		System.out.println(myStock.itemName+"의 재고 : "+myStock.getStock());
	}

}
