import java.util.Scanner;

public class MainLivrareColete {

	public static void main(String[] args) {
		FirmaCurierat firma = new FirmaCurierat();
		firma.setNrColete(0);
		System.out.print("Introduceti un numar de colete: ");
		Scanner keyboard = new Scanner(System.in);
		int numarColete = keyboard.nextInt();
		primesteColete(firma, numarColete);
		Curier curier = new Curier();
		for (int i = 1; i <= numarColete; i++) {
			Colet colet = new Colet("Colet",i,false);
			System.out.println("In firma sunt " + firma.getNrColete() + " colete.");
			livreazaColete(firma,curier,colet);
			System.out.println("Coletul cu numarul " + colet.getNrColet() + " a fost livrat.");
		}
		System.out.println("Curierul " + curier.getNumeCurier() + " " + curier.getPrenumeCurier() + " a livrat " + curier.getNrColeteLivrate() + " colete.");
	}
	
	public static void primesteColete(FirmaCurierat firma, int numar) {
		firma.setNrColete(firma.getNrColete() + numar);
	}
	
	public static void livreazaColete(FirmaCurierat firma, Curier curier, Colet colet) {
		curier.setNrColeteLivrate(curier.getNrColeteLivrate() + 1);
		firma.setNrColete(firma.getNrColete() - 1);
		colet.setStatusLivrare(true);
	}

}
