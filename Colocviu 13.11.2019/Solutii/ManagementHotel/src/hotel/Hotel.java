package hotel;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Date;

public class Hotel {
    private static final int LIMITA_CAMERE = 3;
    private static final int LIMITA_ANGAJATI = 3;
    private static final int LIMITA_CLIENTI = 6;


    private Camera[] camere;
    private Angajat[] angajati;
    private Client[] clienti;

    private int numarClienti;
    private int numarCamere;
    private int numarAngajati;

    public Hotel() {
        camere = new Camera[LIMITA_CAMERE];
        clienti = new Client[LIMITA_CLIENTI];
        angajati = new Angajat[LIMITA_ANGAJATI];
    }

    public void adaugaAngajat(Angajat angajat, Date dataAngajare) {
        angajat.setDataAngajare(dataAngajare);
        angajati[numarAngajati] = angajat;
        numarAngajati++;
    }

    public void adaugaCamera(Camera camera) {
        camere[numarCamere] = camera;
        numarCamere++;
    }

    public void adaugaClient(Client client) {
        clienti[numarClienti] = client;
        numarClienti++;
    }

    public void decazeazaClient(Client client){
        ArrayUtils.removeElement(clienti, client);
        Camera camera =  gasesteCamera(client.getNumarCamera());
        int indexCamera = ArrayUtils.indexOf(camere, camera);
        camere[indexCamera].decazeazaOaspete(client);
    }

    public Client[] sorteazaClienti() {
        Arrays.sort(clienti);
        return clienti;
    }

    public Angajat[] sorteazaAngajati() {
        Arrays.sort(angajati);
        return angajati;
    }

    // metode supraincarcate
    public void emiteFactura(Client client) {
        Camera camera = gasesteCamera(client.getNumarCamera());
        double pret = camera.calculeazaPret(client.getZileCazare());
        System.out.println("Clientul " + client + " trebuie sa plateasca " + pret + " lei.");
    }

    public void emiteFactura(Client client, double discount) {
        Camera camera = gasesteCamera(client.getNumarCamera());
        double pret = camera.calculeazaPret(client.getZileCazare(), discount);
        System.out.println("Clientul " + client + " trebuie sa plateasca " + pret + " lei dupa aplicarea unui discount de " + discount + "." );
    }

    private Camera gasesteCamera(int numarCamera) {
        for (Camera camera : camere) {
            if (camera.getNumarCamera() == numarCamera) {
                return camera;
            }
        }
        return null;
    }

    public Client[] getClienti(){
        return clienti;
    }

    public Camera[] getCamere(){
        return camere;
    }

    public Angajat[] getAngajati(){
        return angajati;
    }

    public int calculeazaCamereLibere(){
        int camereLibere = 0;
        for(Camera camera: camere){
            if(!camera.esteOcupata()){
                camereLibere++;
            }
        }
        return camereLibere;
    }

    public int calculeazaCamerePline(){
        int camereOcupate = 0;
        for(Camera camera: camere){
            if(camera.esteOcupata()){
                camereOcupate++;
            }
        }
        return camereOcupate;
    }
}
