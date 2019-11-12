import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;

public class OperatiPeMatrici {

	static BigDecimal[][] ADD(BigDecimal[][] a,BigDecimal[][] b)
	{
		int l1,l2,c1,c2;
		l1=a.length;
		l2=b.length;
		c1=a[0].length;
		c2=b[0].length;
	
		if(l1 != l2 || c1!=c2)
		{
			System.out.println("Nu se poate efectua operatia!!");
			return null;
		}
		BigDecimal[][] suma= new BigDecimal[a.length][a[0].length];
		for(int i =0;i<a.length;i++)
			for(int j = 0 ;j<a[0].length;j++)
				suma[i][j]=a[i][j].add(b[i][j]);
		
		return suma;
	}
	static BigDecimal[][] SUB(BigDecimal[][] a,BigDecimal[][] b)
	{
		int l1,l2,c1,c2;
		l1=a.length;
		l2=b.length;
		c1=a[0].length;
		c2=b[0].length;
	
		if(l1 != l2 || c1!=c2)
		{
			System.out.println("Nu se poate efectua operatia!!");
			return null;
		}
		BigDecimal[][] diferenta= new BigDecimal[a.length][a[0].length];
		for(int i =0;i<l1;i++)
			for(int j = 0 ;j<c1;j++)
				diferenta[i][j]=a[i][j].subtract(b[i][j]);
		
		return diferenta;
	}
	
	static BigDecimal[][] MULTIPLY(BigDecimal[][] a, BigDecimal[][] b)
	{
		int l1=a.length;
		int c1=b[0].length;
		if(l1 != c1)
		{
			System.out.println("Nu se poate efectua operatia!!");
			return null;
		}
		BigDecimal[][] produs=new BigDecimal[a.length][b[0].length];
		 for(int i = 0;i<l1;i++)
			 for(int j= 0 ;j < c1;j++)
			 {
				produs[i][j]=BigDecimal.valueOf(0);
				
				 for(int k=0;k<a[0].length;k++) {
					produs[i][j]=produs[i][j].add(a[i][k].multiply(b[k][j])); 
				 }
		}
		 return produs;
}
	static BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal b)
{
		BigDecimal[][] produs = new BigDecimal[a.length][a[0].length];
		for(int i =0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
			{
				
				produs[i][j]=a[i][j].multiply(b);
			}
		
		return produs;
}
	static boolean areEqual(BigDecimal[][] a,BigDecimal[][] b)
{
		if(a.length != b.length)
		{
			return false;
		}
		for(int i =0;i<a.length;i++)
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j].compareTo(b[i][j]) !=0)
					return false;
			}
		return true;
}
	static boolean isZeroMatrix(BigDecimal[][] a)
{
		int l=a.length;
		int c=a[0].length;
		for(int i=0;i<l;i++)
			for(int j=0;j<c;j++)
			{
				if(a[i][j].compareTo(new BigDecimal(0))!=0)
					return false;
			}
		return true;
}
	static boolean isIdentifyMatrix(BigDecimal[][] b)
	{
		for(int i =0 ;i<b.length;i++)
			{
			for(int j  = 0 ; j<b[0].length ; j++)
				{
				if(i==j && b[i][j].compareTo(new BigDecimal(1)) !=0)
					return false;
				}
			}
		return true;
}
	public static void main(String[] args) {
	
		BigDecimal a[][]= {
							{new BigDecimal(1),new BigDecimal(4),new BigDecimal(10)},
							{new BigDecimal(0),new BigDecimal(7),new BigDecimal(9)},
							{new BigDecimal(4),new BigDecimal(6),new BigDecimal(6)},
						};
		BigDecimal b[][]= {
				{new BigDecimal(1),new BigDecimal(4),new BigDecimal(10)},
				{new BigDecimal(0),new BigDecimal(7),new BigDecimal(9)},
				{new BigDecimal(4),new BigDecimal(6),new BigDecimal(6)},
			};
		
		BigDecimal suma[][]=ADD(a,b);
		for(int i =0;i<suma.length;i++) {
			for(int j=0;j<suma.length;j++)
			{
				System.out.print(suma[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		BigDecimal substract[][]=SUB(a,b);
		for(int i =0;i<substract.length;i++) {
			for(int j=0;j<substract.length;j++)
			{
				System.out.print(substract[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		BigDecimal MUL[][]=MULTIPLY(a,b);
		for(int i =0;i<MUL.length;i++) {
			for(int j=0;j<MUL.length;j++)
			{
				System.out.print(MUL[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		boolean equal= areEqual(a,b);
		System.out.println(equal);
		
		boolean iszero= isZeroMatrix(a);
		System.out.println(iszero);
		
		boolean are_equal=areEqual(a,b);
		System.out.println(are_equal);
		
		boolean Identify=isIdentifyMatrix(b);
		System.out.println(Identify);
		
		BigDecimal Matrix[][]=multiplyScalar(b,new BigDecimal(5));
		for(int i =0;i<Matrix.length;i++) {
			for(int j=0;j<Matrix.length;j++)
			{
				System.out.print(Matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
