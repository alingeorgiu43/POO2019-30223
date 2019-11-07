import java.util.Scanner;

public class NameInverter {

	static int getNrSpaces(String str) {
		int cont = 0;
		char ch = ' ';
		str = str.trim();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				cont++;
		}
		return cont;
	}

	public static String invertor(String name) {
		String prefix;
		String firstName;
		String lastName;
		int space1, space2;
		char ch = ' ';
		int nrSpaces = getNrSpaces(name);
		if (name == null)
			return null;
		else {
			name = name.trim();
			int n = name.length();
			space1 = name.indexOf(" ");
			space2 = name.lastIndexOf(" ");
			if (space1 == space2) {
				firstName = name.substring(0, space2);
				lastName = name.substring(space2 + 1);
				return lastName + " " + firstName;
			} else {
				if (nrSpaces == 2) {
					firstName = name.substring(space1 + 1, space2);
					lastName = name.substring(space2 + 1);
					prefix = name.substring(0, space1);
					return lastName + ", " + firstName + " " + prefix;
				} else {
					int cont = 0;
					for (int i = 0; i < n; i++) {
						if (name.charAt(i) == ch)
							cont++;
						if (nrSpaces - cont + 1 == 2) {
							space1 = i;
							break;
						}
					}
					firstName = name.substring(space1 + 1, space2);
					lastName = name.substring(space2 + 1);
					prefix = name.substring(0, space1);
					return lastName + ", " + firstName + " " + prefix;
				}

			}

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "Mr. Ph. FirstName LastName";
		System.out.println("You entered string " + name);
		String result = invertor(name);
		System.out.println(result);
	}
}
