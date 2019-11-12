import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutput {
	public int count=0;
	public void readFromFile(Polynomials p) {
		File file = new File("C:\\Users\\user\\Desktop\\Malin\\2.1\\pol.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		p.s1 = sc.nextLine();
		p.s2 = sc.nextLine();
		
		if(sc.hasNext()!=false)
			sc.nextLine();
		while(sc.hasNext()!=false) {
			p.operations[count]=sc.nextLine();
			count++;
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
				
	}

}
