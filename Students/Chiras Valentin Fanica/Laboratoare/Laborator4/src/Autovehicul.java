

public class Autovehicul {

	private String marca;
	private	String culoare;
	private	int viteza_curenta;
	private	int treapta_de_viteza_curenta;
	private	int viteza_maxima;
	public static final boolean faruri=true;
	Sofer driver = new Sofer();
		
	Autovehicul(){
		viteza_curenta=0;
		treapta_de_viteza_curenta=1;
	}
		
	Autovehicul(String marca,String culoare,int viteza,int treapta,int viteza_max)
		{
			this.marca=marca;
			this.culoare=culoare;
			this.viteza_curenta=viteza;
			this.treapta_de_viteza_curenta=treapta;
			this.viteza_maxima=viteza_max;	
		}
	Autovehicul(Sofer driver)
	{
		this.driver=driver;
	}
		
public String getMarca()
{
	return this.marca;
}			
public String getColor()
{
	return this.culoare;
}		
public double getViteza()
{
	return this.viteza_curenta;
}		
public int getTreapta()
{
	return this.treapta_de_viteza_curenta;
}
public int getViteza_maxima()
{
	return this.viteza_maxima;
}
		
public void setMarca(String marca)
{
	this.marca=marca;
}
public void setColor(String color)
{
   this.culoare=color;
}		
public void setViteza(int viteza)
{
	this.viteza_curenta=viteza;
}		
public void setTreapta(int treapta)
{
	this.treapta_de_viteza_curenta=treapta;
}
public void setViteza_maxima(int maxViteza)
{
	this.viteza_maxima=maxViteza;
}			
public int accelerare(int viteza)	
{	
	if(this.viteza_maxima > this.viteza_curenta)
		return this.viteza_curenta +=viteza ;
	else
		return this.viteza_maxima;
}	
public double accelerare(double viteza)	
{	
	if(this.viteza_maxima > this.viteza_curenta)
		return this.viteza_curenta +=viteza ;
	else
		return this.viteza_maxima;
}	

public int decelerare(int viteza)	
{	
	if(this.viteza_curenta - viteza < 0)
		return viteza_curenta=0;
	return this.viteza_curenta -= viteza ;
}
public int schimbare_treapta(int treapta)
{	
	return this.treapta_de_viteza_curenta=treapta;
}
public boolean oprire()
{
	this.treapta_de_viteza_curenta=1;
	this.viteza_curenta=0;
	return true;
}
						
			
public String toString()
	{
		return "Marca: " + this.marca +"\n" + "Culoare: " + this.culoare + "\n" + "Viteza: " + this.viteza_curenta + " km/h"+ "\n" + 
				"Treapta de viteaza : " + this.treapta_de_viteza_curenta + "\n" + "Viteza_maxima " + this.viteza_maxima;
		
	}


}
