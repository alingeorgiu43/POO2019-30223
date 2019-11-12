public class MainClass {

	public static void main(String[] args) {
		Autovehicul autovehicul = new Autovehicul();
		autovehicul.setColor("Gri");
		autovehicul.setMarca("Audi");
		autovehicul.setViteza_maxima(280);
		System.out.println(autovehicul.toString());
		
		Truck truck = new Truck();
		truck.setNrVagoane(2);
		truck.setMarca("MAN");
		truck.setTonaj(10);
		truck.setViteza_maxima(110);
		truck.setTreapta(1);
		truck.setMarfa("Eletrocasinice");
		System.out.println(truck.toString());
		Sofer sofer=new Sofer("Tufis","Ionescu",33,"S001210AR3");
		System.out.println(sofer.toString());
		SimulareDeplasare.simulare(autovehicul,22);
		
		Avion avion=new Avion();
		avion.setNume("Blitz");
		avion.setCompanie("NumeAeroport :)");
		avion.setCursa("Romania-Beijing");
		avion.setDistanta(3000);
		avion.setNrLocuri(90);
		System.out.println(avion.toString());
	}
}
