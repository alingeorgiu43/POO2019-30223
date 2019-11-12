package lab3Pb3;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Cuvantul este: ");
		String cuvant = keyboard.next();

		int numarVocale = 0;
		int numarConsoane = 0;

		int lungimeCuvant = cuvant.length();
		for (int index = 0; index < lungimeCuvant; index++) {
			char literaCurenta = cuvant.charAt(index);
			switch (literaCurenta) {
			case 'a':
				numarVocale++;
				break;
			case 'e':
				numarVocale++;
				break;
			case 'i':
				numarVocale++;
				break;
			case 'o':
				numarVocale++;
				break;
			case 'u':
				numarVocale++;
				break;
			case 'A':
				numarVocale++;
				break;
			case 'E':
				numarVocale++;
				break;
			case 'I':
				numarVocale++;
				break;
			case 'O':
				numarVocale++;
				break;
			case 'U':
				numarVocale++;
				break;
			default:
				numarConsoane++;
			}
		}
		System.out.println("Cuvantul contine " + numarVocale + " vocale si " + numarConsoane + " consoane.");

		System.out.println("Introduceti o vocala: ");
		String vocalaInstrodusa = keyboard.next();
		char vocala = vocalaInstrodusa.charAt(0);

		int contorAparitii = 0;
		for (int index = 0; index < lungimeCuvant; index++) {
			char litera = cuvant.charAt(index);
			if (litera == vocala) {
				contorAparitii++;
				System.out.print(index + " ");
			}
		}

		if (contorAparitii == 0)
			System.out.println("Vocala " + vocalaInstrodusa + " nu se regaseste in cuvantul " + cuvant);

	}
	
	

}
