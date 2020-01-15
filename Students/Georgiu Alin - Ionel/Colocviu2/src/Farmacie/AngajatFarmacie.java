package Farmacie;

import java.util.*;

public class AngajatFarmacie implements AtributiiAngajat {

	private String nume;
	private int id;
	private Date dataAngajare = new Date();
	private int bonusSalarial;

	AngajatFarmacie(String nume, int ID) {
		this.nume = nume;
		this.id = id;
	}

	public String getNume() {
		return this.nume;
	}

	public Date getDataAngajare() {
		return dataAngajare;
	}

	public void setDataAngajare(Date dataAngajare) {
		this.dataAngajare = dataAngajare;
	}

	@Override
	public void adaugaMedicamente(String medicament, int stoc, Map<String, Integer> stocMedicamente) {
		if (stocMedicamente.containsKey(medicament))
			stocMedicamente.remove(medicament);
		stocMedicamente.put(medicament, stoc);
	}

	@Override
	public void eliminaMedicamente(String medicament, Map<String, Integer> stocMedicamente) {
		stocMedicamente.remove(medicament);
	}

	@Override
	public int getStoc(String medicament, Map<String, Integer> stocMedicamente) {
		int stoc = 0;
		for (Map.Entry<String, Integer> entry : stocMedicamente.entrySet()) {
			String k = entry.getKey();
			stoc = Integer.parseInt(k);
		}
		return stoc;
	}

	@Override
	public boolean isMedicineSold(String medicament, Map<String, Integer> stocMedicamente) {
		if (stocMedicamente.containsKey(medicament))
			return true;
		return false;
	}

	@Override
	public double proceseazaReteta(ArrayList<Medicament> reteta) {
		double total = 0;
		for (int i = 0; i < reteta.size(); i++) {
			total = total + reteta.get(i).getPret();
		}
		return total;
	}

}
