package javasmmr.zoowsome.models;

public abstract class Animal 
{
	public Integer nrOfLegs;
	public String name;
	
	public Animal()
	{
		this.nrOfLegs = 0;
	    this.name = "<Unknown Animal>";
	}
	
	public Animal(Integer nrOfLegs, String name)
	{
		this.nrOfLegs = nrOfLegs;
		this.name = name;
	}
	
	public void setNrOfLegs(Integer k)
	{
		this.nrOfLegs = k;
	}
	
	public Integer getNrOfLegs()
	{
		return this.nrOfLegs;
	}
	
	public void setName(String s)
	{
		this.name = s;
	}
	
	public String getName()
	{
		return this.name;
	}
}
