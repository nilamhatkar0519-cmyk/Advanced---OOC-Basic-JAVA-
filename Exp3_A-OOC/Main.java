class BankAccount{

	double balance;

	BankAccount(double balance){
		this.balance = balance;
	}
	void deposite(double amount){
		balance += amount;
		System.out.println(" Your Deposite : " +amount);

	}
	void withdraw(double amount){
		balance -= amount;
		System.out.println(" Withdraw Amount : " +amount);
	}
}
class SavingAccount extends BankAccount{
	double balance;
	SavingAccount(double balance){
		 super(balance);
	}
	void withdraw(double amount){
		if (balance - amount < 100){
			System.out.println(" Minimum 100rs balance required " );
		}else{
			balance -= amount;
			System.out.println("Withdraw amount : " +amount);
		}
	}
}
		
class Main{
	public static void main( String[] args ) {
		SavingAccount SA = new SavingAccount(500);
		SA.deposite(200);
		SA.withdraw(550);
		System.out.println(" Balance : "+SA.balance);
	}
}