import java.math.BigDecimal;
import java.util.*;
public class MatrixOperations {
	public static void main(String argv[])
	{
		Scanner input=new Scanner(System.in);
		int dimensiune=input.nextInt();
		BigDecimal[][] matrice1=new BigDecimal[dimensiune][dimensiune];
		BigDecimal unu=new BigDecimal(1);
		BigDecimal zero=new BigDecimal(0);
		matrice1[0][0]=zero;
		matrice1[0][1]=zero;
		matrice1[1][0]=zero;
		matrice1[1][1]=zero;

		
		BigDecimal[][] matrice2=new BigDecimal[dimensiune][dimensiune];
		matrice2[0][0]=unu;
		matrice2[0][1]=unu;
		matrice2[1][0]=unu;
		matrice2[1][1]=zero;
	
		BigDecimal[][] suma=new BigDecimal[matrice1.length][matrice1.length];
		suma=add(matrice1,matrice2);
		for(int i=0; i<matrice1.length; i++) 
		{
			for(int j=0; j<matrice1.length; j++)
				System.out.print(suma[i][j]+ " ");
			System.out.println();
		}
		
		
		BigDecimal[][] diferenta=new BigDecimal[matrice1.length][matrice1.length];
		diferenta=subtract(matrice1,matrice2);
		for(int i=0; i<matrice1.length; i++) 
		{
			for(int j=0; j<matrice1.length; j++)
				System.out.print(diferenta[i][j]+ " ");
			System.out.println();
		}
		
		BigDecimal[][] produs=new BigDecimal[matrice1.length][matrice1.length];
		
		
		produs=multiplyScalar(matrice1,zero);
		for(int i=0; i<matrice1.length; i++) 
		{
			for(int j=0; j<matrice1.length; j++)
				System.out.print(produs[i][j]+ " ");
			System.out.println();
		}
		
		System.out.println(areEqual(matrice1,matrice2));
		System.out.println(isZeroMatrix(matrice1));
		System.out.println(isIdentityMatrix(matrice1));
		System.out.println(fillDegree(matrice2));
		System.out.println(determinant(matrice2,matrice2.length));
		input.close();
	}
	
	public static BigDecimal[][] add(BigDecimal[][] matrice1, BigDecimal[][] matrice2)
	{
		BigDecimal[][] suma=new BigDecimal[matrice1.length][matrice1.length];
		for(int i=0; i<matrice1.length; i++)
			for(int j=0; j<matrice1.length; j++)
				suma[i][j]=matrice1[i][j].add(matrice2[i][j]);
		return suma;
	}
	
	public static BigDecimal[][] subtract(BigDecimal[][] matrice1, BigDecimal[][] matrice2)
	{
		BigDecimal[][] diferenta=new BigDecimal[matrice1.length][matrice1.length];
		for(int i=0; i<matrice1.length; i++)
			for(int j=0; j<matrice1.length; j++)
				diferenta[i][j]=matrice1[i][j].subtract(matrice2[i][j]);
		return diferenta;
	}
	
	
	public static BigDecimal[][] multiply(BigDecimal[][] matrice1, BigDecimal[][] matrice2)
	{
		BigDecimal[][] produs=new BigDecimal[matrice1.length][matrice1.length];
		BigDecimal aux=new BigDecimal(1);
		BigDecimal zero=new BigDecimal(0);
		for(int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1.length; j++) {
            	produs[i][j]=zero;
                for (int k = 0; k < matrice1.length; k++) {
                	aux=(matrice1[i][k].multiply(matrice2[k][j]));
                	produs[i][j]=produs[i][j].add(aux);
                }
            }
        }
        return produs;
	}
	
	public static BigDecimal[][] multiplyScalar(BigDecimal[][] matrice, BigDecimal scalar)
	{
		BigDecimal[][] produs=new BigDecimal[matrice.length][matrice.length];
		for(int i = 0; i < matrice.length; i++) 
            for (int j = 0; j < matrice.length; j++)
            {
            	produs[i][j]=matrice[i][j].multiply(scalar);
            }
		return produs;
	}
	
	
	public static boolean areEqual(BigDecimal[][] matrice1,BigDecimal[][] matrice2)
	{
		int ok=1;
		for(int i=0; i<matrice1.length; i++)
			for(int j=0; j<matrice2.length; j++)
			{
				if(matrice1[i][j].equals(matrice2[i][j])==false)
					ok=0;
			}
		if (ok==1)
			return true;
		else
			return false;
		
	}
	
	public static boolean isZeroMatrix(BigDecimal[][] matrice)
	{
		BigDecimal zero=new BigDecimal(0);
		int ok=1;
		for (int i=0; i<matrice.length; i++)
			for (int j=0; j<matrice.length; j++)
				if (matrice[i][j].equals(zero)==false)
					ok=0;
		if (ok==1)
			return true;
		else
			return false;
				
	}
	
	public static boolean isIdentityMatrix(BigDecimal[][] matrice)
	{
		BigDecimal zero=new BigDecimal(0);
		BigDecimal unu=new BigDecimal(1);
		int ok=1;
		for (int i=0; i<matrice.length; i++)
			for (int j=0; j<matrice.length; j++)
			{
				if (i==j && matrice[i][j].equals(unu)==false)
					ok=0;
				if (matrice[i][j].equals(zero)==false && i!=j)
					ok=0;
			}
		if (ok==1)
			return true;
		else
			return false;
	}
	
	public static double fillDegree(BigDecimal[][] matrice)
	{
		int k=0;
		BigDecimal zero=new BigDecimal(0);
		for (int i=0; i<matrice.length; i++)
			for (int j=0; j<matrice.length; j++)
			{
				if (matrice[i][j].equals(zero)==false)
					k++;
			}
		return (k/(matrice.length*matrice.length))*100;
	}
	

    public static void getCofactor(BigDecimal matrice[][], BigDecimal temp[][], int p, int q, int n) 
    { 
        int i = 0, j = 0; 
        for (int row = 0; row < n; row++) 
        { 
            for (int col = 0; col < n; col++) 
            { 
                if (row != p && col != q) 
                { 
                    temp[i][j++] = matrice[row][col]; 
                    if (j == n - 1) 
                    { 
                        j = 0; 
                        i++; 
                    } 
                } 
            } 
        } 
    } 
      
    public static BigDecimal determinant(BigDecimal matrice[][], int n) 
    { 
    	BigDecimal det = new BigDecimal(0); 
      
        if (n == 1) 
            return matrice[0][0]; 
          
        BigDecimal temp[][] = new BigDecimal[matrice.length][matrice.length];  
          
        BigDecimal sign =new BigDecimal(1);  
      
        for (int f = 0; f <n; f++) 
        { 
            getCofactor(matrice, temp, 0, f, n); 
            det=det.add((sign.multiply(matrice[0][f]).multiply(determinant(temp,n-1)) ));

            BigDecimal minusUnu=new BigDecimal(-1);
            sign = sign.multiply(minusUnu);  
        } 
        return det; 
    } 
}
