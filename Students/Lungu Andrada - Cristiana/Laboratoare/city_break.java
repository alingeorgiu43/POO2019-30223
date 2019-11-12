package laborator4;

public class city_break {

		private String loc_plecare;
		private String destinatie;
		private int pret;
		private int nr_zile;
		
		city_break(){
			loc_plecare=null;
			destinatie=null;
			pret=0;
			nr_zile=0;
		}
		public String getLocPlec() {
			return this.loc_plecare;
		}
		public String getDestinatie() {
			return this.destinatie;
		}
		
		public int getPret() {
			return this.pret;
		}
		public int getNr_zile() {
			return this.nr_zile;
		}
		
		public void setLocPlec(String loc_plecare) {
			this.loc_plecare=loc_plecare;
		}
		public void setDestinatie(String destinatie) {
			this.destinatie=destinatie;
		}
		
		public void setPret(int pret) {
			 this.pret=pret;
		}
		public void setNr_zile(int nr_zile) {
			this.nr_zile=nr_zile;
		}
	
	
}
