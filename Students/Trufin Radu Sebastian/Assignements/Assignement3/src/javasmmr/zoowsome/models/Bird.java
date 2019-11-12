package javasmmr.zoowsome.models;

public abstract class Bird extends Animal 
{
	public Boolean migrates;
	public Integer avgFlightAltitude;
	
	public Bird(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) 
	{
		super(nrOfLegs, name);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public Bird()
	{
		this.name = "<Unknown name>";
	}
	
	public void setMigrate(boolean migrates)
	{
		this.migrates = migrates;
	}
	
	public void setAvgFlightAltitude(Integer avgFlightAltitude) 
	{
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public Boolean getMigrate()
	{
		return this.migrates;
	}
	
	public Integer getAvgFlightAltitude()
	{
		return this.avgFlightAltitude;
	}
}
