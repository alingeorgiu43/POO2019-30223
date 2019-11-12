import java.util.Iterator;

public class TestCardDeck {

	public static void main(String[] args) {
		DeckPack cardPack = new DeckPack();
		Iterator<Character> iterator = cardPack;
		char nextCard;
		char removeCard1 = 'J';
		char removeCard2 = '7';
		while (iterator.hasNext()) {
			nextCard = iterator.next();
			if (nextCard == removeCard1 || nextCard == removeCard2)
				iterator.remove();
			System.out.println("Card " + nextCard);
		}
	}
}
