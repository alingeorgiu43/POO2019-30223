package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Mammals.Lion.equals(type)) {
            return new Lion();
        } else if (Constants.Animals.Mammals.Deer.equals(type)) {
            return new Deer();
        } else if (Constants.Animals.Mammals.Wolf.equals(type)) {
            return new Wolf();
        } else {
            return null;
        }
    }
}