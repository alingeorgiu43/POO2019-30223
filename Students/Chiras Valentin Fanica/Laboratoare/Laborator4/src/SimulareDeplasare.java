
class SimulareDeplasare {
		
	static void simulare(Autovehicul autovehicul,int kilometri) {
		int a=kilometri;
	System.out.println(autovehicul.toString());
		autovehicul.oprire();
		while(kilometri!=0)
		{	
			if( kilometri >=a/2)
			autovehicul.accelerare(10);
			else
			autovehicul.decelerare(10);
			if(autovehicul.getViteza()==5)
				autovehicul.setTreapta(1);
			if(autovehicul.getViteza()==30)
				autovehicul.setTreapta(2);
			if(autovehicul.getViteza()==60)
				autovehicul.setTreapta(3);
			if(autovehicul.getViteza()>=90)
				autovehicul.setTreapta(4);
			if(kilometri==1)
				autovehicul.oprire();	
			kilometri--;
			System.out.println(autovehicul.getViteza() + " " +autovehicul.getTreapta());
		}
	}
}