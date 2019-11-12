import java.util.Scanner;

public class Prob1 {
	 public static void main(String[] args) {
		 int s = 0;
		 for(int i=3;i<=1000;i++)
			 if(i%3 == 0 | i%5 == 0)
				 s = s + i;
		 System.out.println("Suma este " + s);
		 
		 
		 Scanner n = new Scanner(System.in);
		 int x = n.nextInt();
		 
		 s = 0;
		 for(int i=3;i<=x;i++)
			 if(i%3 == 0 | i%5 == 0)
				 s = s + i;
		 
		 System.out.println("Suma este " + s);
		 
		 // aflam care este valoarea maxima pentru k
		 int k = 1000;
		 int sum_ant = 0;
		 while(s>=0) // cand suma devine negativa, atunci max_int se va depasi
		 {
			 sum_ant = s;
			 s = 0;
			 for(int i=3;i<=k;i++)
				 if(i%3 == 0 | i%5 == 0)
					 s = s + i;
			 k++;
		 }
		 System.out.println("Suma este " + sum_ant + " pentru valoarea " + (k-1) );
	 }
}
