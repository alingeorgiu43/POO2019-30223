
public class CalendarLucru {
	private Zi[] calendar = new Zi[7];

	CalendarLucru() {
		calendar[0] = (new Zi("Luni", true));
		calendar[1] = (new Zi("Marti", true));
		calendar[2] = (new Zi("Miercuri", true));
		calendar[3] = (new Zi("Joi", true));
		calendar[4] = (new Zi("Vineri", true));
		calendar[5] = (new Zi("Sambata", false));
		calendar[6] = (new Zi("Duminica", false));
	}


	public void schimbaTipZi(int nrZi, boolean tipZi) {
		calendar[nrZi].setZiLucratoare(tipZi);
	}

	public boolean tipZiua(int nr) {
		return this.calendar[nr].getTipZi();
	}

	public Zi getZi(int nrZi) {
		return this.calendar[nrZi];
	}
}
