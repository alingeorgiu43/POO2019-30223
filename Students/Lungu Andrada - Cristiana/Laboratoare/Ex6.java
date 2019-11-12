package laborator4;



public class Ex6 {

	public static void main(String[] args) {
		city_break c1=new city_break();
		city_break c2=new city_break();
		persoana p1=new persoana();
		persoana p2=new persoana();
		
		c1.setLocPlec("Cluj-Napoca");
		c1.setDestinatie("Paris");
		c1.setNr_zile(5);
		c1.setPret(200);
		
		c2.setDestinatie("Roma");
		c2.setLocPlec("Bucuresti");
		c2.setNr_zile(3);
		c2.setPret(120);
		
		p1.setNume("Popescu");
		p1.setPrenume("Cristian");
		p1.setVarsta(28);
		
		p2.setNume("Pop");
		p2.setPrenume("Madalina");
		p2.setVarsta(25);
		
		
		System.out.println(p2.getNume()+" "+p2.getPrenume()+ " in varsta de "+ p2.getVarsta() +" ani,merge in "+c2.getDestinatie()+" pornind din "+
		c2.getLocPlec() +" pe o perioada de "+ c2.getNr_zile()+" zile, platind pe calatorie "+c2.getPret()+" euro ");

		System.out.println(p1.getNume()+" "+p1.getPrenume()+ " in varsta de "+ p1.getVarsta() +" ani,merge in "+c1.getDestinatie()+" pornind din "+
		c1.getLocPlec() +" pe o perioada de "+ c1.getNr_zile()+", platind pe calatorie "+c1.getPret()+" euro ");
	}
}
