

public class MatrixOperations {
	
	public static void display(int a[][], int n, int m) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++)
				System.out.print(" " + a[i][j]);
			System.out.print("\n");
		}
	}
	public static int[][] add(int a[][], int b[][], int n, int m) {
		int sum[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) 
				sum[i][j] = a[i][j] + b[i][j];
			}
		return sum;
	}
	
	public static int[][] substract(int a[][], int b[][], int n, int m) {
		int dif[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) 
				dif[i][j] = a[i][j] - b[i][j];
			}
		return dif;
	}
	
	public static int[][] multiply(int a[][], int b[][], int n, int m) {
		int prod[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				for(int k=0; k<m; k++) {
				prod[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return prod;
	}
	
	public static int[][] multiplyScalar(int a[][], int b[][], int n, int m, int scalar) {
		int prod[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				prod[i][j] = a[i][j] * scalar;
				}
			}
		return prod;
	}
	
	public static double determinant(int a[][]) {
		int t[][];
		double det=0;
		if(a.length == 1) {
			det = a[0][0];
			return det;
		}
		if(a.length == 2) {
			det = ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
			return (det);
		}
		for(int i=0; i<a[0].length; i++) {
			t = new int[a.length-1][a[0].length-1];
			for(int j=1; j<a.length; j++) {
				for(int k=0; k<a[0].length; k++) {
					if(k<i) {
						t[j-1][k] = a[j][k];
					}
					else if(k>i) {
						t[j-1][k-1] = a[j][k];
					}
				}
			}
			det += a[0][i] * Math.pow(-1, (int) i) * determinant(t);
		}
		return (det);
		
	}
	public static boolean areEqual(int a[][], int b[][], int n, int m) {
		for(int i=0; i<n; i++) 
			for(int j=0; j<m; j++) 
				if(a[i][j] != b[i][j])
					return false;
		return true;
		
	}
	
	public static boolean isZeroMatrix(int a[][], int n, int m) {
		int k=0;
		for(int i=0; i<n; i++) 
			for(int j=0; j<m; j++) 
				if(a[i][j] != 0) k++;
		if(k == 0)
			return true;
		else
			return false;
		
	}
	
	public static boolean isIdentityMatrix(int a[][], int n, int m) {
		int k=0;
		for(int i=0; i<n; i++) 
			for(int j=0; j<m; j++) 
				if((i == j) && (a[i][j] != 1)) k++;
				else if((i != j) && (a[i][j] != 0)) k++;
		if(k == 0)
			return true;
		else
			return false;
		
	}
	
	public static float fillDegree(int a[][], int n, int m) {
		float fill=0;
		float procent;
		float p=n*m;
		for(int i=0; i<n; i++) 
			for(int j=0; j<m; j++) 
				if(a[i][j] == 0) fill++;
		procent = (fill/100)*p;
		return procent;
	}
	
	public static void main(String[] args) {
		int n=4;
		int m=4;
		int a[][] =  {{1, 0, 2, -1}, 
                	   {3, 0, 0, 5}, 
                       {2, 1, 4, -3}, 
                       {1, 0, 5, 0} }; 
		int b[][] =  {{1, 5, 6, -1}, 
         	   		  {3, 0, 6, 5}, 
                      {2, 3, 4, -9}, 
                      {1, 3, 5, 7} }; 
		int sum[][] = add(a,b,n,m);
		display(sum,n,m);
		System.out.print("\n");
		int dif[][] = substract(a,b,n,m);
		display(dif,n,m);
		System.out.print("\n");
		int prod[][] = multiply(a,b,n,m);
		display(prod,n,m);
		System.out.print("\n");
		int p[][] = multiplyScalar(a,b,n,m,4);
		display(p,n,m);
		double d= determinant(a);
		System.out.println(d);

	}

}
