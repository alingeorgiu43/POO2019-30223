package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Insects.Bee.equals(type)) {
            return new Bee();
        } else if (Constants.Animals.Insects.Butterfly.equals(type)) {
            return new Butterfly();
        } else if (Constants.Animals.Insects.Spider.equals(type)) {
            return new Spider();
        } else {
            return null;
        }
    }
}