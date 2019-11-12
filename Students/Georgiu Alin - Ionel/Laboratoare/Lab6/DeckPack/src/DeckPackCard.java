import java.util.Iterator;

public class DeckPackCard implements Iterator<Card> {

	private Card deckCards[]=new Card[13];
	private static int nrCards = 13;
	private int contor = 0;

	DeckPackCard() {

	}

	public int getNrOfCards() {
		return nrCards;
	}

	@Override
	public boolean hasNext() {
		if (contor < nrCards)
			return true;
		return false;
	}

	@Override
	public Card next() {
		if (this.hasNext())
			return deckCards[contor++];
		return null;

	}

	@Override
	public void remove() {
		if (contor < 0) {
			System.out.println("Array limit excedded!");
		} else
			deckCards[contor] =null;
	}
}
