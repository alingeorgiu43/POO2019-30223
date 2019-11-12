package laborator4;

public class Exercitii2345 {
	public static void main(String[] args) {
		
		Autovehicul a=new Autovehicul();
		a.SetMarca("vw");
		a.SetColor("rosie");
		a.SetVitMax(240);
		//a.SetVitC(0);
		a.SetTreapta(1);
		System.out.println(a);
		
		while(a.GetVitC() <a.GetVitMax()) {
			a.accelerare(a.GetVitC());
			if(a.GetTreapta()<6) {
				a.schimbare_trepte_acc(a.GetTreapta());
			}
			System.out.println(a);
			
		}
		
		while(a.GetVitC()>0) {
			a.decelerare(a.GetVitC());
			if(a.GetTreapta()>1)
				a.schimbare_trepte_decc(a.GetTreapta());
			System.out.println(a);
		}
		
		a.oprire();
		System.out.println(a);
		
		//supraincarcare
		a.an(2010);
		System.out.println(a.GetAn());
		
		Sofer s1=new Sofer();
		s1.setNume("Pop");
		s1.setPrenume("Ion");
		s1.setVarsta(35);
		s1.setNrPerm("M02365142S");
		
		System.out.println("soferul autovehiculului este "+ s1.getNume()+" "+s1.getPrenume()+
				",avand varsta de " + s1.getVarsta() + " ani,numarul permisului de conducere fiind "+
				s1.getNrPerm());
		FirmaAngajat firma=new FirmaAngajat();
		firma.setVechime(2);
		firma.setSalariu_oferit(4200);
		
		Drum d=new Drum();
		d.setLoc_plecare("Cluj-Napoca");
		d.setDestinatie("Turda");
		d.setNrKm(37);
		d.setTimp(50);
		
		System.out.println("soferul autovehiculului, "+s1.getNume()+" "+s1.getPrenume()+", "+
		"care castiga "+ firma.getSalariu_oferit() +" lei ,trebuie sa parcurga "+ d.getNrKm()+ " km "+
		" in "+ d.getTimp()+" min,plecand de la  "+d.getLoc_plecare() +",si ajungand la "+ d.getDestinatie());
	
	}
}
