public class Goldbach {

	public static void main(String[] args) {
		int numere[]=new int[100];
		
		//dam valori sirului numere[]
		for(int i=0;i<100;i++) {
			numere[i]=i;
		}
		
		//
		for(int i=1;i<100;i++) 
			for(int j=i;i+j+2*i*j<100;j++)
				numere[i+j+2*i*j]=0;
			
		//gasim numarul de nr prime
		int size=0;
		for(int i=0;i<100;i++)
			if(numere[i]!=0)
				size++;
		
		//stocam numerele prime intr-un sir
		int nrPrime[]=new int[size];
		int k=0;
		for(int i=0;i<100;i++) {
			if(numere[i]!=0) {
				nrPrime[k]=2*numere[i]+1;
				k++;
			}
		}
		
		//verificam un interval de numere si ne convingem ca doar cele
		//pare respecta conjectura lui Goldbach
		int m=30;
		int n=80;
		while(m<=n) {
			outer:
			for(int i=0;i<size;i++) {
				for(int j=i;j<size;j++) {
					if(m==nrPrime[i]+nrPrime[j]) {
						System.out.println(m+" indeplineste conjectura lui Goldbach");
						break outer;
					}
				}
			}
			m++;	
		}
		
	}
}