import java.util.*;
import java.math.*;
public class Operatii {
	
	static void add( long[][] a, long[][] b, long[][] rez)
	{
		int lenghtLa=a.length;
		int lenghtCa=a[0].length;
		int lenghtLb=b.length;
		int lenghtCb=b[0].length;
		if(lenghtLa!=lenghtLb)
			System.out.println("error: not the same size");
		else
			if(lenghtCa!=lenghtCb)
				System.out.println("error: not the same size");
			else
		for(int i=0;i<lenghtLa;i++)
		{
			for(int j=0;j<lenghtCa;j++)
				rez[i][j]=a[i][j]+(b[i][j]);
		}
	}
	static void areEqual( long[][] a, long[][] b)
	{
		int lenghtLa=a.length;
		int lenghtCa=a[0].length;
		int lenghtLb=b.length;
		int lenghtCb=b[0].length;
		boolean verif=true;
		if(lenghtLa!=lenghtLb)
			System.out.println("error: not the same size");
		else
			if(lenghtCa!=lenghtCb)
				System.out.println("error: not the same size");
			else
		for(int i=0;i<lenghtLa;i++)
		{
			if(verif==false)
				{
				System.out.println("nu sunt identice");
				break;
				}
			for(int j=0;j<lenghtCa;j++)
				if(a[i][j]!=b[i][j])
					{
					verif=false;
					}
		}
		if(verif==true)
			System.out.println("are equal");
	}
	static void multiplyScalar( long[][] a, long[][] rez, int scalar)
	{
		int lenghtLa=a.length;
		int lenghtCa=a[0].length;
		for(int i=0;i<lenghtLa;i++)
		{
			for(int j=0;j<lenghtCa;j++)
			{
				rez[i][j]=a[i][j]*scalar;
			}
		}
	}
	static void isIdentityMatrix( long[][] a)
	{
		int lenghtLa=a.length;
		int lenghtCa=a[0].length;
		boolean verif=true;
		for(int i=0;i<lenghtLa;i++)
		{
			for(int j=0;j<lenghtCa;j++)
			{
				if(i==j && a[i][j]!=1)
					{
					verif=false;
					break;
					}
				else
					if(i!=j && a[i][j]!=0)
						{
						verif=false;
						break;
						}
			}
		}
		if(verif==true)
			System.out.println("the Matrix is an identity Matrix");
		else
			System.out.println("the Matrix is not an identity Matrix");
	}
	static double fillDegree( long[][] a)
	{
		double degree = 0;
		int lenghtLa=a.length;
		int lenghtCa=a[0].length;
		int k=0;
		for(int i=0;i<lenghtLa;i++)
		{
			for(int j=0;j<lenghtCa;j++)
			{
				if(a[i][j]!=0)
					{
					k++;
					}
			}
		}
		degree=(double)(k*100)/(double)(lenghtLa*lenghtCa);
		return degree;
	}
	static void isZeroMatrix( long[][] a)
	{
		int lenghtLa=a.length;
		int lenghtCa=a[0].length;
		boolean verif=true;
		for(int i=0;i<lenghtLa;i++)
		{
			if(verif==false)
			{
				System.out.println("is not zero Matrix");
				break;
			}
			for(int j=0;j<lenghtCa;j++)
			{
				if(a[i][j]!=0);
					verif=false;
			}
		}
		if(verif==true)
			System.out.println("is Zero Matrix");
	}
	
	static void afisare(long a[][], int lenghtL, int lenghtC)
	{
		for(int i=0;i<lenghtL;i++)
		{
			for(int j=0;j<lenghtC;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	
	/*static void afisareAfterMultiply(long a[][], int lenght)
	{
		for(int i=0;i<lenght;i++)
		{
			for(int j=0;j<lenght;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}*/
	static void getCofactor(long mat[][],  long temp[][], int p, int q, int n) 
   { 
       int i = 0, j = 0; 
     
       for (int row = 0; row < n; row++) 
       { 
           for (int col = 0; col < n; col++) 
           { 
                 
               if (row != p && col != q) 
               { 
                   temp[i][j++] = mat[row][col]; 
                   if (j == n - 1) 
                   { 
                       j = 0; 
                       i++; 
                   } 
               } 
           } 
       }
   }
	
	static long determinantOfMatrix(long mat[][], int n, int size) 
    { 
        int D = 0;
       
        if (n == 1) 
            return mat[0][0]; 
          
        long temp[][] = new long[size][size];  
          
        int sign = 1;  
      
        for (int f = 0; f < n; f++) 
        { 
            getCofactor(mat, temp, 0, f, n); 
            D += sign * mat[0][f]  
               * determinantOfMatrix(temp, n - 1, size); 
      
            sign = -sign; 
        } 
      
        return D; 
    }
	
	static void subtract( long[][] a, long[][] b, long[][] rez)
	{
		int lenghtLa=a.length;
		int lenghtCa=a[0].length;
		int lenghtLb=b.length;
		int lenghtCb=b[0].length;
		if(lenghtLa!=lenghtLb)
			System.out.println("error: not the same size");
		else
			if(lenghtCa!=lenghtCb)
				System.out.println("error: not the same size");
			else
		for(int i=0;i<lenghtLa;i++)
		{
			for(int j=0;j<lenghtCa;j++)
				rez[i][j]=a[i][j]-(b[i][j]);
		}
	}
	
	static void multiply(long a[][], long b[][], long rez[][])
	{
		int lenghtLa=a.length;
		int lenghtCa=a[0].length;
		int lenghtLb=b.length;
		int lenghtCb=b[0].length;
		if(lenghtCa!=lenghtLb)
			System.out.println("error");
		else
		{
		for(int i=0;i<lenghtLa;i++){    
			for(int j=0;j<lenghtCb;j++){  
				rez[i][j]=0;
				for(int k=0;k<lenghtCa;k++)      
					{      
						rez[i][j]+=a[i][k]*b[k][j];      
					} 
			}    
			}
		}
	}
	

}
