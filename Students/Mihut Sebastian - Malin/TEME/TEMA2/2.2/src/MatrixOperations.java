import java.math.BigDecimal;

public class MatrixOperations {
	public static void show(BigDecimal[][] a) {
		int cols=a.length;
		int rows=a[0].length;
		
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	public static BigDecimal[][] ADD(BigDecimal[][] a,BigDecimal[][] b){
		Matrix sum=new Matrix();
		int cols1=a.length;
		int rows1=a[0].length;
		int cols2=b.length;
		int rows2=b[0].length;
		if(cols1==cols2 && rows1==rows2) {
			sum.matrix=new BigDecimal[cols1][rows1];
			for(int i=0;i<cols1;i++) 
				for(int j=0;j<rows1;j++)
					sum.matrix[i][j]=a[i][j].add(b[i][j]);
		}
		return sum.matrix;
	}
	public static BigDecimal[][] SUBTRACT(BigDecimal[][] a,BigDecimal[][] b){
		Matrix sum=new Matrix();
		int cols1=a.length;
		int rows1=a[0].length;
		int cols2=b.length;
		int rows2=b[0].length;
		if(cols1==cols2 && rows1==rows2) {
			sum.matrix=new BigDecimal[cols1][rows1];
			for(int i=0;i<cols1;i++) 
				for(int j=0;j<rows1;j++)
					sum.matrix[i][j]=a[i][j].subtract(b[i][j]);
		}
		return sum.matrix;
	}
	public static BigDecimal[][] MULTIPLY(BigDecimal[][] a,BigDecimal[][] b){
		Matrix product=new Matrix();
		int cols1=a.length;
		int rows1=a[0].length;
		int cols2=b.length;
		int rows2=b[0].length;

		if(rows1==cols2) {
			product.matrix=new BigDecimal[Math.max(cols1,cols2)][Math.max(rows1,rows2)];
			for(int i=0;i<Math.max(cols1,cols2);i++) 
				for(int j=0;j<Math.max(rows1,rows2);j++)
					product.matrix[i][j]=new BigDecimal(0);
					
			for(int i=0;i<rows1;i++) 
				for(int j=0;j<cols2;j++)
					for (int k=0;k<cols1;k++) 
						product.matrix[i][j]=product.matrix[i][j].add(a[i][k].multiply(b[k][j]));
		}
		return product.matrix;
	}	
	public static BigDecimal[][] MULTIPLYSCALAR(BigDecimal[][] a,BigDecimal x){
		Matrix product=new Matrix();
		int cols1=a.length;
		int rows1=a[0].length;
		
		product.matrix=new BigDecimal[cols1][rows1];
		for(int i=0;i<cols1;i++) 
			for(int j=0;j<rows1;j++)
				product.matrix[i][j]=a[i][j].multiply(x);
		return product.matrix;
	}
	public static void getCofactor(BigDecimal[][] a,BigDecimal[][] temp,int p, int q, int n){
		int i = 0, j = 0; 
		  
	    for (int row = 0; row < n; row++) 
	    { 
	        for (int col = 0; col < n; col++) 
	        {  
	            if (row != p && col != q) 
	            { 
	                temp[i][j++] = a[row][col]; 
	  
	                if (j == n - 1) 
	                { 
	                    j = 0; 
	                    i++; 
	                } 
	            } 
	        } 
	    } 
	} 	
	public static BigDecimal determinantOfMatrix(BigDecimal[][] a,int n){ 
		BigDecimal det=new BigDecimal(0);

	    if (n == 1) 
	        return a[0][0]; 
	  
	    Matrix temp=new Matrix();
		temp.matrix=new BigDecimal[n][n];
		
		BigDecimal sign=new BigDecimal(1);
		BigDecimal zero=new BigDecimal(0);
	 
	    for (int f = 0; f < n; f++) 
	    { 
	       
	        getCofactor(a, temp.matrix, 0, f, n); 
	        det = det.add(sign.multiply(a[0][f]).multiply(determinantOfMatrix(temp.matrix, n-1))); 
	  
	        sign = zero.subtract(sign); 
	    } 
	    return det; 
	} 
	public static boolean areEqual(BigDecimal[][] a,BigDecimal[][] b){
		boolean equal=false;
		int cols1=a.length;
		int rows1=a[0].length;
		int cols2=b.length;
		int rows2=b[0].length;
		if(cols1==cols2 && rows1==rows2) {
			for(int i=0;i<cols1;i++) 
				for(int j=0;j<rows1;j++)
					if(a[i][j].equals(b[i][j]))
						equal=true;
					else {
						equal=false;
						return equal;
					}
		}
		return equal;
	}
	public static boolean isZeroMatrix(BigDecimal[][] a){
		boolean b=false;
		BigDecimal zero=new BigDecimal(0);
		int cols1=a.length;
		int rows1=a[0].length;
		for(int i=0;i<cols1;i++) 
			for(int j=0;j<rows1;j++)
				if(a[i][j].equals(zero))
					b=true;
				else {
					b=false;
					return b;
				}
		return b;
	}
	public static boolean isIdentityMatrix(BigDecimal[][] a){
		boolean b=false;
		BigDecimal one=new BigDecimal(1);
		BigDecimal zero=new BigDecimal(0);
		int cols1=a.length;
		int rows1=a[0].length;
		if(cols1==rows1) {
			for(int i=0;i<cols1;i++) {
				if(a[i][i].equals(one))
					b=true;
				else {
					b=false;
					return b;
				}
				for(int j=0;j<rows1;j++)
					if(i!=j) {
						if(a[i][j].equals(zero))
							b=true;
						else {
							b=false;
							return b;
						}
					}
			}
		}
		return b;
	}
	public static BigDecimal fillDegree(BigDecimal[][] a){
		BigDecimal perc;
		BigDecimal zero=new BigDecimal(0);
		int cols1=a.length;
		int rows1=a[0].length;
		int count=0;
		int size=cols1*rows1;
		for(int i=0;i<cols1;i++) 
			for(int j=0;j<rows1;j++)
				if(!a[i][j].equals(zero))
					count++;
		double v=(count*100)/(double)size;
		perc=BigDecimal.valueOf(v);
		return perc;
	}
	public static void main(String[] args) {
	}
}
