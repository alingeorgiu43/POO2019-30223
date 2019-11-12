import java.util.Scanner;


public class ControlMasina {
	public static void main(String argv[])
	{
		Autovehicul masina=new Autovehicul();
		Scanner input=new Scanner(System.in);
		System.out.print("dati comanda: accelerare, decelerare, schimbareViteza, oprire sau stop ");
		int ok;
		String comanda=input.next();
		if (comanda.equals("stop")==true) {
			ok=0;
		} else {
			ok=1;
		}
		
		while (ok==1)
		{	
			if (comanda.equals("oprire"))
			{
				Autovehicul.deplasareAutovehicul(masina,comanda,0);
			}
			else 
			{
				System.out.println("dati numarul de km/ora cu care sa se schimbe actuala viteza sau 1 daca treapta de viteza trebuie sa creasca sau -1 daca treapta de viteza trebuie sa scada");
				int vitezaSauTreapta=input.nextInt();
				Autovehicul.deplasareAutovehicul(masina,comanda,vitezaSauTreapta);
			}
			
			System.out.println(masina.getTreaptaDeViteza());
			System.out.println(masina.getVitezaCurenta());
			System.out.println("dati comanda: accelerare, decelerare, schimbare viteza, oprire sau stop ");
			comanda=input.next();
			if (comanda.equals("stop")==true)
				ok=0;
		} 
		
		input.close();
		
		masina.accelerareAutovehicul(5);
		System.out.println("viteza masinii dupa ce accelereaza 5 km.ora "+ masina.getVitezaCurenta());
		
		Sofer sofer=new Sofer();
		sofer.setPrenume("Vasile");
		sofer.setNume("Cocis");
		sofer.setVarsta(40);
		masina.setSofer(sofer);
		masina.setMarca("Ford");
		
		Calatorie calatorie=new Calatorie();
		calatorie.setData_plecare("12.03.2018");
		calatorie.setData_sosire("13.03.2018");
		calatorie.setDestinatie("Vienna");
		calatorie.setSofer(sofer);
		
		ServiceAuto service=new ServiceAuto();
		service.setAutovehicul(masina);
		service.setMecanic("Popescu Mihai");
		service.setPiesaDefecta("frana");
		service.setTotalPlata(300);
		
		System.out.println(sofer.getNume()+ " "+ sofer.getPrenume()+ " a fost la "+ service.getMecanic()+ " sa repare "+ service.getPiesaDefecta()+ " si a platit "+ service.getTotalPlata());
		System.out.print("in data de "+ calatorie.getData_sosire()+" "+ calatorie.getSofer().getNume()+ " a fost in " +calatorie.getDestinatie()); 
		
		
	}
}
