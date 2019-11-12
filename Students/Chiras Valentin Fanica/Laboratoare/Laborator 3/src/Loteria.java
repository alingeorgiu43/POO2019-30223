
public class Loteria {
	static void lottery()
	{
		 int[] loto=new int[6];
		 int Random;
		 for(int i =0 ; i<6;i++)
		  {
		  Random =(int)(Math.random() * 50);
		  	for(int j=0;j<i;j++)
		  	{
		  		if(loto[i] == Random)
		  		{
		  			Random=(int)(Math.random()*50);
		  		}  		
		  	}
		 loto[i]= Random;
		 System.out.print(loto[i] + " ");
		  }		
}
	public static void main(String[] args)
{
	
	lottery();
	
	}
}
