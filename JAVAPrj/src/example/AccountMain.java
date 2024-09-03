package example;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account();
		
		myAccount.name = "홍길동";
		myAccount.accountNumber = "002-122-011420";
		myAccount.passwd = "12340";
		myAccount.balance = 380000;
		myAccount.interrest = 6.03F;
		
		
		myAccount.saveMoney(50000);
		long myBalance = myAccount.getBalance();
		System.out.println(myBalance);
		myAccount.withdrawMoney(80000);
		System.out.println(myAccount.getBalance());
	}

}
