package Farmacie;

import java.util.*;

public class DoctorFarmacie implements Boala {

	Random rand = new Random();
	private boolean corinca = rand.nextBoolean();

	ArrayList<Medicament> medicamente = new ArrayList<Medicament>();

	public DoctorFarmacie(ArrayList<Medicament> medicamente) {
		this.medicamente = medicamente;
	}

	public void consultatie(DoctorFarmacie doctor) {
		if (doctor.isCronica() == true)
			System.out.println("Boala cronica!!");
		else
			System.out.println("Boala acuta!!");
	}

	@Override
	public void setCronica(boolean cronica) {
		this.corinca = cronica;
	}

	@Override
	public boolean isCronica() {
		return corinca;
	}
}
