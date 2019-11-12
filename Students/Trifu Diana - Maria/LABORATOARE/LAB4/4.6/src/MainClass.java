import hotel.Bucatar;
import hotel.Menajera;
import hotel.Personal;
public class MainClass {

	public static void main(String[] args) {
		Menajera m = new Menajera();
		Bucatar b = new Bucatar();
		
		m.nume = "Popescu";
		m.prenume = "Elena";
		m.nrCamere = 15;
		m.vechime = 20;
		
		b.nume = "Popescu";
		b.prenume = "Andrei";
		b.nrPortii = 312;
		b.ture = 4;
		
		b.castig(b.ture, b.nrPortii);
		System.out.println("Bucatarul " + b.nume + " " + b.prenume + " are un salariu in valoare de " + b.salariu +" lei");
		
		m.castig(m.nrCamere, m.vechime);
		System.out.println("Menajera " + m.nume + " " + m.prenume + " are un salariu in valoare de " + m.salariu +" lei");
	}
}

