package hotel;

public class Persoana {

    // id-ul se poate creea folosind String uniqueID = UUID.randomUUID().toString();
    protected int id;
    protected String nume;
    protected String numerTelefon;

    public Persoana(int id, String nume, String numerTelefon){
        this.id = id;
        this.nume = nume;
        this.numerTelefon = numerTelefon;
    }

    public String toString(){
        return "Id: " + id + ", nume: " + nume + ", telefon: " + numerTelefon;
    }
}
