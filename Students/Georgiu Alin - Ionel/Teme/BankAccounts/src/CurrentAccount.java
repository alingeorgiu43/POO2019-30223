
public class CurrentAccount extends Account{
	private double overdraft;
	
	public CurrentAccount(int number) {
		super(number);
	}
	
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}
	@Override
	public void withdraw(double sum) {
		if (super.getBalance() - sum > overdraft) {
			super.withdraw(sum);
		} else {
			System.out.println("CurrentAccount.withdraw(...): cannot withdraw this amount.");
		}
	}
	
}
