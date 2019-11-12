import java.util.Scanner;

public class Farmacie {
	public static void main(String argv[])
	{
		Scanner input=new Scanner(System.in);
		Farmacist farmacist1=new Farmacist();
		farmacist1.setFarmacie("catena");
		farmacist1.setNume("Pop");
		farmacist1.setPrenume("Maria");
		
		Farmacist farmacist2=new Farmacist();
		farmacist2.setFarmacie("dona");
		farmacist2.setNume("Prigoana");
		farmacist2.setPrenume("Vlad");
		
		Medicament algocalmin=new Medicament();
		algocalmin.setDenumireMedicament("algocalmin");
		algocalmin.setPret(9);
		algocalmin.setNumeFarmacie("dona");
		
		Medicament nurofen=new Medicament();
		nurofen.setDenumireMedicament("nurofen");
		nurofen.setNumeFarmacie("catena");
		nurofen.setPret(10);
		
		Medicament paracetamol=new Medicament();
		paracetamol.setDenumireMedicament("paracetamol");
		paracetamol.setNumeFarmacie("catena");
		paracetamol.setPret(5);
		
		
		Reteta reteta=new Reteta();
		Medicament[] medicamente= new Medicament[3];
		medicamente[0]=algocalmin;
		medicamente[1]=nurofen;
		medicamente[2]=paracetamol;
		reteta.setMedicament(medicamente);
		reteta.setNumePacient("Moldovan Marcel");
		
		System.out.println(reteta.getNumePacient()+ " a cumparat medicamente in valoare de "+ reteta.calculeazaPret() + " lei");
		for(int i=0; i<medicamente.length; i++)
			System.out.println(reteta.getNumePacient()+" a cumoarat "+medicamente[i].getDenumireMedicament()+ " de la farmacia "+ medicamente[i].getNumeFarmacie());
			
		System.out.println(farmacist1.getNume()+" "+ farmacist1.getPrenume()+ "este farmacist la farmacia "+ farmacist1.getFarmacie());
		System.out.println(farmacist2.getNume()+" "+ farmacist2.getPrenume()+ "este farmacist la farmacia "+ farmacist2.getFarmacie());
		
		input.close();
	}
}
