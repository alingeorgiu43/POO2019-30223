
// File: arrays/filelist/Filelistsort.java
// Scop: Listarea coninutului directorului implicit(home) al unui utilizator
// Demonstreaza folosirea Comparators pentru a sorta acelasi tablou
// dupa doua criterii diferite.

import java.util.Arrays;
import java.util.Comparator;
import java.io.*;

public class Filelistsort {

	public static void main(String[] args) {
		// ... Creaza comparatorii pentru sortare.
		Comparator<File> byDirThenAlpha = new DirAlphaComparator();
		Comparator<File> byNameLength = new NameLengthComparator();
		// ... Creaza un obiect a File pentru directorul utilizatorului.
		File dir = new File(System.getProperty("user.home"));
		File[] children = dir.listFiles();
		System.out.println("Fisierele dupa director, apoi alfabetic ");
		Arrays.sort(children, byDirThenAlpha);
		printFileNames(children);

		System.out.println("Fisierele dupa lungimea numelui lor (cel mai lung primul)");
		Arrays.sort(children, byNameLength);
		printFileNames(children);
	}

	// ============================================= printFileNames
	private static void printFileNames(File[] fa) {
		for (File oneEntry : fa) {
			System.out.println(" " + oneEntry.getName());
		}
	}
}

// DirAlphaComparator
// Pentru a sorta directoarele inaintea fisierelor, apoi alfabetic.
class DirAlphaComparator implements Comparator<File> {
	// Interfata Comparator necesita definirea metodei compare.
	public int compare(File filea, File fileb) {
		// ... Sorteaza directoarele inaintea fisierelor,
		// altfel alfabetic fara a tine seama de majuscule/minuscule.

		if (filea.isDirectory() && !fileb.isDirectory()) {
			return -1;
		} else if (!filea.isDirectory() && fileb.isDirectory()) {
			return 1;
		} else {
			return filea.getName().compareToIgnoreCase(fileb.getName());
		}
	}
}

// NameLengthComparator
// Pentru a sorta dupa lungimea numelui de fisier/director (cel mai lung primul).
class NameLengthComparator implements Comparator<File> {
	// Interfata Comparator necesita definirea metodei compare.
	public int compare(File filea, File fileb) {
		int comp = fileb.getName().length() - filea.getName().length();
		if (comp != 0) {
			// ... daca lungimile sunt diferite, am terminat.
			return comp;
		} else {
			// ... daca lungimile sunt egale, sorteaza alfabetic.
			return filea.getName().compareToIgnoreCase(fileb.getName());
		}
	}
}