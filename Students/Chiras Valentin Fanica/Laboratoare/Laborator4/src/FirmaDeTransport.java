public class FirmaDeTransport {
		private String numeFirma;
		private String tara;
		private String adresa;
		
		FirmaDeTransport(){
			this.numeFirma="unknow";
			this.tara="unknwo";
			this.adresa="unknow";
		}
		FirmaDeTransport(String numeFirma,String tara,String adresa)
		{
			this.numeFirma=numeFirma;
			this.tara=tara;
			this.adresa=adresa;
		}
		public String getName()
		{
			return this.numeFirma;
		}
		public String getTara()
		{
			return this.adresa;
		}
		public String getAdresa()
		{
			return this.adresa;
		}
		public void setNameFirma(String numeFirma)
		{
			this.numeFirma=numeFirma;
		}
		public void setTara(String tara)
		{
			this.tara=tara;
		}
		public void setAdresa(String adresa)
		{
			this.adresa=adresa;
		}
		public String toString()
		{
			return this.numeFirma + " " + this.tara + " " + this.adresa;
		}
}
