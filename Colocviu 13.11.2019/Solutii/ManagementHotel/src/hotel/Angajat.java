package hotel;

import java.util.Date;

public class Angajat extends Persoana implements Comparable<Angajat> {
    private Date dataAngajare;
    private int clientiServiti;

    public Angajat(int id, String nume, String numarTelefon) {
        super(id, nume, numarTelefon);
        this.clientiServiti = 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", dataAngajare" + dataAngajare + ", clientiServiti: " + clientiServiti;
    }

    public int compareTo(Angajat angajat) {
        if (clientiServiti > angajat.clientiServiti) {
            return 1;
        }
        if (clientiServiti < angajat.clientiServiti) {
            return -1;
        }
        return 0;
    }

    public void setDataAngajare(Date dataAngajare) {
        this.dataAngajare = dataAngajare;
    }

    public void cazeazaClient(Hotel hotel, Client client, Camera camera, String regim, Date checkIn, Date checkOut) {
        clientiServiti++;
        client.setNumarCamera(camera.getNumarCamera());
        client.setCheckIn(checkIn);
        client.setCheckOut(checkOut);
        client.calculeazaZileCazare();
        hotel.adaugaClient(client);
        if (regim.equals("single")) {
            camera.cazeazaOaspeteRegimSingle(client);
        } else {
            camera.cazeazaOaspete(client);
        }
    }

    public void decazeazaClient(Hotel hotel, Client client) {
        clientiServiti++;
        hotel.decazeazaClient(client);
    }
}

