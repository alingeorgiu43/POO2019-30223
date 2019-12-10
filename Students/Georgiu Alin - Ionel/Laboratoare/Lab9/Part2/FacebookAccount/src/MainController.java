
public class MainController {

	public static void main(String[] args) {
		FacebookAccount account1 = new FacebookAccount("Georgiu Alin", "Alinut", 20, "Cluj-Napoca");
		FacebookAccount account2 = new FacebookAccount("Oana Andreea", "Oana", 19, "Dej");
		FacebookAccount account3 = new FacebookAccount("Revnic Andrei", "Deiu", 25, "Timisoara");
		FacebookAccount account4 = new FacebookAccount("Runcan Marco", "Chelu", 18, "Vaslui");
		FacebookAccount account5 = new FacebookAccount("Cimpean Darius", "PW", 23, "Bucuresti");
		FacebookAccount account6 = new FacebookAccount("Matiesi Darius", "Tocilar", 18, "Suceava");

		account1.addFriend(account2);
		account1.addFriend(account3);
		account1.addFriend(account4);
		account1.addFriend(account6);
		account1.showFriends();
		account1.friendLocation("Dej");
	}
}
