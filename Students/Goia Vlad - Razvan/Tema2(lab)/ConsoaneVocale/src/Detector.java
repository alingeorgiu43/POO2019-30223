
public class Detector {
	
		protected String vocale = new String("AEIOUaeiou");
		
		public int numVocale (String s)
		{
			if(s.length()==0)
			{
				return 0;
			} else {
				if(vocale.indexOf(s.charAt(s.length()-1))!=-1)
				{
					return 1+numVocale(s.substring(0,s.length()-1));
				}
				else
				{
					return numVocale(s.substring(0,s.length()-1));
				}
			}
		}
		
		public int numConsoane (String s)
		{
			if(s.length()==0)
			{
				return 0;
			} else {
				if(vocale.indexOf(s.charAt(s.length()-1))==-1 && s.charAt(s.length()-1)>='A' && s.charAt(s.length()-1)<='z')
				return 1+numConsoane(s.substring(0,s.length()-1));
				else
				return numConsoane(s.substring(0,s.length()-1));
			}
		}

		public void poz (String s,char c)
		{
			int k = 0;
			System.out.println("Pozitia literei alese: ");
			while(s.indexOf(c)!=-1)
			{
				int index = s.indexOf(c);
				System.out.print((k+index)+" ");
				k=k+index+1;
				s = s.substring(index+1);
			}
		}
		public static void main(String[] args) {
			Detector det = new Detector();
			String s = new String("qwaeratayuiopasd");
			int a = det.numConsoane(s);
			int b = det.numVocale(s);
			det.poz(s,'a');
			System.out.println("\nNr vocale: "+ b +"\nNr consoane: "+ a);
		}
	}

