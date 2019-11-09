import java.util.*;
import java.lang.String;

public class StringLetters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char ch=in.next().charAt(0);
		StringOperations.getNrVowelsAndConsonants(str);
		StringOperations.vowelClue(str, ch);
		in.close();
	}
}
