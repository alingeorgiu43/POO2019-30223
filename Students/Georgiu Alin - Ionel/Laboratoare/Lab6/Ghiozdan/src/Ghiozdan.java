public class Ghiozdan {
	private Rechizita[] rechizite;
	private int nrItems = 0;

	public Ghiozdan(int nrRechizite) {
		rechizite = new Rechizita[nrRechizite];
	}

	public Ghiozdan() {
		rechizite = new Rechizita[100];
	}

	public void addCaiet(Caiet caiet) {
		rechizite[nrItems++] = caiet;
	}

	public void addManual(Manual manual) {
		rechizite[nrItems++] = manual;
	}

	public void listItems() {
		for (Rechizita i : rechizite) {
			System.out.println(i.getNume());
		}
	}

	public void listManuale() {
		for (Rechizita i : rechizite) {
			if (i instanceof Manual) {
				System.out.println(i.getNume());
			}

		}
	}

	public void listCaiete() {
		for (Rechizita i : rechizite) {
			if (i instanceof Caiet) {
				System.out.println(i.getNume());
			}

		}
	}

	public int getNrRechizite() {
		return nrItems;
	}

	public int getNrManuale() {
		int cont = 0;
		for (Rechizita i : rechizite)
			if (i instanceof Manual)
				cont++;

		return cont;
	}

	public int getNrCaiete() {
		int cont = 0;
		for (Rechizita i : rechizite)
			if (i instanceof Caiet)
				cont++;

		return cont;
	}
}
