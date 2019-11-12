import java.util.Scanner;
public class Sala {
	private String nume_sala;
	private int nr_aparate;
	private String adresa;
	private Angajati angajati_sala;
	private Clienti clienti_sala;
	/*private Abonamente abonamente_sala;*/
	
	public void set_name(String nume)
	{
		nume_sala=nume;
	}
	
	public void set_nr_aparate(int nr)
	{
		nr_aparate=nr;
	}
	
	public void set_adresa(String c)
	{
		adresa=c;
	}
	public String get_name()
	{
		return nume_sala;
	}
	public int get_nr_aparate()
	{
		return nr_aparate;
	
	}
	public String get_adresa()
	{
		return adresa;
	}
	public static void main(String[] args)
	{    
		Scanner scann=new Scanner(System.in);
	
	
	      Sala Sala_1 = new Sala();
	      Clienti Client_1=new Clienti();
	      Clienti Client_2=new Clienti();
	      Clienti Client_3=new Clienti();
		 Angajati angajat_1=new Angajati(); 
		 Angajati angajat_2=new Angajati();
		 Angajati angajat_3=new Angajati();
		 Angajati angajat_4=new Angajati();
		 Angajati angajat_5=new Angajati();
		 Angajati angajat_6=new Angajati();
		 Angajati angajat_7=new Angajati();
		 Angajati angajat_8=new Angajati();
		 Angajati angajat_9=new Angajati();
		 Angajati angajat_10=new Angajati();
		
		 Sala_1.set_name("fitness");
		 Sala_1.set_nr_aparate(50);
		 Sala_1.set_adresa("str.Panselelor nr 145");
		 System.out.println("Sala " + Sala_1.get_name() + " este situata la adresa: " + Sala_1.get_adresa() + " si are " + Sala_1.get_nr_aparate()+" aparate.");
		 System.out.println("Sala are un nr de 10 angajati.\n");
		 angajat_1.set_characteristics_angajat(angajat_1," Catalin Popescu "," 20 de ani ","antrenor", "3000 RON");
		 angajat_2.set_characteristics_angajat(angajat_2," Andrei Moldovan"," 28 de ani ","antrenor", "3000 RON");
		 angajat_3.set_characteristics_angajat(angajat_3," Bianca Ionescu"," 25 de ani ","antrenor", "3000 RON");
		 angajat_4.set_characteristics_angajat(angajat_4," Radu Marian"," 21 de ani ","antrenor", "3000 RON");
		 angajat_5.set_characteristics_angajat(angajat_5," Ioana Maria "," 29 de ani ","antrenor", "3000 RON");
		 angajat_6.set_characteristics_angajat(angajat_6," Alex Ivan"," 20 de ani ","contabil", "3500 RON");
		 angajat_7.set_characteristics_angajat(angajat_7," Ana Pop "," 23 de ani ","casier", "2000 RON");
		 angajat_8.set_characteristics_angajat(angajat_8," Veronica Moldovan "," 25 de ani ","curatenie", "1500 RON");
		 angajat_9.set_characteristics_angajat(angajat_9," Claudiu Gorea"," 24 de ani ","programator", "4000 RON");
		 angajat_10.set_characteristics_angajat(angajat_10," Sara Luca"," 22 de ani ","masaj", "3000 RON");
		 System.out.println("Fiecare client isi alege abonamentul dorit(1,2 sau 3) si isi trece  datele personale care se cer.\n Aici aveti afisate abonamentele.\n");
		 Client_1.afisare_abonamente();
		 Client_1.set_nume();
		 Client_1.set_varsta();
		 Client_1.set_abonament();
		 Client_1.set_data_expirare_abonament();
		 System.out.println("Clientul " + Client_1.get_nume() + " cu varsta de " + Client_1.get_varsta() + " a fost salvat in baza de date . A ales abonament de tip " + Client_1.get_abonament() + " care expira in " + Client_1.get_data_expirare_abonament());
		 System.out.println ("Abonamentul ales: \n");
		Client_1.ales_abonament();
}
}
	     
	


