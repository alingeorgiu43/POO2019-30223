package laborator4;


public class Drum {
	private String loc_plecare;
	private String destinatie;
	private int nr_km;
	private int timp;
	
	 Drum(){
		 loc_plecare=null;
		 destinatie=null;
		 nr_km=0;
		 timp=0;
	 }
	 
	 public String getLoc_plecare() {
			return this.loc_plecare;
		}
	 public String getDestinatie() {
			return this.destinatie;
		}
	 public int  getNrKm() {
			return this.nr_km;
		}
	 public int getTimp() {
			return this.timp;
		}
	 
	 public void setLoc_plecare(String loc_plecare) {
			this.loc_plecare=loc_plecare;
		}
	 public void setDestinatie(String destinatie) {
			this.destinatie=destinatie;
		}
	 public void  setNrKm(int nr_km) {
			this.nr_km=nr_km;
		}
	 public void setTimp(int timp) {
			this.timp=timp;
		}
	 
	 public Drum getdrum() {
			Drum d=new Drum();
			return d;
		}
}
