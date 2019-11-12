
public class Card {
	private int cardNumber;
	private String suit;

	Card(int cardNumber, String suit) {
		this.cardNumber = cardNumber;
		this.suit = suit;
	}

	public int getCardNumber() {
		return this.cardNumber;
	}

	public String getCardSuit() {
		return this.suit;
	}
}
