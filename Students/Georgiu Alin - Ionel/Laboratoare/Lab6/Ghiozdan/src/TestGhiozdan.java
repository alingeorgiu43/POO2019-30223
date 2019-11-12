
public class TestGhiozdan {

	public static void main(String[] args) {
		Ghiozdan ghiozdan=new Ghiozdan();
		for(int i=0;i<5;i++) {
			int pickItem=(int)(Math.random()*(2));
			if(pickItem==0) {
				Caiet caiet=new Caiet();
				ghiozdan.addCaiet(caiet);
			}
			else
			{
				Manual manual=new Manual();
				ghiozdan.addManual(manual);
			}
			
		}
		System.out.println("Numar rechizite:"+ghiozdan.getNrRechizite());
		System.out.println("Numar caiete:"+ghiozdan.getNrCaiete());
		System.out.println("Numar manuale:"+ghiozdan.getNrManuale());
		
		System.out.println("Lista de caiete:");
		ghiozdan.listCaiete();
		
		System.out.println();
		
		System.out.println("Lista de manuale:");
		ghiozdan.listManuale();
		
		System.out.println();
		System.out.println("Lista de rechizite:");
		ghiozdan.listItems();
		
		
	}
	
}
