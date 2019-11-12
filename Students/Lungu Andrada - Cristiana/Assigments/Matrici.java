package lab3;
import java.math.BigDecimal;
public class Matrici {

	public static int[][] add(int[][] a,int[][] b,int n,int m){
		int[][] rez;
		rez=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				rez[i][j]=a[i][j]+b[i][j];
		return rez;
	}
	public static int[][] substract(int[][] a,int[][] b,int n,int m){
		int[][] rez;
		rez=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				rez[i][j]=a[i][j]-b[i][j];
		return rez;
	}
	public static int[][] multiply(int[][] a,int[][] b,int n,int m){
		int[][] rez=new int[m][n];
		 for(int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                for (int k = 0; k < n; k++) {
	                    rez[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }
		 return rez;
	}
	public static int[][] multiplyScalar(int[][] a,int n,int m,int nr){
		int[][] rez;
		rez=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				rez[i][j]=a[i][j]*nr;
		return rez;
	}
	public static boolean areEquals(int[][] a,int[][] b,int n,int m) {
		int sum=0;
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(a[i][j]!=b[i][j])
					sum++;
		if (sum==0)
			return true;
		else
			return false;
		
	}
	public static boolean isZeroMatrix(int[][] a,int m,int n) {
		int sum=0;
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(a[i][j]!=0)
					sum++;
		if (sum==0)
			return true;
		else
			return false;
		
	}
	public static boolean isIdentityMatrix(int [][] a,int m,int n) {
		int sum=0;
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if ((i==j) && (a[i][j]!=1))
					sum++;
				else
					if((i!=j) && (a[i][j])!=0)
						sum++;
		if (sum==0)
			return true;
		else
			return false;
					
	}
	public static float fillDegree(int[][] a,int m,int n) {
		float procent;
		float elem=n*m;
		float fill=0;
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if (a[i][j]==0)
					fill++;
		procent=(fill/100)*elem;
		return procent;
	}
	public static int determinant(int[][] a){ 
	    int sum=0; 
	    int s;
	    if(a.length==1){ 
	      return(a[0][0]);
	    }
	    for(int i=0;i<a.length;i++){ 
	      int[][]smaller= new int[a.length-1][a.length-1]; 
	      for(int k=1;k<a.length;k++){
	        for(int p=0;p<a.length;p++){
	          if(p<i){
	            smaller[k-1][p]=a[k][p];
	          }
	          else if(p>i){
	            smaller[k-1][p-1]=a[k][p];
	          }
	        }
	      }
	      if(i%2==0){ //sign changes based on i
	        s=1;
	      }
	      else{
	        s=-1;
	      }
	      sum+=s*a[0][i]*(determinant(smaller)); 
	    }
	    return(sum); //returns determinant value. once stack is finished, returns final determinant.
	  }
	public static void main(String[] args) {
		int[][] a;
		int[][] b;
		a=new int[3][3];
		b=new int[3][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=1;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=1;
		a[2][0]=2;
		a[2][1]=3;
		a[2][2]=2;
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=1;
		b[1][0]=0;
		b[1][1]=1;
		b[1][2]=3;
		b[2][0]=2;
		b[2][1]=0;
		b[2][2]=2;
		
		int[][] rez;
		rez=new int[3][3];
		rez=add(a,b,3,3);
		System.out.println("adunarea matricelor=");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				System.out.println(rez[i][j]);
		rez=substract(a,b,3,3);
		System.out.println("Scaderea matricelor=");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				System.out.println(rez[i][j]);
		System.out.println("Inmultirea matricilor=");
		rez=multiply(a,b,3,3);
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				System.out.println(rez[i][j]);
		
		boolean egale=areEquals(a,b,3,3);
		System.out.println("matricele sunt egale?"+egale);
		float procent=fillDegree(b,3,3);
		System.out.println("cat % din elementele matricei sunt =0? "+procent+"%");
		//System.out.println(procent);
		int det =determinant(a);
		System.out.println("determinantul matricei="+det);
	}
}
