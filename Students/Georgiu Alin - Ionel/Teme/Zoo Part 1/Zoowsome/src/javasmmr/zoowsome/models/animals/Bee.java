package javasmmr.zoowsome.models.animals;

public class Bee extends Insect {

    public Bee(Integer nrOfLegs,String name,boolean canFly,boolean isDangerous) {
        setNrOfLegs(nrOfLegs);
        setName(name);
        setCanFly(canFly);
        setIsDangerous(isDangerous);
    }
    
    public Bee() {
        setNrOfLegs(6);
        setName("HoneyBee");
        setCanFly(true);
        setIsDangerous(true);
    }
}