package laborator4;

public class persoana {
	
	
		private String nume;
		private String prenume;
		private int varsta;
		
		persoana(){
			nume=null;
			prenume=null;
			varsta=0;
		}
		
		public String getNume() {
			return this.nume;
		}
		public String getPrenume() {
			return this.prenume;
		}
		
		public int getVarsta() {
			return this.varsta;
		}
		
		public void setNume(String nume) {
			this.nume=nume;
		}
		public void setPrenume(String prenume) {
			this.prenume=prenume;
		}
		
		public void setVarsta(int varsta) {
			this.varsta=varsta;
		}
	}
	

