import java.awt.Color;
import java.util.Scanner;

public class SimulareDeplasare {

	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);
		Autovehicul masina = new Autovehicul();

		String stringMarca;
		System.out.print("Introduceti marca masinii ");
		stringMarca = keyboardInput.nextLine();

		masina.setMarca(stringMarca);
		masina.setCuloare(Color.blue);



		double inVitezaCurenta;
		int inTreaptaViteza;
		double inVitezaMaxima;
		double kmPlus;
		double kmMinus;
		int treaptaNoua;

		System.out.print("Introduceti viteza curenta a masinii in km/h  ");
		inVitezaCurenta = keyboardInput.nextInt();
		masina.setVitezaCurenta(inVitezaCurenta);

		System.out.print("Introudceti treapta de viteza in care se afla masina ");
		inTreaptaViteza = keyboardInput.nextInt();
		masina.setTreaptaViteza(inTreaptaViteza);

		System.out.print("Introduceti viteza maxima a masinii in km/h ");
		inVitezaMaxima = keyboardInput.nextInt();
		masina.setVitezaMaxima(inVitezaMaxima);

		//actiuni codificate:
		// 1 - accelereaza
		// 2 - decelereaza
		// 3 - schimbaTreapta
		// 4 - opreste
		int actiune;

		boolean simuleaza = true;

		while (simuleaza == true) {
			
			System.out.print("Introduceti actiunea");
			actiune = keyboardInput.nextInt();
			if (actiune == 1) {
				System.out.print("Viteza va creste cu ");
				kmPlus = keyboardInput.nextInt();
				masina.accelereaza(kmPlus);
				System.out.println("Viteza masinii dupa acceleratie este de " + masina.getVitezaCurenta() + "km/h.");
			} else if (actiune == 2) {
				System.out.print("Viteza va scadea cu ");
				kmMinus = keyboardInput.nextInt();
				masina.decelereaza(kmMinus);
				System.out.println("Viteza masinii dupa deceleratie este de " + masina.getVitezaCurenta() + "km/h.");
			} else if (actiune == 3) {
				System.out.print("Noua treapta de viteza este ");
				treaptaNoua = keyboardInput.nextInt();
				masina.schimbaTreapta(treaptaNoua);
			} else if (actiune == 4) {
				masina.opreste();
				simuleaza = false;
			} else
				System.out.println("Nu ati introdus o actiune valida.");

		}

		System.out.println("Marca masinii este " + masina.getMarca());
		System.out.println("Viteza maxima a masinii in km/h este de " + masina.getVitezaMaxima());
		System.out.println("Dupa oprire viteza masinii este de " + masina.getVitezaCurenta()
				+ "km/h, iar treapta de viteza este " + masina.getTreaptaViteza());

		Sofer sofer = new Sofer();

		sofer.setNume("Pop");
		sofer.setPrenume("Andreea");
		sofer.setVarsta(25);
		masina.setSofer(sofer);
		
		CertificatInmatriculare certificat = new CertificatInmatriculare();
		certificat.setAutovechicul(masina);
		certificat.setCategorie("Autoturism");
		certificat.setDataInmatriculare("21.04.2013");
		certificat.setId("UUII117S255423");
		certificat.setNumarInmatriculare("MM 07 JEU");
		certificat.setSofer(sofer);
		certificat.setSursaEnergie("Motorina");
		
		System.out.println(sofer.getNume()+ " "+ sofer.getPrenume()+ " detine un autovehicul "+ "cu numarul de inmatriculare "+ certificat.getNumarInmatriculare()+ ", inmatriculat la data de "+ certificat.getDataInmatriculare() + " si care merge pe " + certificat.getSursaEnergie());
		
		SchimbareAnvelope schimbare = new SchimbareAnvelope();
		schimbare.setAnvelopa("Fata drepta");
		schimbare.setAutovehicul(masina);
		schimbare.setPret(100);

		System.out.print("Autovehiculului i-a fost schimbata anvelopa "+ schimbare.getAnvelopa()+ " la pretul de " + schimbare.getPret() + "lei"); 

	}

}
