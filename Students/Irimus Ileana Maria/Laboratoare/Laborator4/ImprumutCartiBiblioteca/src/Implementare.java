
import java.util.Scanner;
public class Implementare {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		Persoana persoana1 = new Persoana();
		
		String nume;
		String prenume;
		int idPermis;
		String dataImprumut;
		int perioadaImprumut;
		int prelungireImprumut;
		
		System.out.print("Introduceti numele persoanei care imprumuta carti ");
		nume = keyboardInput.nextLine();
		persoana1.setNume(nume);
		
		System.out.print("Introduceti prenumele persoanei care imprumuta carti ");
		prenume = keyboardInput.nextLine();
		persoana1.setPrenume(prenume);
		
		System.out.print("Introduceti idPermis ");
		idPermis = keyboardInput.nextInt();
		persoana1.setIdPermis(idPermis);
		
		System.out.print("Introduceti data la care a avut loc imprumutul ");
		dataImprumut = keyboardInput.nextLine();
		persoana1.setDataImprumut(dataImprumut);
		
		System.out.print("Introduceti perioada imprumutului (numar de zile) ");
		perioadaImprumut = keyboardInput.nextInt();
		persoana1.setPerioadaImprumut(perioadaImprumut);
		
		System.out.print("Introduceti cu cate zile vreti sa fie prelungita perioada imprumutului ");
		prelungireImprumut = keyboardInput.nextInt();
		
		
		Carte carte1 = new Carte();
		carte1.setAutor("Liviu Rebreanu");
		carte1.setNume("Ion");
		carte1.setEditura("Humanitas");
		carte1.setCod(100);
		
		Carte carte2 = new Carte();
		carte2.setAutor("Ion Creanga");
		carte2.setNume("Povestea lui Harap-Alb");
		carte2.setEditura("Humanitas");
		carte2.setCod(215);
		
		Lista lista = new Lista();
		Carte[] arrCarti = new Carte[10];
		arrCarti[0] = carte1;
		arrCarti[1] = carte2;
		lista.setCarti(arrCarti);
		
		persoana1.prelungireImprumut(prelungireImprumut);
		System.out.println("Perioada imprumutului: " + persoana1.getPerioadaImprumut());
		System.out.println("Lista cartilor imprumutate este:");
		lista.printareCartiImprumutate();
		

	}

}
