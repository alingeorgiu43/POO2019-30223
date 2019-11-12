package laborator4;

import java.util.Scanner;

public class MainDeplasare {

	public static void main(String[] args) {
		Autovehicul masina1 = new Autovehicul();
		Autovehicul masina2 = new Autovehicul("BMW", "Alb", 'N', 0, 220);
		Actiuni f = new Actiuni();
		
		System.out.print("Introduceti actiunea: ");
		Scanner keyboard = new Scanner(System.in);
		String actiune = keyboard.next();
		if (actiune.equals("Oprire") == false && actiune.contentEquals("oprire") == false) {
			while (actiune.equals("Oprire") == false  && actiune.equals("oprire") == false) {
				if (actiune.equals("Accelerare") == true || actiune.equals("accelerare") == true) {
					f.accelerare(masina2, 25);
					f.schimbareTreaptaDeViteza(masina2);
					System.out.println("Treapta de viteza este: " + masina2.getTreaptaDeViteza());
					System.out.println("Viteza curenta este: " + masina2.getVitezaCurenta());
				} else if (actiune.equals("Decelerare") == true || actiune.equals("decelerare") == true) {
					f.decelerare(masina2, 35);
					f.schimbareTreaptaDeViteza(masina2);
					System.out.println("Treapta de viteza este: " + masina2.getTreaptaDeViteza());
					System.out.println("Viteza curenta este: " + masina2.getVitezaCurenta());
				} 
				System.out.print("Introduceti actiunea: ");
				actiune = keyboard.next();
			}
			f.oprire(masina2);
			System.out.println("Treapta de viteza este: " + masina2.getTreaptaDeViteza());
			System.out.println("Viteza curenta este: " + masina2.getVitezaCurenta());
		} else {
			f.oprire(masina2);
			System.out.println("Treapta de viteza este: " + masina2.getTreaptaDeViteza());
			System.out.println("Viteza curenta este: " + masina2.getVitezaCurenta());
		}
	}

}
