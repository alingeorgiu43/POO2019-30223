
public class MainClass {

	public static void main(String[] args) {
		public class matrice
		{
			int l, c;
			int x[][];
			
			public matrice()
			{
					l = c =2;
					x = new int[2][2];
			}
			
			public matrice(int n, int m)
			{
				if(n <= 0 || m <= 0)
					System.out.println("Numar de linii sau de coloane incorect");
				else
					{
						l = n;
						c = m;	
						x = new int[n][m];
					}			
			}
			
			public int linii()
			{
				return l;	
			}
			
			public int coloane()
			{
				return c;	
			}
			
			//funct pt inmultirea unei matrice cu o constanta
			public void mulConst(int nr)
			{
				for(int i=0; i<l; i++)
					for(int j=0; j<c; j++)
						x[i][j] *= nr;
			}
			
			//funct pt adunarea a doua matrice
			public matrice sum(matrice x)
			{
				matrice suma = new matrice(l, c);
				for(int i=0; i<l; i++)
					for(int j=0; j<c; j++)
						suma.x[i][j]=this.x[i][j] + x.x[i][j];
				
				return suma;
			}
			
			//funct pt scaderea a doua matrice
			public matrice sub(matrice x)	
			{
					matrice dif = new matrice(l, c);
					
					for(int i = 0; i < l; i++)
					   for(int j = 0; j < c; j++)
					   	   dif.x[i][j] = this.x[i][j] - (x.x[i][j]);
					   	   
					return dif;    	     		
			}
			
			//funct pt inmultirea a doua matrice
			public matrice mul(matrice x)
			{
				matrice prod = new matrice(this.linii(), x.coloane());
				int k = 0, i = 0, j = 0;			
				int s = 0;
				
				for(i = 0; i < prod.linii(); i++)
				   for(j = 0; j < prod.coloane(); j++)
				   	   {
				   	   		s = 0;
					     	for(k = 0; k < x.coloane(); k++)
				   	  	       s += this.x[i][k] * (x.x[k][j]);
				   	  	    prod.x[i][j] = s; 
				   	   }      
				   	  
				return prod;    	     		
			}
			
			//funct pentru determinantul unei matrice de 2*2
			public int det(matrice x)
			{
				int determinant = 0;
				determinant = x.x[0][0]*x.x[1][1] - x.x[0][1] * x.x[1][0];
				return determinant;
			}
			
			//funct pentru a verifica daca matricea este o matrice identitate sau nu 
			public boolean ident(matrice x)
			{
				int k = 0;
				for(int i = 0; i < l; i++)
					for(int j = 0; j < c; j++)
					{
						if(i == j && x.x[i][j]==1)
							k = k + 1;
						if(i != j && x.x[i][j]==0)
							k = k + 1;
					}
						
				if(k == c*l)
					return true;
				else 
					return false;
			}
			
			//funct care verifica daca doua matrici sunt egale 
			public boolean areEqual(matrice x)
			{
				int k = 0;
				for(int i = 0; i < l; i++)
					   for(int j = 0; j < c; j++)
					   	   if(this.x[i][j] == (x.x[i][j]));
					   	   		k++;
					   	   		
			    if(k == c*l)
			    	return true;
			    else 
			    	return false;
			}
			
			//funct care verifica daca toate elementele unei matrici sunt egale cu 0
			public boolean isZero(matrice x)
			{
				int k = 0;
				for(int i = 0; i < l; i++)
					   for(int j = 0; j < c; j++)
					   	   if(x.x[i][j] == 0);
					   	   		k = k + 1;
				if(k == c*l)
					return true;
				else 
					return false;
			}
			
			//funct care calculeaza cat la suta din matrice are elemente diferite de 0
			public double fillDegree(matrice x)
			{
				int k = 0;
				int elem = c * l;
				double procent = 0.0;
				for(int i = 0; i < l; i++)
					   for(int j = 0; j < c; j++)
					   	   if(x.x[i][j] != 0);
					   	   		k = k + 1;
			    procent = k / elem;
			    return procent;
				
			}
		}

	}

}
