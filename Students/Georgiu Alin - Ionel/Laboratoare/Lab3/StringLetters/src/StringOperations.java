
public abstract class StringOperations {
	public static void vowelClue(String str, char ch) {
		System.out.println("You may found the charachter " + ch + " that you need in the following :");
		int n = str.length();
		int foundOne = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == ch) {
				System.out.printf(i + " ");
				foundOne = 1;
			}
		}
		if (foundOne == 0) {
			System.out.println("Unfortunately the caracter " + ch + " does not exists in the given string !");
		}
	}

	public static void getNrVowelsAndConsonants(String str) {

		int contor = 0;
		int n = str.length();
		String vowels = "aeiou";
		int m = vowels.length();
		str = str.toLowerCase();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (vowels.charAt(j) == str.charAt(i)) {
					contor++;
				}
			}
		}
		System.out.println("Number of vowels is: " + contor);
		System.out.println("Number of consonant is: " + (n - contor));
	}

}
