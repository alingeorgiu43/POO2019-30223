import java.io.File;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {
	public static void main (String argv[]) throws IOException	
	{
			File f=new File("pol.txt");
			Scanner s=new Scanner(f);
			PrintWriter writer = new PrintWriter("output.txt");
			
			
			Polinom primulPolinom=new Polinom();
			
			
			String numere=s.nextLine();
			
			int ok=0;
			int nr=0;
			int p=1;
			int k=0;
			for(int i=0; i<numere.length(); i++)
				if (numere.charAt(i)==' ')
				{
					if(ok==1)
						primulPolinom.sir[k]=nr*(-1);
					else
						primulPolinom.sir[k]=nr;
					k++;
					p=1;
					nr=0;
					ok=0;
				}
				else
				{
					if(numere.charAt(i)=='-')
					{
						ok=1;
					}
					else
					{
						nr=nr*p;
						nr=nr+Character.getNumericValue(numere.charAt(i));
						p=p*10;
					}
				}
			if(ok==1)
				primulPolinom.sir[k]=nr*(-1);
			else
				primulPolinom.sir[k]=nr;
			k++;
			primulPolinom.lungime=k;
			
			
			primulPolinom.invers(primulPolinom.sir, primulPolinom.lungime);
			
			
			Polinom alDoileaPolinom=new Polinom();
			
			numere=s.nextLine();
			
			ok=0;
			nr=0;
			p=1;
			k=0;
			for(int i=0; i<numere.length(); i++)
				if (numere.charAt(i)==' ')
				{
					if(ok==1)
						alDoileaPolinom.sir[k]=nr*(-1);
					else
						alDoileaPolinom.sir[k]=nr;
					k++;
					p=1;
					nr=0;
					ok=0;
				}
				else
				{
					if(numere.charAt(i)=='-')
					{
						ok=1;
					}
					else
					{
						nr=nr*p;
						nr=nr+Character.getNumericValue(numere.charAt(i));
						p=p*10;
					}
				}
			if(ok==1)
				alDoileaPolinom.sir[k]=nr*(-1);
			else
				alDoileaPolinom.sir[k]=nr;
			k++;
			alDoileaPolinom.lungime=k;
			
			for(int i=0; i<alDoileaPolinom.lungime; i++)
				System.out.print(alDoileaPolinom.sir[i]+" ");
			
			alDoileaPolinom.invers(alDoileaPolinom.sir, alDoileaPolinom.lungime);
			
			Function functie=new Function();
			while(s.hasNext())
			{
				functie.comanda= s.next();
				System.out.println(functie.comanda);
				if (functie.comanda.equals("ADD"))
				{
					writer.print("Adunarea: ");
					int[] suma=functie.adunare(primulPolinom.lungime, alDoileaPolinom.lungime, primulPolinom.sir, alDoileaPolinom.sir);
					for(int i=0; i<suma.length; i++) 
					
						if (suma[i]!=0)
						{
							if(suma[i]>0 && i!=0 )
								writer.print("+" + suma[i]+ "x^" + i + " ");
							else
								writer.print(suma[i]+ "x^" + i + " ");
						}
					writer.println();
					
				}
			else
					if (functie.comanda.equals("SUBTRACT"))
					{
						writer.print("Scaderea: ");
						int[] diferenta=functie.scadere(primulPolinom.lungime, alDoileaPolinom.lungime, primulPolinom.sir, alDoileaPolinom.sir);
						for(int i=0; i<diferenta.length; i++)
							if (diferenta[i]!=0)
							{
								if(diferenta[i]>0 && i!=0 )
									writer.print("+" + diferenta[i]+ "x^" + i + " ");
								else
									writer.print(diferenta[i]+ "x^" + i + " ");
							}
						writer.println();
					}
					else
						if (functie.comanda.equals("MULTIPLY"))
						{
							writer.print("Inmultirea: ");
							int[] produs=functie.inmultire(primulPolinom.lungime, alDoileaPolinom.lungime, primulPolinom.sir, alDoileaPolinom.sir);
							for(int i=0; i<produs.length; i++)
								if (produs[i]!=0)
								{
									if(produs[i]>0 && i!=0 )
										writer.print("+" + produs[i]+ "x^" + i + " ");
									else
										writer.print(produs[i]+ "x^" + i + " ");
								}
							writer.println();
						}
						else
							if (functie.comanda.equals("MUL_SCAL"))
							{
								
								functie.comanda= s.next();
								//System.out.println(functie.comanda);
								int scalar=Integer.parseInt(functie.comanda);
								writer.print("Inmultirea primului polinom cu "+ scalar +": ");
								int[] produs=functie.inmultireCuUnScalar(primulPolinom.lungime, primulPolinom.sir, scalar);
								for(int i=0; i<produs.length; i++)
									if (produs[i]!=0)
									{
										if(produs[i]>0 && i!=0 )
											writer.print("+" + produs[i]+ "x^" + i + " ");
										else
											writer.print(produs[i]+ "x^" + i + " ");
									}
								writer.println();
								writer.print("Inmultirea celui de al doilea polinom cu "+ scalar +": ");
								int[] produs1=functie.inmultireCuUnScalar(alDoileaPolinom.lungime, alDoileaPolinom.sir, scalar);
								for(int i=0; i<produs1.length; i++)
										if (produs1[i]!=0)
										{
											if(produs1[i]>0 && i!=0 )
												writer.print("+" + produs1[i]+ "x^" + i + " ");
											else
												writer.print(produs1[i]+ "x^" + i + " ");
										}
									writer.println();
							}
							else
								if (functie.comanda.equals("EVAL"))
								{
									functie.comanda= s.next();
									//System.out.println(functie.comanda);
									int scalar=Integer.parseInt(functie.comanda);
									writer.print("primulPolinom("+scalar+")=");
									writer.println(functie.evaluarePol(primulPolinom.lungime, primulPolinom.sir, scalar));
									writer.print("alDoileaPolinom("+scalar+")=");
									writer.println(functie.evaluarePol(alDoileaPolinom.lungime, alDoileaPolinom.sir, scalar));
								}		
			
			}	
		
		primulPolinom.invers(primulPolinom.sir, primulPolinom.lungime);
		alDoileaPolinom.invers(alDoileaPolinom.sir, alDoileaPolinom.lungime);
		
		functie.impartirePolinoame(primulPolinom.sir,alDoileaPolinom.sir,primulPolinom.lungime,alDoileaPolinom.lungime);	
			
			
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.println("Dati polinomul");
		String pol=input.nextLine();
		System.out.println("Scrierea coeficientilor polinomului incepe de la coeficientul lui x^0");
		functie.citirePolinom(pol);

		writer.close();
		s.close();
		
	}
}
