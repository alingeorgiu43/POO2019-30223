
public class String_related {

	public static void main(String[] args) {
		String referinta=new String("Emanuel");
		vowelsAndConsonants(referinta);
	}
	
	public static void vowelsAndConsonants(String referinta) {
		int countVowels=0;
		int countConsonants=0;
		
		int indici1[]= new int[referinta.length()];
		int indici2[]= new int[referinta.length()];
		
		referinta=referinta.toLowerCase();
		int size1=0;
		int size2=0;
		
		for(int i=0;i<referinta.length();i++) {
		
			if (referinta.charAt(i) == 'a' || referinta.charAt(i) == 'e' || referinta.charAt(i) =='i'
            || referinta.charAt(i) == 'o' || referinta.charAt(i) == 'u') {
				countVowels++;
				indici1[size1]=i;
				size1++;
			}
			else {
			
				countConsonants++;
				indici2[size2]=i;
				size2++;
			}
		}
		System.out.println("Sunt " + countVowels +" vocale cu indicii: ");
		for(int i=0;i<countVowels;i++)
			System.out.print(indici1[i]+" ");
		System.out.println();
		System.out.println("Sunt " + countConsonants +" consoane cu indicii: ");
		for(int i=0;i<countConsonants;i++)
			System.out.print(indici2[i]+" ");
	}

}
