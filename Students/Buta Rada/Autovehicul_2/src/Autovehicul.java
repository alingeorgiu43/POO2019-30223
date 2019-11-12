
public class Autovehicul {
	private String marca;
	private String culoare;
	private int viteza_curenta;
	private int treapta_curenta;
	private int viteza_maxima;
	private Sofer sofer_masina;
	private int nr;
	private Radio radio_masina;


	public void setare(int m,int n) 
	{
		viteza_curenta=m;
		treapta_curenta=n;
		
	}
	public void treapta_viteza_setare()
	{if(viteza_curenta==0)
		treapta_curenta=1;
		if(viteza_curenta >0 && viteza_curenta<50)
			 treapta_curenta=2;
		if(viteza_curenta>=50 &&viteza_curenta<=60)
			treapta_curenta=3;
		 if(viteza_curenta>60 &&viteza_curenta <90)
			 treapta_curenta=4;
		 if(viteza_curenta>90)
			 treapta_curenta=5;
		
	}
	//supraincarcam metoda "setare" , facand o metoda cu acelasi nume dar cu atributii diferite
	public void setare(int m, String s)
	{
		treapta_curenta=m;
		culoare=s;
	}
	
	 public void set_characteristics(Autovehicul car_1,String marca1,String  culoare1,int viteza_maxima_1,Sofer sofer_masina_1,String nume_sofer_1,Radio radio_masina_1,int nr_1)
	  {  
		 car_1.set_culoare(culoare1);
		 car_1.set_viteza_maxima(viteza_maxima_1);
		 car_1.set_marca(marca1);
         car_1.sofer_masina=sofer_masina_1;
         car_1.radio_masina=radio_masina_1;
         car_1.nr=nr_1;
		 System.out.println("Autovehiculul nr " +nr_1 + "  are urmatoarele caracteristici: "+ marca1 + " " + culoare1 + " " + viteza_maxima_1 + "   " + nume_sofer_1);
		 
		    
		   }
	 public void set_culoare(String c)
	 {
		 culoare=c;
	 }
	 public void set_viteza_maxima(int m)
	 {
		 
		 viteza_maxima=m;
	 }
	 public void set_marca(String s)
	 { 
		  marca=s;
	 }
	public String get_color() {

		return this.culoare;
	}
	public int get_viteza_curenta()
	{
		return this.viteza_curenta;
	
	}
	public int get_treapta_curenta()
	{
		return this.treapta_curenta;
		
	}
	public String get_marca()
	{
		return this.marca;
	}
	
	public int get_viteza_maxima()
	{
		 return this.viteza_maxima;
	}
	
	public void accelerare(int viteza_dorita)
	{ 
		 while(viteza_curenta<viteza_dorita) {
			 viteza_curenta=viteza_curenta+20;
			 System.out.println(" Acum viteza este de " + viteza_curenta + "km/ora");
			 treapta_viteza_setare();
				System.out.println("Treapta curenta de viteza este " + treapta_curenta);
		 }
	}
	public void decelerare(int viteza_dorita_2)
	{
		 while(viteza_curenta>viteza_dorita_2)
		 {
			 viteza_curenta=viteza_curenta-20;
			 System.out.println("Viteza a ajuns la " + viteza_curenta + "km/ora");
			 treapta_viteza_setare();
				System.out.println("Treapta curenta de viteza este " + treapta_curenta);
			 
		 }
	}
	
	public void schimba_viteza( int viteza_dorita_3)
	{  if(viteza_curenta==viteza_dorita_3)
	   System.out.println("Am ajuns la " + viteza_curenta + ".");
	treapta_viteza_setare();
	System.out.println("Treapta curenta de viteza este " + treapta_curenta);
	
		if(viteza_dorita_3>viteza_curenta)
		   while(viteza_curenta<viteza_dorita_3) {
			viteza_curenta=viteza_curenta+10;
			System.out.println("Am ajuns la viteza "+ viteza_curenta);
			treapta_viteza_setare();
			System.out.println("Treapta curenta de viteza este " + treapta_curenta);
		}
		
		else
			while(viteza_curenta>viteza_dorita_3)
		{
				treapta_viteza_setare();
				System.out.println("Treapta curenta de viteza este " + treapta_curenta);
			viteza_curenta=viteza_curenta-10;
			System.out.println("Am ajuns la viteza " + viteza_curenta);
		}
			
	}
	
	
	
