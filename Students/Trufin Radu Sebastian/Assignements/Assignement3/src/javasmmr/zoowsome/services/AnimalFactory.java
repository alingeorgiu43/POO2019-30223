package javasmmr.zoowsome.services;

public class AnimalFactory 
{
	public SpeciesFactory getSpeciesFactory(String type) throws Exception
	{
		if(Constants.Species.Mammals.contentEquals(type))
			{
			  return new MammalFactory();
			}
		
		else if(Constants.Species.Reptiles.contentEquals(type))
			{
			  return new ReptileFactory();
			}
		
		else if(Constants.Species.Birds.contentEquals(type))
			{
			  return new BirdFactory();
			}
		
		else if(Constants.Species.Insects.contentEquals(type))
		    {
		      return new InsectFactory();
		    }
		
		else if(Constants.Species.Aquatics.contentEquals(type))
			{
			  return new AquaticFactory();
			}
		else throw new Exception("Invalid species exception");
		
	}

}
