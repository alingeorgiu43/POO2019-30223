
public class LotteryOdds {

	public static void main(String[] args) {
		int a = 49;
		int b = 6;
		double odds = 1;
		for(int i=1; i<=b; i++) {
			odds = odds * (a-i+1) / i;
		}
		System.out.println("Sansele de castig la loterie " + Math.round(odds));
		
		

	}

}
