
public class Lottery {
	long numbers=0;
	public void extragere()
	{
		for(int i=0; i<6; i++)
		{
			int nr=(int)(Math.random()*49)+1;
			if(((numbers>>nr)&1)==1)
			{
				i--;
			}
			else
			{
				numbers|=1L<<nr;
				System.out.println(nr);
			}
		}
		System.out.println("Sorted numbers");
		for(int i=0; i<49; i++)
		{
			int nr=(int)(numbers>>i)&1;
			if ((nr&1)==1)
				System.out.println(i);
		}
	}
}
