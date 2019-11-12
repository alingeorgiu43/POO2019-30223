import java.util.Scanner;

public class Radio {
	private String melodie_sau_artist;
	private String mod_radio; // daca e setat pe radio sau usb
	Scanner scann=new Scanner(System.in);
     public  String scann_and_get_mod_radio()
     {
    	   mod_radio=scann.nextLine();
             return mod_radio;
    		 
    		  
     }
     public String scann_and_get_melodie_sau_artist()
     { 
    	 melodie_sau_artist=scann.nextLine();
    	 return melodie_sau_artist;
     }
     
    
     public String scann_artist_sau_melodie()
     {
    	 String a ; 
    	 a=scann.nextLine();
    	 return a;
     }
     

}
