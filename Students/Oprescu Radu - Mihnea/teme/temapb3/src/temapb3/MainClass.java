package temapb3;
import java.util.*;



public class MainClass {

	private static int max;
	public static int palindrom(int a) {
		
		int invers=0;
		int copa=a;
		
		while(copa!=0){
			invers=invers*10+copa%10;
			copa=copa/10;
		}
		if(a==invers)
			return 1;
		else
			return 0;
		
	}
	
	
	public static void main(String[] args) {
	
		max=0;
		for(int i=999;i>=900;i--) {
			for(int j=i;j>=900;j--) {
				if(palindrom(i*j)==1) {
					max=i*j;
					System.out.println(max);
					return;
				}
				
			}
			
		}
		
		
	}

}
