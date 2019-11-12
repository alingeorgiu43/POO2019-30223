package javasmmr.zoowsome.services;
import java.util.Random;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Cow;
import javasmmr.zoowsome.models.Tiger;
import javasmmr.zoowsome.models.Monkey;

public class MammalFactory extends SpeciesFactory 
{
	public Animal getAnimal(String type) throws Exception
	{
		Random r = new Random();
		
		String[] cowNames = new String[] { "Jiuncutza", "Viorica", "Minodora", "Daisy", "Bumba", "Pamela",
				"Moscova", "Paula", "Pudding", "Esmeralda" };
		
		String[] tigerNames = new String[] { "Pavel", "Ninja", "Sanchez", "Maluma", "Garfield", "Tom",
				"Pisi", "Felix", "Geany", "Catarina" };
		
		String[] monkeyNames = new String[] { "Thaddius", "Duras", "Usher", "Salvadore", "Keanu", "Murcielago",
				"Claudiu", "Ashley", "Lukaku", "Desmond" };
		
		int randCowName = r.nextInt(cowNames.length);
		int randTigerName = r.nextInt(tigerNames.length);
		int randMonkeyName = r.nextInt(tigerNames.length);
		
		float bodyTemp = 6 * r.nextFloat() + 35;
		float bodyHairPercent =  100 * r.nextFloat();

		if(Constants.Animals.Mammals.Cow.equals(type))
			return new Cow(4,cowNames[randCowName],bodyTemp,bodyHairPercent);
		else if (Constants.Animals.Mammals.Tiger.equals(type))
            return new Tiger(2,tigerNames[randTigerName],bodyTemp,bodyHairPercent);
        else if (Constants.Animals.Mammals.Monkey.equals(type))
            return new Monkey(2,monkeyNames[randMonkeyName],bodyTemp,bodyHairPercent);
        else
        	throw new Exception ("Invalid animal exception");
	}
}
