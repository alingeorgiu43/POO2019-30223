package javasmmr.zoowsome.controllers;
import java.util.Random;

import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Aquatic;
import javasmmr.zoowsome.models.Bird;
import javasmmr.zoowsome.models.Insect;
import javasmmr.zoowsome.models.Mammal;
import javasmmr.zoowsome.models.Reptile;
import javasmmr.zoowsome.services.AnimalFactory;
import javasmmr.zoowsome.services.Constants;
import javasmmr.zoowsome.services.SpeciesFactory;

public class MainController 
{
	public static void main(String[] args) throws Exception
	{
		AnimalFactory abstractFactory = new AnimalFactory();

		Mammal[] zooMammals = new Mammal[50];
		Bird[] zooBirds = new Bird[50];
		Aquatic[] zooAquatics = new Aquatic[50];
		Reptile[] zooReptiles = new Reptile[50];
		Insect[] zooInsects = new Insect[50];
		
		int mammalPopulation = 0;
		int birdPopulation = 0;
		int aquaticPopulation = 0;
		int reptilePopulation = 0;
		int insectPopulation = 0;
		
		SpeciesFactory speciesFactoryMammals = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactoryBirds = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactoryAquatics = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactoryReptiles = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactoryInsects = abstractFactory.getSpeciesFactory(Constants.Species.Insects);

		int zooCount = 50;

		for (int i=0; i<zooCount; i++) 
		{
			Random S = new Random();
			Random A = new Random();
			int sType = S.nextInt(5);
			int aType = A.nextInt(3);

			if (sType == 0) 
			{
				if (aType == 0) 
				{
					zooMammals[mammalPopulation] = (Mammal) speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Cow);
					mammalPopulation++;
				} 
				else if (aType == 1)
				{
			        zooMammals[mammalPopulation] = (Mammal) speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Tiger);
			        mammalPopulation++;
				} 
				else if (aType == 2) 
				{
					zooMammals[mammalPopulation] = (Mammal) speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Monkey);
					mammalPopulation++;
				}
			} 
			else if (sType == 1) 
			{
				if (aType == 0) 
				{
					zooBirds[birdPopulation] = (Bird) speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Colibri);
					birdPopulation++;
				} 
				else if (aType == 1) 
				{
					zooBirds[birdPopulation] = (Bird) speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Kiwi);
					birdPopulation++;
				} 
				else if (aType == 2) 
				{
					zooBirds[birdPopulation] = (Bird) speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Penguin);
					birdPopulation++;
				}
			} 
			else if (sType == 2) 
			{
				if (aType == 0) 
				{
					zooAquatics[aquaticPopulation] = (Aquatic) speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Clownfish);
					aquaticPopulation++;
				} 
				else if (aType == 1)
				{
					zooAquatics[aquaticPopulation] = (Aquatic) speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Seahorse);
					aquaticPopulation++;
				} 
				else if (aType == 2) 
				{
					zooAquatics[aquaticPopulation] = (Aquatic) speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Salamander);
					aquaticPopulation++;
				}
			} 
			else if (sType == 3) 
			{
				if (aType == 0) 
				{
					zooReptiles[reptilePopulation] = (Reptile) speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.Chameleon);
					reptilePopulation++;
				} 
				else if (aType == 1) 
				{
					zooReptiles[reptilePopulation] = (Reptile) speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.Gecko);
					reptilePopulation++;
				} 
				else if (aType == 2) 
				{
					zooReptiles[reptilePopulation] = (Reptile) speciesFactoryReptiles.getAnimal(Constants.Animals.Reptiles.Iguana);
					reptilePopulation++;
				}
			} 
			else if (sType == 4) 
			{
				if (aType == 0) 
				{
					zooInsects[insectPopulation] = (Insect) speciesFactoryInsects.getAnimal(Constants.Animals.Insects.Butterfly);
					insectPopulation++;
				} 
				else if (aType == 1) 
				{
					zooInsects[insectPopulation] = (Insect) speciesFactoryInsects.getAnimal(Constants.Animals.Insects.Cockroach);
					insectPopulation++;
				} 
				else if (aType == 2) 
				{
					zooInsects[insectPopulation] = (Insect) speciesFactoryInsects.getAnimal(Constants.Animals.Insects.Spider);
					insectPopulation++;
				}
			}
		}
	
		for(int i=0; i<mammalPopulation; i++)
			System.out.printf("%s , %.2f°C \n",zooMammals[i].getName(),zooMammals[i].getNormalBodyTemperature(),zooMammals[i]);
	}
}
