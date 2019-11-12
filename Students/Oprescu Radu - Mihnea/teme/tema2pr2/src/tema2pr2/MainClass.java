package tema2pr2;
import java.util.*;
import java.math.BigDecimal;

public class MainClass {
	
	public static BigDecimal[][] addM(BigDecimal[][] A, BigDecimal[][] B) { 
		//n- dimensiunea linilor primei matricii;  respectiv a coloanelor
		int n=A.length;
		int m=A[0].length;
		BigDecimal[][] R= new BigDecimal[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				R[i][j].add(A[i][j]);
				R[i][j].add(B[i][j]);
	
			}
		}
		return R;
	}
	
	public static BigDecimal[][] subM(BigDecimal[][] A,BigDecimal[][] B) {
		
		int n=A.length;
		int m=A[0].length;
		BigDecimal[][] R= new BigDecimal[100][100];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				R[i][j].subtract(A[i][j]);
				R[i][j].subtract(B[i][j]);
			}
			
		}
		return R;
	}
	
	public static BigDecimal[][] multiplyM(BigDecimal[][] A, BigDecimal[][] B) { 
		//n- dimensiunea linilor primei matricii;  respectiv a coloanelor
		int n=A.length;
		int m=A[0].length;
		BigDecimal[][] R= new BigDecimal[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				R[i][j].multiply(A[i][j]);
				R[i][j].multiply(B[i][j]);
	
			}
		}
		return R;
	}
	
	public static BigDecimal[][] scalarM(BigDecimal A[][], BigDecimal k) { 
		int n=A.length;
		int m=A[0].length;
		BigDecimal[][] R= new BigDecimal[n][m];
		for (int i = 0; i <n ; i++)  
			for (int j = 0; j < m; j++)  
				R[i][j].multiply(k);  
		return R;
	} 

	public static int equalM(BigDecimal A[][], BigDecimal B[][]) { 
		int n=A.length;
		int m=A[0].length;
		for (int i = 0; i <n ; i++)  
			for (int j = 0; j < m; j++)  
				if(A[i][j]!=B[i][j])
					return 0;
		return 1;
	} 

	
	public static int iszeroM(BigDecimal A[][]) { 
		int n=A.length;
		int m=A[0].length;
		BigDecimal x=new BigDecimal(0);
		for (int i = 0; i <n ; i++)  
			for (int j = 0; j < m; j++)  
				if(A[i][j]!=x)
					return 0;
		return 1;
	} 
	
	 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		BigDecimal[][] A=new BigDecimal[n][m];
		BigDecimal[][] B=new BigDecimal[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++) {
				A[i][j] =in.nextBigDecimal() ;
				B[i][j]=in.nextBigDecimal();
			}

		}

	}
}
