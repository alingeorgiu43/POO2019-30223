package javasmmr.cars;
import java.awt.Color;

public class Autovehicul
    {
        protected String marca;
        protected Color c;
        protected int v; // viteza curenta
        protected int t; // treapta de viteza curenta
        protected int v_max; // viteza maxima
    	
    	Autovehicul(String marca, Color c, int v, int t, int v_max)
    	{
    		this.marca = marca;
    		this.c = c;
    		this.v = v;
    		this.t = t;
    		this.v_max = v_max;
    	}
    	
    	Autovehicul()
    	{
    		marca = "Dacia Golan";
    		c = Color.blue;
    		v = 0;
    		t = 0;
    		v_max = 0;
    	}

    	public void accelerare(int x)
    	{
    		this.v = this.v + x;
    	}
    	
    	public void accelerare(double x)
    	{
    		this.v = this.v + (int) x;
    	}
    	
    	protected void decelerare(int x)
    	{
    		this.v = this.v - x;
    	}
    	
    	protected void schimba_treapta(int x)
    	{
    		this.t = x;
    	}
    	
    	public void oprire()
    	{
    		this.v = 0;
    	}
    	
    	public int getSpeed()
    	{
    		return this.v;
    	}
    	
    	public int getGear()
    	{
    		return this.t;
    	}
    	
    	public Color getColor()
    	{
    		return this.c;
    	}
    	
    	public String getTag()
    	{
    		return this.marca;
    	}
    	
    	public String toString()  
        { 
            return("Treapta este "+ this.t + 
            " si viteza maxima este "+ this.v_max + "."); 
        }  
 }
