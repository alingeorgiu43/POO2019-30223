package laborator4;

public class Actiuni extends Autovehicul {
	public static void accelerare(Autovehicul a, float incrementViteza) {
		float nouaVitezaCurenta = a.getVitezaCurenta() + incrementViteza;
		if (nouaVitezaCurenta <= a.getVitezaMaxima()) {
			a.setVitezaCurenta(nouaVitezaCurenta);
		} else {
			a.setVitezaCurenta(a.getVitezaMaxima());
		}
	}
	
	public static void accelerare(Autovehicul a, float incrementViteza, char treaptaDeViteza) {
		float nouaVitezaCurenta = a.getVitezaCurenta() + incrementViteza;
		if (nouaVitezaCurenta <= a.getVitezaMaxima()) {
			a.setVitezaCurenta(nouaVitezaCurenta);;
		} else {
			a.setVitezaCurenta(a.getVitezaMaxima());
		}
		if (nouaVitezaCurenta == 0) {
			a.setTreaptaDeViteza('N');
		} else if (nouaVitezaCurenta > 0 && nouaVitezaCurenta <= 15) {
			a.setTreaptaDeViteza('1');
		} else if (nouaVitezaCurenta > 15 && nouaVitezaCurenta <= 40) {
			a.setTreaptaDeViteza('2');
		} else if (nouaVitezaCurenta > 40 && nouaVitezaCurenta <= 60) {
			a.setTreaptaDeViteza('3');
		} else if (nouaVitezaCurenta > 60 && nouaVitezaCurenta <= 90) {
			a.setTreaptaDeViteza('4');
		} else if (nouaVitezaCurenta > 90 && nouaVitezaCurenta <= 120) {
			a.setTreaptaDeViteza('5');
		} else if (nouaVitezaCurenta > 120) {
			a.setTreaptaDeViteza('6');
		}
		
	}
	
	public static void decelerare(Autovehicul a, float decrementViteza) {
		float nouaVitezaCurenta = a.getVitezaCurenta() - decrementViteza;
		if (nouaVitezaCurenta >= 0) {
			a.setVitezaCurenta(nouaVitezaCurenta);
		} else {
			a.setVitezaCurenta(0);
		}
	}
	
	public static void schimbareTreaptaDeViteza(Autovehicul a) {
		float vitezaCurenta = a.getVitezaCurenta();
		if (vitezaCurenta == 0) {
			a.setTreaptaDeViteza('N');
		} else if (vitezaCurenta > 0 && vitezaCurenta <= 15) {
			a.setTreaptaDeViteza('1');
		} else if (vitezaCurenta > 15 && vitezaCurenta <= 40) {
			a.setTreaptaDeViteza('2');
		} else if (vitezaCurenta > 40 && vitezaCurenta <= 60) {
			a.setTreaptaDeViteza('3');
		} else if (vitezaCurenta > 60 && vitezaCurenta <= 90) {
			a.setTreaptaDeViteza('4');
		} else if (vitezaCurenta > 90 && vitezaCurenta <= 120) {
			a.setTreaptaDeViteza('5');
		} else if (vitezaCurenta > 120) {
			a.setTreaptaDeViteza('6');
		}
	}
	
	public static void oprire(Autovehicul a) {
		a.setTreaptaDeViteza('N');
		a.setVitezaCurenta(0);
	}
	
}
