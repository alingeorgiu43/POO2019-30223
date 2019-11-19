package hotel;

import java.util.Date;

public class Client extends Persoana implements Comparable<Client> {
    private int numarCamera;
    private Date checkIn;
    private Date checkOut;
    private int zileCazare;

    public Client(int id, String nume, String numarTelefon) {
        super(id, nume, numarTelefon);
    }

    @Override
    public String toString() {
        return super.toString() + ", camera: " + numarCamera + ", zile petrecute in hotel: " + zileCazare;
    }

    public int compareTo(Client client) {
        if (zileCazare > client.zileCazare) {
            return 1;
        }
        if (zileCazare < client.zileCazare) {
            return -1;
        }
        return 0;
    }

    public void setNumarCamera(int numarCamera) {
        this.numarCamera = numarCamera;
    }

    public int getZileCazare() {
        return zileCazare;
    }

    public int getNumarCamera() {
        return this.numarCamera;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public void calculeazaZileCazare() {
        long timpCazare = checkOut.getTime() - checkIn.getTime();
        zileCazare = (int) (timpCazare / (24 * 60 * 60 * 1000));
    }

    public boolean equals(Object object){
        Client client = (Client) object;
        if(nume.equals(client.nume) && id == client.id && numerTelefon.equals(client.numerTelefon)){
            return true;
        }
        return false;
    }
}
