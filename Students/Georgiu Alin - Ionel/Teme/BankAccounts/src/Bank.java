
public class Bank {
	private Account[] bankAccounts = null;
	private int total = 100;
	private int nrAccounts = 0;
	
	Bank(int index) {
		this.nrAccounts = index;
		this.bankAccounts = new Account[index];
	}

	public Account[] getAccount() {
		return bankAccounts;
	}

	public int getNumberOfAccounts() {
		return nrAccounts;
	}

	public void addAccount(Account account) {
		if (nrAccounts < total) {
			bankAccounts[nrAccounts] = account;
			nrAccounts++;
		} else {
			System.out.println("Ne pare rau , numarul de conturi pe care le poti crea a atins limita");
		}
	}

	public void closeAccount(int index) {
		for (int i = 0; i < nrAccounts; i++) {
			if (bankAccounts[i].getAccountNumber() == index) {
				{
					bankAccounts[i] = bankAccounts[nrAccounts - 1];
					nrAccounts--;
					return;
				}
			}
		}
	}

	public void payDivident(int sum) {
		for (int i = 0; i < nrAccounts; i++) {
			bankAccounts[i].deposit(sum);
		}
	}
}
