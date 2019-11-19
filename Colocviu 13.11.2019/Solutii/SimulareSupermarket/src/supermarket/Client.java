package supermarket;

public class Client extends Persoana implements Comparable<Client> {
    private static final int LIMITA_PRODUSE = 3;

    protected int numarProduse;
    protected Produs[] produse;
    protected double sumaCumparaturi;

    public Client(int id, String nume) {
        super(id, nume);
        produse = new Produs[LIMITA_PRODUSE];
    }

    public void adaugaProdus(Produs produs, int numarExemplare) {
        if(produs.esteInStoc(numarExemplare)) {
            produse[numarProduse] = produs;
            numarProduse++;
            updateSumaTotala(produs, numarExemplare);
            produs.setStoc(produs.getStoc()-numarExemplare);
        }else {
            System.out.println("Produsul nu se afla in stoc.");
        }
    }

    public int compareTo(Client client) {
        if (sumaCumparaturi > client.sumaCumparaturi) {
            return 1;
        } else if (sumaCumparaturi < client.sumaCumparaturi) {
            return -1;
        }
        return 0;
    }

    private void updateSumaTotala(Produs produs, int numarExemplare) {
        this.sumaCumparaturi += produs.getPret() * numarExemplare;
    }

    public double getSumaCumparaturi(){
        return sumaCumparaturi;
    }

    public String toString() {
        return super.toString() + ", numarProduse: " + numarProduse;
    }

}
