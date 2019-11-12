import java.io.*;
import java.util.*;

public class CalculPoli {

	//nu am scris in fisier

	public static void main(String[] args) throws IOException{
		File f = new File("pol.txt");

		try (Scanner r = new Scanner(f))
		{
			int n = 8;
			int m = 3;
//am dat gradele polinoamelor prestabilit :(
			polinom p1 = new polinom(n);
			polinom p2 = new polinom(m);

			for (int i = n; i >= 0; i--)
			{
				int next_coef1 = r.nextInt();
				p1.coef[i] = next_coef1;
			}

			for (int i = m; i >= 0; i--)
			{
				int next_coef2 = r.nextInt();
				p2.coef[i] = next_coef2;
			}

			PoliAplic operatie = new PoliAplic();

			operatie.PrintPol(p1);
			operatie.PrintPol(p2);
			
				String s;
				s = r.next();

				if (s.equals("ADD"))
				{
					polinom p3 = operatie.adunare(p1, p2);
					operatie.PrintPol(p3);
				}
				s = r.next();
				if (s.equals("SUBTRACT"))
				{
					polinom p3 = operatie.scadere(p1, p2);
					operatie.PrintPol(p3);
				}
				s = r.next();
				if (s.equals("MULTIPLY"))
				{
					polinom p3 = operatie.inmultire(p1, p2);
					operatie.PrintPol(p3);
				}
				s = r.next();
				if (s.equals("MUL_SCAL"))
				{
					int scalar = r.nextInt();
					polinom p3 = operatie.inmultireScalar(p1, scalar);
					polinom p4 = operatie.inmultireScalar(p2, scalar);
					operatie.PrintPol(p3);
					operatie.PrintPol(p4);
				}
				s = r.next();
				if (s.equals("EVAL"))
				{
					int val = r.nextInt();
					int p1_de_val = operatie.eval(p1, val);
					int p2_de_val = operatie.eval(p2, val);
					System.out.println(p1_de_val);
					System.out.println(p2_de_val);
				}

		} 
	}
}

