package supermarket;

public class Produs {
    private String nume;
    private double pret;
    private int stoc;

    public Produs(String nume, double pret, int stoc){
        this.nume = nume;
        this.pret = pret;
        this.stoc = stoc;
    }

    public boolean esteInStoc(int numarExemplare){
        if(stoc>= numarExemplare){
            return true;
        }
        return false;
    }

    public void setStoc(int stoc){
        this.stoc = stoc;
    }

    public int getStoc(){
        return stoc;
    }

    public String toString(){
        return "Nume produs: " + nume + ", pret: " + pret + ", stoc: " + stoc;
    }

    public double getPret(){
        return pret;
    }
}
