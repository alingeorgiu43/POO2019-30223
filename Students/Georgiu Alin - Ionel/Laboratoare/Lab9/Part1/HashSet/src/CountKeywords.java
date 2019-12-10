import java.util.*;
import java.io.*;

public class CountKeywords {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		String filename ="hashSetFile";

		File file = new File("hashSetFile");
		if (file.exists()) {
			System.out.println("Numarul de cuvinte cheie din " + filename + " este " + countKeywords(file));
		} else {
			System.out.println("Fisierul " + filename + " nu exista");
		}
	}

	public static int countKeywords(File file) throws Exception {
		String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };

		Set<String> keywordSet = new HashSet<String>(Arrays.asList(keywordString));
		int count = 0;

		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			String word = input.next();
			if (keywordSet.contains(word))
				count++;
		}
		return count;
	}
}