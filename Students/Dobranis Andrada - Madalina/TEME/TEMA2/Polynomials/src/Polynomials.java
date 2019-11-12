

public class Polynomials {
	public int degree;
	public int[] v;
	
	Polynomials(int degree){
		this.degree=degree;
		this.v=new int[degree];
	}
	Polynomials(int[] v, int degree){
		this.degree=degree;
		this.v=new int[degree];
		for(int i=0; i<degree; i++)
			this.v[i] = v[degree-1-i];
	}
    
	public void display() {
		System.out.printf("Polinomul de grad %d: " ,degree-1);
		for(int i=degree-1; i>=0;i--)
			if(v[i]!=0) {
				if(v[i]<0) System.out.printf("-");
				else if (v[i]>0 && i!=degree-1)
					System.out.printf("+");
				System.out.printf("%d", Math.abs(v[i]));
			    if(i!=0)
			    	System.out.printf("x^%d", i);
			}
		System.out.print("\n");
	}

	/*public static void main(String[] args)throws Exception {
		File file = new File("C:\\Users\\madalina\\Desktop\\POO2019-30223\\Students\\Dobranis Andrada - Madalina\\TEME\\pol.txt");
		Scanner scan= new Scanner(file);
		String s = scan.nextLine(); 
		String[] ints = s.split(" ");
		int l = ints.length;
		int a[] = new int[l];
		for(int i=0; i<l; i++) {
			a[i] = Integer.parseInt(ints[i]);
			System.out.print(a[i]+" "); 
		}
		

	}
	*/

}
