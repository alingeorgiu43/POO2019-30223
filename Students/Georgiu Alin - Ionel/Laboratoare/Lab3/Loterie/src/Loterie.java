public class Loterie extends LoterryChances {

	public static void main(String[] args) {
		int numberOfTries = 0;
		while (winChances() == false) {
			numberOfTries++;
		}
		System.out.println("Numarul de incercari pana la un probabil castig:"+numberOfTries);
	}

}
