package example;
// 재고업무
// 상품명 : itemName
// 재고수량 : quantity
// 입고 : inStock() {}
// 출고 : outStock() {}
// 현재재고 : getStock() {}
public class Stock {
	public String itemName;
	public long quantity;
	
	public void inStock(long amount) {
		quantity = quantity + amount;
	}
	
	public void outStock(long amount) {
		quantity = quantity - amount;
	}
	
	public long getStock() {
		return quantity;
	}
}
