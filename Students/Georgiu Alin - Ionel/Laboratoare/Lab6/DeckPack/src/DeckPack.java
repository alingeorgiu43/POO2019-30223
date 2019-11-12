import java.util.Iterator;

public class DeckPack implements Iterator<Character> {
	private char deckCards[] = { '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'Q', 'K', 'A' };
	private int nrCards = 13;
	private int contor = 0;

	DeckPack() {

	}

	public int getNrOfCards() {
		return nrCards;
	}

	public void setNumberOfCards(int nrCards) {
		this.nrCards = nrCards;
	}

	@Override
	public boolean hasNext() {
		if (contor < nrCards)
			return true;
		return false;
	}

	@Override
	public Character next() {
		if (this.hasNext())
			return deckCards[contor++];
		return null;

	}

	@Override
	public void remove() {
		if (contor < 0) {
			System.out.println("Array limit excedded!");
		} else
			deckCards[contor] = ' ';
	}

}
