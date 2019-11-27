import java.util.ArrayList;
import java.util.Collections;

public class MainController {

	public static void main(String[] args) {
		ArrayList<Persoana> listaPersoane = new ArrayList<Persoana>();
		listaPersoane.add(new Persoana("Georgiu", "Alin", 20));
		listaPersoane.add(new Persoana("Hoza", "Oana", 18));
		listaPersoane.add(new Persoana("Revnic", "Andrei", 21));
		listaPersoane.add(new Persoana("Ondina", "Maria", 25));
		Collections.sort(listaPersoane);
		System.out.println("Persoane dupa sortare in functie de varsta:");
		for(Persoana person:listaPersoane)
			System.out.println(person.getNume()+" "+person.getPrenume()+" "+person.getVarsta());
	}

}
