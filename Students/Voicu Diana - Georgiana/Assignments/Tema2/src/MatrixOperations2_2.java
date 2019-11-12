import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class MatrixOperations2_2 {
	
	static BigDecimal[][] initializare(BigDecimal[][] matrix, int n, int m){
		for (int i = 0; i < n; i++) 
        { for (int j = 0; j < m; j++) 
            { 
        		matrix[i][j]= BigDecimal.valueOf(0);
            }
        }
		return matrix;
	}
	
	static void printare (BigDecimal[][] matrix, int n, int m) {
		for (int i = 0; i < n; i++) { 
            for (int j = 0; j < m; j++) 
            { System.out.print(matrix[i][j] + "  "); }
            System.out.println(); 
            }
	}
	
	static BigDecimal[][] add(BigDecimal[][] matrix, BigDecimal[][] matrix2,int n, int m) throws Exception{
		BigDecimal rez[][] = new BigDecimal[n][m];
		rez= initializare(rez,n,m);
		for (int i = 0; i < n; i++) 
        { for (int j = 0; j < m; j++) 
            { 
        	rez[i][j] = rez[i][j].add(matrix[i][j]);
        	rez[i][j] = rez[i][j].add(matrix2[i][j]);
            }
        }
		return rez;
	}
	
	static BigDecimal[][] subtract(BigDecimal[][] matrix, BigDecimal[][] matrix2,int n, int m) throws Exception{
		BigDecimal rez[][] = new BigDecimal[n][m];
		rez= initializare(rez,n,m);
		for (int i = 0; i < n; i++) 
        { for (int j = 0; j < m; j++) 
            { 
        	rez[i][j] = rez[i][j].add(matrix[i][j]);
        	rez[i][j] = rez[i][j].subtract(matrix2[i][j]);
            }
        }
		return rez;
	}
	
	static BigDecimal[][] multiply(BigDecimal[][] matrix, BigDecimal[][] matrix2,int n, int m) throws Exception{
		BigDecimal rez[][] = new BigDecimal[n][m];
		rez= initializare(rez,n,m);
		BigDecimal partial = BigDecimal.valueOf(0);
		for (int i = 0; i < n; i++) 
        { for (int j = 0; j < n; j++) 
            { 
        		for(int k = 0; k < m; k++)
        		{
        			partial= partial.add(matrix[i][k].multiply(matrix2[k][j]));
        		}
        		rez[i][j]= partial;
            }
        }
		return rez;
	}
	
	static BigDecimal[][] multiplyScalar(BigDecimal[][] matrix,BigDecimal scalar,int n, int m) throws Exception{
		BigDecimal rez[][] = new BigDecimal[n][m];
		rez= initializare(rez,n,m);
		BigDecimal partial = BigDecimal.valueOf(0);
		for (int i = 0; i < n; i++) 
        { for (int j = 0; j < m; j++) 
            { 
        		rez[i][j]= scalar;
        		rez[i][j]= rez[i][j].multiply(matrix[i][j]);
            }
        }
		return rez;
	}
	
	static boolean areEqual(BigDecimal[][] matrix, BigDecimal[][] matrix2,int n, int m) throws Exception{
		for (int i = 0; i < n; i++) 
        { for (int j = 0; j < m; j++) 
        {
        	if(matrix[i][j].equals(matrix2[i][j]) == false) {
        		return false;
        	}
        }
        }
		return true;
	}
	
	static boolean isZeroMatrix(BigDecimal[][] matrix,int n, int m) throws Exception{
		for (int i = 0; i < n; i++) 
        { for (int j = 0; j < m; j++) 
        {
        	if(matrix[i][j].equals(BigDecimal.valueOf(0)) == false) {
        		return false;
        	}
        }
        }
		return true;
	}
	
	static boolean isIdentityMatrix(BigDecimal[][] matrix,int n, int m) throws Exception{
		for (int i = 0; i < n; i++) 
        { for (int j = 0; j < m; j++) 
        {
        	if((i==j) && (matrix[i][j].equals(BigDecimal.valueOf(1))) == false ) {
        		return false;
        	}
        	else if((i!=j) && (matrix[i][j].equals(BigDecimal.valueOf(0))) == false) {
        		return false;
        	}
        }
        }
		return true;
	}
	
	static BigDecimal fillDegree(BigDecimal[][] matrix,int n, int m) throws Exception{
		BigDecimal ct = BigDecimal.valueOf(0);
		BigDecimal nr_n = BigDecimal.valueOf(n);
		BigDecimal nr_m = BigDecimal.valueOf(m);
		
		for (int i = 0; i < n; i++) 
        { for (int j = 0; j < m; j++) 
        {
        	if(matrix[i][j].equals(BigDecimal.valueOf(0)) == false){
        		ct = ct.add(BigDecimal.valueOf(1));
        	}
        }
        }
		//double percentage = (ct/(n*m))*100;
		BigDecimal percentage = BigDecimal.valueOf(0);
		percentage= percentage.add(ct);
		percentage= percentage.divide((nr_n.multiply(nr_m)));
		percentage= percentage.multiply(BigDecimal.valueOf(100));
		return percentage;
		
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduceti dimensiunea n=");
		int n= sc.nextInt();
		System.out.println("Introduceti dimensiunea m=");
		int m= sc.nextInt();
		BigDecimal matrix[][] = new BigDecimal[n][m];
		System.out.println("Introduceti elementele primei matrici"); 
        for (int i = 0; i < n; i++) 
        { for (int j = 0; j < m; j++) 
            { matrix[i][j] = sc.nextBigDecimal();}
        }
        
        System.out.println("Introduceti elementele celei de a doua matrici");
        BigDecimal matrix2[][] = new BigDecimal[n][m];
        for (int i = 0; i < n; i++) 
        { for (int j = 0; j < m; j++) 
            { matrix2[i][j] = sc.nextBigDecimal();}
        }
        
        
        System.out.println("Elementele matrix1:"); 
        printare(matrix,n,m);
         
        System.out.println("Elementele matrix2:");  
        printare(matrix2,n,m);
        
        BigDecimal add[][]= new BigDecimal[n][m];
        add = add(matrix,matrix2,n,m);
        System.out.println("Suma=");
        printare(add,n,m);
        
        
       BigDecimal scadere[][] =  subtract(matrix,matrix2,n,m);
       System.out.println("Scadere=");
       printare(scadere,n,m);
       
       BigDecimal multiplicare[][] =  multiply(matrix,matrix2,n,m);
       System.out.println("Multiplicare=");
       printare(multiplicare,n,m);
       
       System.out.println("Dati un scalar=");
       BigDecimal scalar = sc.nextBigDecimal();
       
       BigDecimal mulscalar[][] = multiplyScalar(matrix,scalar,n,m);
       System.out.println("Multiplicare cu scalar=");
       printare(mulscalar,n,m);
       
       boolean egalitate = areEqual(matrix,matrix2,n,m);
       System.out.println("Rezultatul egalitatii=");
       System.out.println(egalitate);
       
       boolean zero = isZeroMatrix(matrix,n,m);
       System.out.println("Rezultatul isZeroMatrix=");
       System.out.println(zero);
       
       boolean identitate = isIdentityMatrix(matrix,n,m);
       System.out.println("Rezultatul isIdentityMatrix=");
       System.out.println(identitate);
       
       BigDecimal grad = fillDegree(matrix,n,m);
       System.out.println("Rezultatul fillDegree=");
       System.out.println(grad);
          
        
		
	}
}
