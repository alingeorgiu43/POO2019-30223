package laborator4;

public class Sofer {
	 public String nume;
	 public String prenume;
	 public int varsta;
	 public int nrPermisConducere;
	 
	 public Sofer(String nume, String prenume, int varsta, int permis)
	 {
		 this.nume=nume;
		 this.prenume=prenume;
		 this.varsta=varsta;
		 nrPermisConducere=permis;
	 }
	 public Sofer()
	 {
		 this("Stan","Lee",37,896);
	 }
	 public String getName()
	 {
		 return nume;
	 }
	 public String getPrenume()
	 {
		 return prenume;
	 }
	 public String toString()
	 {
		 return nume + " " + prenume + " are " + varsta + " ani si are " 
	 + "permisul cu numarul: " + nrPermisConducere;
	 }
	 public void setFullName(String nume, String prenume)
	 {
		 this.nume=nume;
		 this.prenume=prenume;
	 }
	 public int getAge()
	 {
		 return varsta;
	 }
	 public void setAge(int age)
	 {
		 varsta=age;
	 }
	 public int getPermisNr()
	 {
		 return nrPermisConducere;
	 }
	 public void setPermisNr(int number)
	 {
		 nrPermisConducere=number;
	 }
}
