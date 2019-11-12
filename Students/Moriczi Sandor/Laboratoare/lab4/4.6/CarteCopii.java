package laborator4;

public class CarteCopii extends Carte{

	public int nrBasme;
	public int nrPaginiDeColorat;
	
	public CarteCopii(String nume, String editura, int basme, int paginiCol, int nrPagini)
	{
		this.editura=editura;
		this.nume=nume;
		this.nrPagini=nrPagini;
		this.nrBasme=basme;
		nrPaginiDeColorat=paginiCol;
	}
	public String toString()
	{
		return "Cartea este: "+nume+ " de la editura: "+ editura + "."
				+ " Acesta contine: "+ nrPagini+ " pagini din care: "+ nrPaginiDeColorat+ " sunt de colorat."
				+ " Acesta mai contine si: "+ nrBasme+ " basme";
	}
	public CarteCopii()
	{
		this("Fantasy","KidBooks",10,15,80);
	}
	
	public void setNrBasme(int basme)
	{
		nrBasme=basme;
	}
	public int getNrBasme()
	{
		return nrBasme;
	}
	public void setPaginiCol(int pagCol)
	{
		nrPaginiDeColorat=pagCol;
	}
	public int getPaginiCol()
	{
		return nrPaginiDeColorat;
	}
}
