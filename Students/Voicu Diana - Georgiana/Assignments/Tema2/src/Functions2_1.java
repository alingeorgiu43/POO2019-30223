
public class Functions2_1 {
	static int[] intoarcere(int a[]) {
		int aux[] = new int[a.length];
		for(int i=0; i<a.length; i++) {
			aux[i]= a[a.length-i-1];
		}
		return aux;
	}
	
		static int[] ADD(int a[],int b[]){
		int size_a= a.length;
		int size_b= b.length;
		int aux_a[] = intoarcere(a);
		int aux_b[] = intoarcere(b);
		if(size_a>size_b)
		{
			for(int i=0;i<size_b;i++)
			{
				aux_a[i]=aux_a[i]+aux_b[i];
			}
			aux_a =intoarcere(aux_a);
			return aux_a;
			
		}
		else
		{
			for(int i=0;i<size_a;i++)
			{
				aux_b[i]=aux_b[i]+aux_a[i];
			}
			aux_b =intoarcere(aux_b);
			return aux_b;
		}
	}
	
	static int[] SUBTRACT(int a[],int b[]){
		int size_a= a.length;
		int size_b= b.length;
		int aux_a[] = intoarcere(a);
		int aux_b[] = intoarcere(b);
		if(size_a>size_b)
		{
			for(int i=0;i<size_b;i++)
			{
				aux_a[i]=aux_a[i]-aux_b[i];
			}
			aux_a =intoarcere(aux_a);
			return aux_a;
			
		}
		else
		{
			for(int i=0;i<size_a;i++)
			{
				aux_b[i]=aux_b[i]-aux_a[i];
			}
			aux_b =intoarcere(aux_b);
			return aux_b;
		}
	}
	
	static int[] MULTIPLY(int a[],int b[]){
		int size_a= a.length;
		int size_b= b.length;
		int rez[] = new int[size_a+size_b-1];
		for(int i=0;i<size_a;i++)
		{
			for(int j=0;j<size_b;j++)
			{
				rez[i+j] += a[i]*b[j];
			}
		}
		return rez;
	}	
	
	static int[] MUL_SCAL(int a[],int n){
		int size_a= a.length;
		int rez[] = new int[size_a];
		for(int i=0;i<size_a;i++)
		{
			rez[i]= n* a[i];
		}
		return rez;
	}
	
	static int EVAL(int a[], int x) {
		int size_a= a.length;
		int rez=a[0];
		for(int i=1;i<size_a;i++)
		{
			rez= rez*x + a[i];
		}
		return rez;
	}
	
	public static void main (String[] args) {
	}
	
	
}

	
