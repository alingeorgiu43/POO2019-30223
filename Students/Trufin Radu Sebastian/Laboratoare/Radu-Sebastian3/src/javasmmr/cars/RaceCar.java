package javasmmr.cars;
import java.awt.Color;

public class RaceCar extends Autovehicul
{
	Boolean esteSport;
	Boolean esteCross;
	Boolean esteStandard;
	
	public RaceCar(String marca, Color c, int v, int t, int v_max, Boolean esteSport, Boolean esteStandard, Boolean esteCross) 
	{
		super(marca, c, v, t, v_max);
		this.esteSport = esteSport;
		this.esteCross = esteCross;
		this.esteStandard = esteStandard;
	}
	
	RaceCar()
	{
		this.esteCross = false;
		this.esteSport = false;
		this.esteStandard = true;
		this.marca = "<Unknown Brand>";
		this.c = Color.black;
		this.v = 0;
		this.t = 0;
		this.v_max = 0;
	}
				
	public String toString()  
    { 
        return (super.toString() + " este cross : " + esteCross); 
    } 
	
	public void setStandard(Boolean esteStandard)
	{
		this.esteStandard = esteStandard;
	}
	
	public void setCross(Boolean esteCross)
	{
		this.esteCross = esteCross;
	}
	
	public void setSport(Boolean esteSport)
	{
		this.esteSport = esteSport;
	}
	
	public Boolean getStandard()
	{
		return this.esteStandard;
	}
	
	public Boolean getCross()
	{
		return this.esteCross;
	}
	
	public Boolean getSport()
	{
		return this.esteSport;
	}
}
