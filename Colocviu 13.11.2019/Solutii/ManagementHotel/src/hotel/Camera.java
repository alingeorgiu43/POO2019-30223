package hotel;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Camera {
    private int numarCamera;
    private int capacitate;

    private double pretNoapte;
    private double pretRegimSingle;

    private Client[] oaspeti;
    private int numarOaspeti;

    private boolean regimSingle;

    public Camera(int numarCamera, int capacitate) {
        this.numarCamera = numarCamera;
        this.capacitate = capacitate;
        oaspeti = new Client[capacitate];
    }

    public void cazeazaOaspete(Client oaspete) {
        if (!esteOcupata()) {
            oaspete.setNumarCamera(numarCamera);
            Array.set(oaspeti, numarOaspeti, oaspete);
            numarOaspeti++;
        } else {
            System.out.println("Camera este ocupata.");
        }
    }

    public void cazeazaOaspeteRegimSingle(Client oaspete) {
        if (numarOaspeti == 0) {
            regimSingle = true;
            Array.set(oaspeti, numarOaspeti, oaspete);
            numarOaspeti++;
        } else {
            System.out.println("Nu se poate caza in regim single deoarece deja sunt oaspeti cazati in aceasta camera.");
        }
    }


    public boolean esteOcupata() {
        if ((numarOaspeti == capacitate) || (regimSingle && numarOaspeti == 1)) {
            return true;
        }
        return false;
    }

    public void decazeazaOaspete(Client oaspete) {
        int pozitie = ArrayUtils.indexOf(oaspeti,oaspete);
        ArrayUtils.remove(oaspeti, pozitie);
        numarOaspeti--;
    }

    // metoda supraincarcate
    public double calculeazaPret(int zileCazare, double discount) {
        double pret;
        if(regimSingle){
            pret = zileCazare * pretRegimSingle;
        }else {
            pret = zileCazare * pretNoapte;
        }
        return pret - discount * pret;
    }

    public double calculeazaPret(int zileCazare) {
        if (regimSingle) {
            return zileCazare * pretRegimSingle;
        }
        return zileCazare*pretNoapte;
    }

    public void setPretNoapte(double pretNoapte) {
        this.pretNoapte = pretNoapte;
    }

    public void setPretRegimSingle(double pretRegimSingle){
        this.pretRegimSingle = pretRegimSingle;
    }

    public int getNumarCamera(){
        return this.numarCamera;
    }

    public String toString(){
        return "Camera " + numarCamera + ", cu capacitatea " + capacitate + " are " + numarOaspeti + " oaspeti cazati.";
    }
}
