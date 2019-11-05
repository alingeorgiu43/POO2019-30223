package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.*;

public class ZooMainController {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        SpeciesFactory speciesFactory =animalFactory.getSpeciesFactory(Constants.Species.Mammals);
        Animal lion = speciesFactory.getAnimal(Constants.Animals.Mammals.Lion);
        Animal shark = speciesFactory.getAnimal(Constants.Animals.Aquatics.Shark);
        Animal bee = speciesFactory.getAnimal(Constants.Animals.Insects.Bee);
        System.out.printf("Lion has %d legs\n",lion.getNrOfLegs());
        //System.out.printf("Lion has %d legs\n",lion.getPercBodyHair());
       // Integer depth = shark.getAvgSwimDepth();
       // System.out.println(depth);
       // System.out.println(bee.getIsDangerous());
        System.out.println(lion.getName());
        
        /* Nu pot sa accesez alte atribute particulare ale animalelor decat cele predefine din clasa Animal.java
           sau nu stiu eu cum se face :)*/
    }
}