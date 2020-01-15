package Farmacie;

import java.util.*;
import java.util.Map;

public interface AtributiiAngajat {
	public void adaugaMedicamente(String medicament, int stoc,Map<String, Integer> stocMedicamente);
	public void eliminaMedicamente(String medicament,Map<String, Integer> stocMedicamente);
	public int getStoc(String medicament,Map<String, Integer> stocMedicamente);
	public boolean isMedicineSold(String medicament,Map<String, Integer> stocMedicamente);
	public double proceseazaReteta(ArrayList<Medicament> reteta);
}
