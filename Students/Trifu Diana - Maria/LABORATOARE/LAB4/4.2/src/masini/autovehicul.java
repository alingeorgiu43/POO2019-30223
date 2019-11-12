package masini;

import java.awt.Color;
public class autovehicul {
		private String marca;
	    private Color culoare;
	    private int vitezacrt;
	    private int treapta;
	    private int vitezamax;
	    //constanta caracteristica
	    final String nrCar = "CJ 23 ABC";
	     
	    //constructor cu parametrii
	    public autovehicul(String str, Color clr, int vit, int tr, int maxim) {
	    	marca = str;
	    	culoare = clr;
	    	vitezacrt = vit;
	    	treapta = tr;
	    	vitezamax = maxim;
	    }
	    
	    //consructor fara parametrii 
	    public autovehicul() {
	    	this("BMW", Color.green, 40, 3, 130);
	    }
	    
	    //functii
	    public void setFct(String mar, Color cul, int vit, int trp, int maxima)
	    {
	    	this.marca = mar;
	    	this.culoare = cul;
	    	this.vitezacrt = vit;
	    	this.treapta = trp;
	    	this.vitezamax = maxima;
	    }
	    public int getVit() {
	    	return vitezacrt;
	    }
	    public int getTr() {
	    	return treapta;
	    }
	    public int getMax() {
	    	return vitezamax;
	    }
	    public int accelerare(int vitezacrt, int valvit, int treapta) {
	    	if((vitezacrt + valvit) < vitezamax)
	    	{
	    		this.vitezacrt = vitezacrt + valvit;
	    		this.treapta = treapta + valvit/20;
	    	}
	    	else 
	    	{
	    		this.vitezacrt = vitezamax;
	    		this.treapta = 5;
	    	}
	    	return vitezacrt;
	    }
	    public int decelerare(int vitezacrt, int valvit, int treapta) {
	    	if((vitezacrt - valvit) > 0) {
	    		this.vitezacrt = vitezacrt - valvit;
	    		this.treapta = treapta - valvit/20;
	    	}
	    	else 
	    	{
	    		this.vitezacrt = 0;
	    		this.treapta = 0;
	    	}
	    	return vitezacrt;
	    }
	    public void oprire(int vitezacrt, int treapta) {
	    	this.vitezacrt = 0;
	    	this.treapta = 0;
	    }
	    
	    //supraincarcarea metodei decelerare
	    public void decelerare(int treapta, int newTr, String str) {
	    	if(newTr <= treapta)
	    		this.treapta = treapta - newTr;
	    	else 
	    		System.out.println(str);
	    }
	}

