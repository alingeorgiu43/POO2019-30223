package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

    public Butterfly(Integer nrOfLegs,String name,boolean canFly,boolean isDangerous) {
        setNrOfLegs(nrOfLegs);
        setName(name);
        setCanFly(canFly);
        setIsDangerous(isDangerous);
    }
    
    public Butterfly() {
        setNrOfLegs(4);
        setName("Beautiful");
        setCanFly(true);
        setIsDangerous(false);
    }
}