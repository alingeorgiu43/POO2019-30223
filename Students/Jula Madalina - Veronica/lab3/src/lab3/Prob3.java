package lab3;

public class Prob3 {

	 static void countCharacter(String str) 
	    {  
	        int vocale = 0, consoane = 0; 
	      
	        for (int i = 0; i < str.length(); i++) { 
	              
	            char c = str.charAt(i); 
	      
	            if ( (c >= 'a' && c <= 'z') ||  
	                (c >= 'A' && c <= 'Z') ) { 
	      
	                c = Character.toLowerCase(c);; 
	      
	                if (c == 'a' || c == 'e' || c == 'i' || 
	                    c == 'o' || c == 'u') 
	                    vocale++; 
	                else
	                    consoane++; 
	            } 
	            
	        } 
	          
	        System.out.println("Vocale: " + vocale); 
	        System.out.println("Consoane: " + consoane); 
	        
	    } 
	public static void main(String[] args) {
		 
		String str = "Nu am stiut tema"; 
         
	        countCharacter(str); 

	}

}
