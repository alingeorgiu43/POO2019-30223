
public class Lucrator extends CalendarLucru {
	private String nume;
	private CalendarLucru calendarLucrator;

	Lucrator(String nume, CalendarLucru calendarLucrator) {
		this.calendarLucrator = new CalendarLucru();
		this.nume = nume;
	}

	public void schimbaZiLucru(int nrZi, boolean tipZi) {
		this.calendarLucrator.schimbaTipZi(nrZi, tipZi);
	}

	public String getNume() {
		return this.nume;
	}
	
	public void setCalendarLucru(CalendarLucru newCalendar) {
		this.calendarLucrator=newCalendar;
	}

	public CalendarLucru getCalendarLucru() {
		return this.calendarLucrator;
	}

	public void lucreaza(String zi) throws Exception {
		for (int i = 0; i < 7; i++) {
			Zi ziua = calendarLucrator.getZi(i);
			if ((ziua.getNume()).equals(zi)) {
				if (ziua.getTipZi() == true) {
					System.out.println(this.nume + " lucreaza in ziua de " + ziua.getNume());
				} else {
					throw new Exception("Lucratorul are zi libera");
				}
			}
		}

	}
}
