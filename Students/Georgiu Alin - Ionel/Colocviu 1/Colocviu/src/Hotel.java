
public abstract class Hotel {
	private Angajat[] angajati;
	private Client[] clienti;
	private Camera[] camere;

	private int nrAngajati, nrCamere, nrClienti;

	Hotel(int nrAngajati, int nrCamere, int nrClienti) {
		this.nrAngajati = nrAngajati;
		this.nrCamere = nrCamere;
		this.nrClienti = nrClienti;
		this.angajati = new Angajat[nrAngajati];
		this.clienti = new Client[nrClienti];
		this.camere = new Camera[nrCamere];
	}

	Hotel() {
		this.nrAngajati = 0;
		this.nrCamere = 350;
		this.nrClienti = 0;
		this.angajati = new Angajat[100];
		this.clienti = new Client[300];
		this.camere = new Camera[400];
	}

	public void addAngajat(Angajat newAngajat) {
		angajati[nrAngajati++] = newAngajat;
	}

	public void addClient(Client newClient) {
		clienti[nrClienti++] = newClient;
	}

	public int getNrClienti() {
		return this.nrClienti;
	}

	public int getNrAngajati() {
		return this.nrAngajati;
	}

	public int getNrCamere() {
		return this.nrCamere;
	}

	public void setNrCamere(int nrCamere) {
		this.nrCamere = nrCamere;
	}

	public Angajat[] sortAngajati() {
		Angajat[] sortAngajati = new Angajat[getNrAngajati()];
		sortAngajati = this.angajati;
		int arrLength = sortAngajati.length;

		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				Angajat angajatAux;
				if (sortAngajati[i].getNrClienti() > sortAngajati[j].getNrClienti()) {
					angajatAux = sortAngajati[i];
					sortAngajati[i] = sortAngajati[j];
					sortAngajati[j] = angajatAux;

				}
			}
		}
		return sortAngajati;
	}

	public void printSortedAngajatiList() {
		Angajat[] sortAngajati = sortAngajati();
		System.out.println("Numele angajatilor in ordinea crescatoare a numarului de clienti serviti:");
		for (int i = 0; i < sortAngajati.length; i++) {
			System.out.println(sortAngajati[i].getName());
		}
	}

	public void getRoomsStatistics() {
		int contorFreeRooms = 0;
		int contorNotFreeRooms = 0;
		for (int i = 0; i < camere.length; i++) {
			if (camere[i].isFree() == false) {
				contorFreeRooms++;
			} else {
				contorNotFreeRooms++;
			}
		}
		System.out.println(
				"Numarul de camere ocupate: " + contorNotFreeRooms + "\nNumarul de camere libere: " + contorFreeRooms);
	}

}
