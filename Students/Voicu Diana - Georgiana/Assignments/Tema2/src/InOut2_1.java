import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
//input - output class
public class InOut2_1 {
	
	public static void main (String[] args) throws Exception {
		File file = new File("C:\\Users\\dyana\\Desktop\\pol.txt");
		File file2= new File("output.txt");
		Scanner sc= new Scanner(file);
		PrintWriter pw= new PrintWriter(file2);
		
		String s =sc.nextLine();
		String[] ints = s.split(" ");
		int lung= ints.length;
		int a[] = new int[lung];
		for(int i=0;i<lung;i++)
		{
			a[i]= Integer.parseInt(ints[i]);
			//System.out.print(a[i]+" ");
		}
		 //System.out.println(" ");
		Polynomial2_1 p = new Polynomial2_1(a);
		System.out.println(" ");
		 
		String s2 =sc.nextLine();
		String[] ints2 = s2.split(" ");
		int lung2= ints2.length;
		int b[]= new int[lung2];
		for(int i=0;i<lung2;i++)
		{
			b[i]= Integer.parseInt(ints2[i]);
			//System.out.print(b[i]+" "); 
		}
		Polynomial2_1 p2 = new Polynomial2_1(b);
		System.out.println(" ");
		
		//while (sc.hasNextLine()) 
		     // System.out.println(sc.nextLine());
		Functions2_1 f=new Functions2_1();
		Polynomial2_1 p3 = new Polynomial2_1(f.ADD(a, b));
		System.out.println(" ");
		Polynomial2_1 p4 = new Polynomial2_1(f.SUBTRACT(a, b));
		System.out.println(" ");
		Polynomial2_1 p5 = new Polynomial2_1(f.MULTIPLY(a, b));
		int n=4;
		System.out.println(" ");
		Polynomial2_1 p6= new Polynomial2_1(f.MUL_SCAL(a, n));
		System.out.println(" ");
		Polynomial2_1 p7= new Polynomial2_1(f.MUL_SCAL(b, n));
		System.out.println(" ");
		int x= 2;
		int eval = f.EVAL(a, x);
		System.out.println(+eval);
		int eval2 = f.EVAL(b, x);
		System.out.println(+eval2);
		
	}

}
