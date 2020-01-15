package Farmacie;

import java.util.*;

public class Farmacia implements Cloneable {
	private String nume;
	private String adresa;
	private String telefon;
	private String website;

	Map<String, Integer> reteteAngajati;
	Map<String, Integer> stocMedicamente;
	ArrayList<AngajatFarmacie> angajati;

	public Farmacia(String nume, String adresa, String telefon, String website) {
		this.nume = nume;
		this.adresa = adresa;
		this.telefon = telefon;
		this.website = website;
		this.reteteAngajati = new HashMap<String, Integer>();
		this.stocMedicamente = new HashMap<String, Integer>();
		this.angajati = new ArrayList<AngajatFarmacie>();
	}

	public void setStocMedicamente(Map<String, Integer> stocMedicamente) {
		this.stocMedicamente = stocMedicamente;
	}

	public void setReteteAngajati(Map<String, Integer> reteteAngajati) {
		this.reteteAngajati = reteteAngajati;
	}

	public Object clone() throws CloneNotSupportedException {
		Farmacia copy = (Farmacia) super.clone();

		copy = new Farmacia(adresa, adresa, adresa, adresa);

		return copy;
	}
}
