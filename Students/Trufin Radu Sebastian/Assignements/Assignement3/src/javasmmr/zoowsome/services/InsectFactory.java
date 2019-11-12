package javasmmr.zoowsome.services;
import java.util.Random;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Spider;
import javasmmr.zoowsome.models.Butterfly;
import javasmmr.zoowsome.models.Cockroach;

public class InsectFactory extends SpeciesFactory 
{
	public Animal getAnimal(String type) throws Exception
	{
		Random r = new Random();
		
		String[] ButterflyNames = new String[] { "Icky", "Ozzy", "Nacho", "Faraday", "Rufus", "Casper",
				"Melkior", "Leonidas", "Fubini", "Cosmo" };
		
		String[] SpiderNames = new String[] { "Cauchy", "Weierstrass", "Gauss", "Abel", "Galois", "Lagrange",
				"Riemann", "Goldbach", "Euler", "Euclid" };
		
		String[] CockroachNames = new String[] { "Descartes", "Pitagora", "Pascal", "Turing", "Ramanujan", "Eratostene",
				"Fermat", "Leibniz", "Newton", "Hilbert" };
		
		int randButterflyName = r.nextInt(ButterflyNames.length);
		int randSpiderName = r.nextInt(SpiderNames.length);
		int randCockroachName = r.nextInt(CockroachNames.length);
		
		Boolean isDangerous = r.nextBoolean();
		Boolean doesFly = r.nextBoolean();
		
		if(Constants.Animals.Insects.Butterfly.equals(type))
			return new Butterfly(6,ButterflyNames[randButterflyName],doesFly,isDangerous);
		else if (Constants.Animals.Insects.Spider.equals(type))
            return new Spider(8,SpiderNames[randSpiderName],doesFly,isDangerous);
        else if (Constants.Animals.Insects.Cockroach.equals(type))
            return new Cockroach(8,CockroachNames[randCockroachName],doesFly,isDangerous);
        else
        	throw new Exception ("Invalid animal exception");
	}
}