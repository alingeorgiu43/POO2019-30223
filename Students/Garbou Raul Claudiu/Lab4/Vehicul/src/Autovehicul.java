import java.awt.Color;

public class Autovehicul {
	private String marca;
	private Color culoare;
	private int vitezaCurenta;
	private int treaptaDeViteza;
	private int vitezaMaxima;
	private final int nrRoti=4;
	private Sofer sofer;

	public Autovehicul()
	{
		this.vitezaCurenta=0;
		this.setTreaptaDeViteza(0);
	}

	public Autovehicul(String marca, Color culoare, int vitezaMaxima)
	{
		this.vitezaCurenta=0;
		this.setTreaptaDeViteza(0);
		this.setMarca(marca);
		this.setCuloare(culoare);
		this.setVitezaMaxima(vitezaMaxima);
	}

	public void setVitezaCurenta(int vitezaCurenta)
	{
		this.vitezaCurenta=vitezaCurenta;
	}

	public int getVitezaCurenta()
	{
		return vitezaCurenta;
	}

	public int getNrRoti() {
		return nrRoti;
	}
	
	public int getNumarDeRoti() {
		return nrRoti;
	}

	public int getTreaptaDeViteza() {
		return treaptaDeViteza;
	}

	public void setTreaptaDeViteza(int treaptaDeViteza) {
		this.treaptaDeViteza = treaptaDeViteza;
	}


	public void accelerareAutovehicul(Autovehicul masina, int acceleratie)
	{
		int aux=acceleratie+masina.vitezaCurenta;
		masina.setVitezaCurenta(aux);
	}

	private void decelerareAutovehicul(Autovehicul masina, int decelerare)
	{
		int auxiliar=masina.vitezaCurenta-decelerare;
		masina.setVitezaCurenta(auxiliar);
	}

	private void oprireAutovehicul(Autovehicul masina)
	{
		masina.vitezaCurenta=0;
		masina.treaptaDeViteza=0;
	}

	private void schimbareTreaptaViteza(Autovehicul masina,int cresteSauScade)
	{
		if (cresteSauScade!=0){
			masina.setTreaptaDeViteza(cresteSauScade+masina.treaptaDeViteza);
		}
	}


	static void deplasareAutovehicul(Autovehicul masina, String comanda, int parametru) {
		if (comanda.equals("accelerare"))
		{
			masina.accelerareAutovehicul(masina,parametru);
		}
		else if (comanda.equals("decelerare"))
			{
				masina.decelerareAutovehicul(masina,parametru);
			}
			else if (comanda.equals("schimbareViteza"))
				{
					masina.schimbareTreaptaViteza(masina,parametru);
				}
				else if (comanda.equals("oprire")) {
					masina.oprireAutovehicul(masina);	
				} else
					System.out.print("comanda incorecta");
	}

	public Sofer getSofer() {
		return sofer;
	}

	public void setSofer(Sofer sofer) {
		this.sofer = sofer;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Color getCuloare() {
		return culoare;
	}

	public void setCuloare(Color culoare) {
		this.culoare = culoare;
	}

	public int getVitezaMaxima() {
		return vitezaMaxima;
	}

	public void setVitezaMaxima(int vitezaMaxima) {
		this.vitezaMaxima = vitezaMaxima;
	}

}