package supermarket;

public class Persoana {

    // id-ul se poate creea folosind String uniqueID = UUID.randomUUID().toString();
    protected int id;
    protected String nume;

    public Persoana(int id, String nume){
        this.id = id;
        this.nume = nume;
    }

    public String toString(){
        return "Id: " + id + ", nume: " + nume;
    }
}