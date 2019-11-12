package javasmmr.zoowsome.services;
import javasmmr.zoowsome.models.Animal;

public abstract class SpeciesFactory 
{
    public abstract Animal getAnimal(String type) throws Exception;    
}
