package MultiThread;

public class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance)
	{
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		
	}
	
	public void deposit(int amount)//잔고에 입금된 경우 
	{
		this.balance += amount;
	}
	
	public int withdraw(int amount)//출금된 경우 
	{
		if(balance < amount)//잔액이 부족할 경우 0을 반환
		{
			return 0;
		}
		balance -= amount;
		return amount;
	}

}
