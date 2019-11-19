package javasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.*;

public class ZooMainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactoryMammals = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactoryBirds = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactoryAquatics = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactoryReptiles = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactoryInsects = abstractFactory.getSpeciesFactory(Constants.Species.Insects);

		int contorAnimals = 3;

		Mammal[] mammals = new Mammal[5];
		Bird[] birds = new Bird[5];
		Aquatic[] aquatics = new Aquatic[5];
		Reptile[] reptiles = new Reptile[5];
		Insect[] insects = new Insect[5];

		mammals[0] = (Mammal) speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Lion);
		mammals[1] = (Mammal) speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Wolf);
		mammals[2] = (Mammal) speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.Deer);

		birds[0] = (Bird) speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Eagle);
		birds[1] = (Bird) speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Owl);
		birds[2] = (Bird) speciesFactoryBirds.getAnimal(Constants.Animals.Birds.Phoenix);

		aquatics[0] = (Aquatic) speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Whale);
		aquatics[1] = (Aquatic) speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Shark);
		aquatics[2] = (Aquatic) speciesFactoryAquatics.getAnimal(Constants.Animals.Aquatics.Dolphin);

		reptiles[0] = (Reptile) speciesFactoryAquatics.getAnimal(Constants.Animals.Reptiles.Lizard);
		reptiles[1] = (Reptile) speciesFactoryAquatics.getAnimal(Constants.Animals.Reptiles.Snake);
		reptiles[2] = (Reptile) speciesFactoryAquatics.getAnimal(Constants.Animals.Reptiles.Turtle);

		insects[0] = (Insect) speciesFactoryAquatics.getAnimal(Constants.Animals.Insects.Bee);
		insects[1] = (Insect) speciesFactoryAquatics.getAnimal(Constants.Animals.Insects.Butterfly);
		insects[2] = (Insect) speciesFactoryAquatics.getAnimal(Constants.Animals.Insects.Spider);

		EmployeeFactory abstractEmployeeFactory = new EmployeeFactory();
		EmployeeAbstractFactory employeeFactory = abstractEmployeeFactory
				.getEmployeeFactory(Constants.EmployeeTypes.Caretaker);
		Caretaker caretakers[] = new Caretaker[10];

		for (int i = 0; i < caretakers.length; i++) {
			caretakers[i] = (Caretaker) employeeFactory.getEmployeeFactory(Constants.EmployeeTypes.Caretaker);
		}

		caretakers[0].takeCareOf(mammals[0]);
		caretakers[0].takeCareOf(mammals[2]);
		for (int i = 0; i < 3; i++)

			if (mammals[i].getIsTakenCareOf() == true)
				System.out.println("The animal " + mammals[i].getName() + " had been taken care of");
			else
				System.out.println("The animal " + mammals[i].getName() + " had not been taken care of");
	}
	
}