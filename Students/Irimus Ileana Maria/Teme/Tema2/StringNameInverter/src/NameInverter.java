import java.util.Scanner;

public class NameInverter {

	public static void Invert(String string) {
		int nrCuvinte;
		String str = string.strip(); // elimina spatiile de la inceputul/sfarsitul stringului

		if (str.contains(" ")) // daca este cel putin 1 spatiu => sunt cel putin 2 cuvinte
		{

			String trim = str.trim(); // elimina spatiile extra din interior
			nrCuvinte = trim.split("\\s+").length;
			String[] cuvant = str.split("\\s+");
			if (nrCuvinte == 2) {
				String cuvant1 = cuvant[0];
				String cuvant2 = cuvant[1];
				System.out.print(cuvant2 + ", ");
				System.out.println(cuvant1);
			} else if (nrCuvinte == 3) {
				String cuvant1 = cuvant[0];
				String cuvant2 = cuvant[1];
				String cuvant3 = cuvant[2];
				if (cuvant1.equals("Mr.") || cuvant1.equals("Mrs.")) {
					System.out.print(cuvant3 + ", ");
					System.out.print(cuvant2 + " ");
					System.out.print(cuvant1);
				} else
					System.out.print("format gresit");
			} else if (nrCuvinte == 4) {
				String cuvant1 = cuvant[0];
				String cuvant2 = cuvant[1];
				String cuvant3 = cuvant[2];
				String cuvant4 = cuvant[3];
				if ((cuvant1.equals("Mr.") || cuvant1.equals("Mrs.")) && cuvant2.equals("Phd.")) {
					System.out.print(cuvant4 + ", ");
					System.out.print(cuvant3 + " ");
					System.out.print(cuvant1 + " ");
					System.out.print(cuvant2);
				} else
					System.out.print("format gresit");
			} else
				System.out.println("prea multe cuvinte");
		} else
			System.out.println(str.trim()); // este doar un cuvant
	}

	public static void main(String[] args) {

		System.out.print("Dati nume: ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();

		if (string != null && !string.isEmpty()) {
			Invert(string);
		} else
			System.out.println("null");
		
	}
}
