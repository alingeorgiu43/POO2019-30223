
public class Truck extends Autovehicul{
	private int tonaj;
	private int nr_vagoane;
	private String marfa;
	private String marca;
	
	Truck()
	{
		super("unknow","unknow",0,1,0);
		this.nr_vagoane=0;
		this.marfa=null;
	}
	Truck(int tonaj,int nr_vagoane,String marfa,int viteza,int viteza_maxima,String marca )
	{
		this.tonaj=tonaj;
		this.nr_vagoane=nr_vagoane;
		this.marfa=marfa;
		this.setViteza(viteza);
		this.setViteza_maxima(viteza_maxima);
		this.marca=marca;
	}
	public void setTonaj(int tonaj)
	{
		this.tonaj=tonaj;
	}
	public void setNrVagoane(int nr)
	{
		this.nr_vagoane=nr;
	}
	public void setMarfa(String marfa)
	{
		this.marfa=marfa;
	}
	public void setMarca(String marca)
	{
		this.marca=marca;
	}
	public int getTonaj()
	{
		return this.tonaj;
	}
	public int getNrVagoane()
	{
		return this.nr_vagoane;
	}
	public String getMarfa()
	{
		return this.marfa;
	}
	public String getMarca()
	{
		return this.marca;
	}
	public String toString()
	{
		return "Camion "+this.marca + " " + this.nr_vagoane + " " + this.marfa + " " + this.tonaj;
	}
}
