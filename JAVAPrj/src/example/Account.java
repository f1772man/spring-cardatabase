package example;

public class Account {
	// 변수 선언
	public String name;
	public String accountNumber;
	public String passwd;
	public long balance;
	public float interrest;
	
	public void saveMoney(long amount) {
		balance = balance + amount;
	}
	public void withdrawMoney(long amount) {
		balance = balance - amount;
	}
	public long getBalance() {
		return balance;
	}
}
