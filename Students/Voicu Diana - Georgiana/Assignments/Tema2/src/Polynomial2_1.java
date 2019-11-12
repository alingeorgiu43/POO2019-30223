import java.io.File;
import java.io.PrintWriter;
public class Polynomial2_1 {
	public Polynomial2_1(int a[]) throws Exception{
		
		File file2= new File("output2.txt");
		PrintWriter pw= new PrintWriter(file2);
		
		int putere=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(putere == 0)
			{
				if(a[i]<0)
					{
					System.out.print(a[i]);
					pw.print(a[i]);
					}
				else if(a[i]>0)
				{
					System.out.print("+"+a[i]);
					pw.print("+"+a[i]);
				}
			} 
			else if(putere == 1)
			{
				if(a[i]<0)
					{
					System.out.print(a[i]+"x");
					pw.print(a[i]+"x");
					}
				else if(a[i]>0)
				{
					System.out.print("+"+a[i]+"x");
					pw.print("+"+a[i]+"x");
				}
			}
			else if(putere == a.length-1)
			{
				System.out.print(a[i]+"x^"+putere);
				pw.print(a[i]+"x^"+putere);
			}
			else
			{
				if(a[i]<0)
				{
					System.out.print(a[i]+"x^"+putere);
					pw.print(a[i]+"x^"+putere);
				}
				else if (a[i]>0)
				{
					System.out.print("+"+a[i]+"x^"+putere);
					pw.print("+"+a[i]+"x^"+putere);
				}
			}
			putere--;
		}
	}
	}


