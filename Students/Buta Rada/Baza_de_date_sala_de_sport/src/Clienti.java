import java.util.Scanner;

public class Clienti {
	private String nume;
	private String varsta;
     String tip_abonament;
	private String data_expirare_abonament;
	Scanner scann=new Scanner(System.in);
	
	public String set_nume()
	{    System.out.println("Numele:");
		 nume=scann.nextLine();
		 return nume;
		 
	}
	public String set_varsta()
	{   System.out.println("Varsta:");
		varsta=scann.nextLine();
		return varsta;
		
	}
	public String set_abonament()
	{  System.out.println("Tipul_abonamentului: ");
		 tip_abonament=scann.nextLine();
		 return tip_abonament;
	}
	
	public String get_nume()
	{    
		 return nume;
		 
	}
	public String get_varsta()
	{   
		return varsta;
		
	}
	public String get_abonament()
	{  
		 return tip_abonament;
	}
	public String get_data_expirare_abonament()
	{  
		return data_expirare_abonament;
	}
	public String set_data_expirare_abonament()
	{   System.out.println("Data in care vreti sa se termine abonamentul:");
		data_expirare_abonament=scann.nextLine();
		return data_expirare_abonament;
	}
	public void afisare_abonamente()
	{
		System.out.println("Abonament tip 1: \n");
		System.out.println("Masaj , clase normale(fitness,sala de forte, aerobic),sauna. /n Pret:400");
		System.out.println("Abonament tip 2: \n");
		System.out.println("Clase normale(fitness,sala de forte, aerobic). /n Pret:300");
		System.out.println("Abonament tip 3: \n");
		System.out.println("Clase normale(fitness,sala de forte, aerobic) + cycling.\n Pret:350 ");
		System.out.println("Abonament tip 4: \n");
		System.out.println("Acces la tot.Pret:500 ");
		
		
	}
	public void ales_abonament()
	{
		
		if(tip_abonament=="1")
			System.out.println("Ati ales abonament de tip masaj . Aveti acces la clasele normale, sauna si masaj . Pret:400 lei.");
		if(tip_abonament=="2")
			System.out.println("Ati ales abonament de tip clase.Aveti acces doar la clase.Pret:300 lei.");
		if(tip_abonament=="3")
			System.out.println("Ati ales abonament de tip cycling. Aveti acces la clasele normale plus la clasele de cycling.Pret:350.");
		if(tip_abonament=="4")
			System.out.println("Ati ales abonament de tip integral.Aveti acces la tot.Pret:500");
	}
			
	}
	
	

