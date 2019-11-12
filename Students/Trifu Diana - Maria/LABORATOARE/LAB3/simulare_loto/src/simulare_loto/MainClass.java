package simulare_loto;
import java.lang.Math;

public class MainClass {

	public static void main(String[] args) {
		
		int max = 49; 
        int min = 1; 
        int range = max - min + 1; 
        
        System.out.println("Cele 6 numere extrase din 49 sunt: ");
        
		for(int i=0; i<6; i++)
		{
			int rand = (int)(Math.random() * range) + min; 
			System.out.println(rand); 
		}
	}

}
