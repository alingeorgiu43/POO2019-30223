package Farmacie;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AdministrareFarmacie {

	public static void main(String[] args) throws ParseException {

		try {
			File myFile = new File("filename.txt");
			Scanner reader = new Scanner(myFile);
			if (myFile.createNewFile()) {
				System.out.println("S-a creat fisierul " + myFile.getName());
			} else {
				System.out.println("Fisierul exista");
			}
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				String[] tokens = data.split(" ");
				for(String token:tokens) {
					if(token==null) {
						throw new IncompleteDataException("Nu e complet");
					}
				}
				
				System.out.println(data);
			}

		} catch (Exception e) {
			e.getMessage();
		}

		Farmacia myPharmacy = new Farmacia("Catena", "Strada Nichita Stanescu nr.43", "0744797657",
				"www.catenaFarmacie.com");
		ArrayList<Medicament> medicamente = new ArrayList<Medicament>();
		ArrayList<AngajatFarmacie> angajati = new ArrayList<AngajatFarmacie>();

		Medicament m1 = new Medicament(20, "num1");
		Medicament m2 = new Medicament(30, "num2");

		medicamente.add(m1);
		medicamente.add(m2);

		AngajatFarmacie eu1 = new AngajatFarmacie("Alin", 1);
		AngajatFarmacie eu2 = new AngajatFarmacie("Georgiu", 2);
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataAngajare = dateFormatter.parse("15/01/2019");
		eu1.setDataAngajare(dataAngajare);
		eu2.setDataAngajare(dataAngajare);
		angajati.add(eu1);
		angajati.add(eu2);

		DoctorFarmacie doctorMihai = new DoctorFarmacie(medicamente);
		Map<String, Integer> reteteAngajati = new HashMap<String, Integer>();
		Map<String, Integer> stocMedicamente = new HashMap<String, Integer>();

	}

}
