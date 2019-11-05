public class SavingsAccount extends Account{
	private double interest;
	private double r=1;
	private double n=1;
	private int nryears=5;
	
	public SavingsAccount(int number,double interest) {
		super(number);
		this.interest = interest;
	}
	
	public double getInterest() {
		return interest;
	}
	
	public void deposit() {
		super.deposit(interest);
	}
	
	public double setInterest() {
		 double calcinterest;
		 double money = super.getBalance();
		 calcinterest = Math.pow(money*(1.0+r/n),nryears*n);
		 return calcinterest;
	}
	
	
	@Override
	
	public void deposit(double sum)
	{
		if(super.getBalance() != (double)0.0)
		super.deposit(interest);
		else
			super.deposit(sum);
	}
	
	public String toString() {
		return "CurrentAccount " + getAccountNumber() +": "+ " balance =" + getBalance();
	}
}