	public void oprire()
	{
		 viteza_curenta=0;
		 treapta_curenta=1;
		 System.out.println("Masina s-a oprit.");
	}
	
	
	
	
	
	public static void main (String[] args)
	{
		Autovehicul car1= new Autovehicul();
		Sofer sofer_masina_1=new Sofer();
		Radio radio_masina_1=new Radio();
		Pasageri_Blablacar pasageri_1=new Pasageri_Blablacar();
		 car1.set_characteristics(car1,"Audi","Rosu",300,sofer_masina_1,"Ionut",radio_masina_1,1);
		 car1.sofer_masina.set_characteristics_sofer(sofer_masina_1,"Ionut","Andrei",42,"22048203242");
		 System.out.println("Schimbam culoarea autovehiculului. " );
		 car1.set_culoare("Negru");
		 String new_color_car1=car1.get_color();
		 System.out.println("Culoarea  curenta a masinii nr 1 "+ " este " + new_color_car1);
		 System.out.println("Acceleram masina pana la viteza de 60 km/ora");
		 car1.setare(0,1);
		 car1.accelerare(60);
		 System.out.println("Schimbam viteza la 200 km/ora.");
		 car1.schimba_viteza(200);
		 System.out.println("Oprim masina . ");
		 car1.oprire();
		 int v1=car1.viteza_curenta;
		 int t1=car1.treapta_curenta;
		 //in unele locuri trebuie apasat de 2 ori enter pentru urmatorul pas
		 System.out.println("Acum ca masina e oprita , viteza curenta e " + v1 + " iar treapta de viteza e " + t1);
		 System.out.println("Aceasta masina are si radio.Va rugam selectati modul dorit: radio sau usb ");
	     System.out.println("Ati selectat: " +  radio_masina_1.scann_and_get_mod_radio());
	     System.out.println("Acum puteti cauta melodia sau artistul dorit. Doriti sa cautati dupa artist sau dupa melodie ?");
	     System.out.println("Ati selectat :"+ radio_masina_1.scann_artist_sau_melodie()+" . Acum puteti alege ce  " + radio_masina_1.scann_artist_sau_melodie() +" doriti sa ascultati:\n ");
	     System.out.println("Acum ascultati : \n " + radio_masina_1.scann_and_get_melodie_sau_artist());
	     System.out.println("V-ati facut un cont in aplicatia Blablacar . Puteti lua pasageri , dar trebuie verificate datele lor.Scrieti numarul pasagerilor: " );
	     String nr=pasageri_1.scann_and_get_nr_pasageri();
	     System.out.println("Sunt "+ nr+" pasageri.");
	     int nr_nr=Integer.parseInt(nr);
	     for(int i=1;i<=nr_nr;i++)
	     {
	    	 System.out.println("Pasagerul cu numarul " +i+ " " + "are datele: ");
	    	 System.out.println("Scrieti numele :");
	    	 String aux_nume=pasageri_1.scann_and_get_nume_pasager();
	    	 System.out.println("\n Numele: " + aux_nume);
	    	 System.out.println("Scrieti varsta:");
	    	 String aux_varsta=pasageri_1.scann_and_get_varsta();
	    	 System.out.println	("\n Varsta: " + aux_varsta);
	    	 System.out.println("Scrieti CNP: ");
	    	 String aux_cnp=pasageri_1.scann_and_get_CNP();
	    	 System.out.println ("\n CNP: "+ aux_cnp );
	    	 System.out.println("Scrieti orasul plecarii: ");
	    	 String aux_oras_plecare=pasageri_1.scann_and_get_pick_up_city();
	    	 System.out.println("\n Orasul plecarii: "+ aux_oras_plecare); 
	    	 System.out.println("Scrieti orasul destinatie:");
	    	 String aux_oras_destinatie=pasageri_1.scann_and_get_destination();
	    	 System.out.println(" \n Orasul destinatie: " + aux_oras_destinatie);
	    	 
	     }
	     System.out.println("Calatorie placuta!");
	     
	      
	   }
	}
