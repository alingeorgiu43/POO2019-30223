package supermarket;

import java.util.Arrays;
import java.util.Date;

public class Supermarket {
    private static final int LIMITA_CLIENTI= 5;
    private static final int LIMITA_ANGAJATI = 3;
    private static final int LIMITA_PRODUSE = 6;

    private Angajat[] angajati;
    private Client[] clienti; // poate sa contina clienti fideli si clienti obisnuiti -> POLIMORFISM
    private Produs[] produse;

    private int numarAngajati;
    private int numarClienti;
    private int numarProduse;

    public Supermarket(){
        clienti = new Client[LIMITA_CLIENTI];
        angajati = new Angajat[LIMITA_ANGAJATI];
        produse = new Produs[LIMITA_PRODUSE];
    }

    public void adaugaProdus(Produs produs){
        produse[numarProduse] = produs;
        numarProduse++;
    }

    public void adaugaAngajat(Angajat angajat, Date dataAngajare){
        angajat.setDataAngajare(dataAngajare);
        angajati[numarAngajati] = angajat;
        numarAngajati++;
    }

    public void adaugaClient(Client client){
        clienti[numarClienti] = client;
        numarClienti++;
    }

    public ClientFidel[] sorteazaClientiFideli(){
        ClientFidel[] clientiFideli = new ClientFidel[3];
        int numarClientiFideli = 0;
        for(Client client: clienti){
            if(client instanceof  ClientFidel){
                clientiFideli[numarClientiFideli++] = (ClientFidel)client;
            }
        }
        Arrays.sort(clientiFideli);
        return clientiFideli;
    }

    public Angajat[] sorteazaAngajati(){
        Angajat[] angajatiSortati = Arrays.copyOf(angajati,angajati.length);
        Arrays.sort(angajatiSortati);
        return angajatiSortati;
    }

    public Produs[] getProduse(){
        return produse;
    }

    public Client[] getClienti(){
        return clienti;
    }

    public Angajat[] getAngajati(){
        return angajati;
    }

    public int calculeazaTotalProduseClienti(){
        int numarProduse = 0;
        for(Client client: clienti){
            if(!(client instanceof  ClientFidel)){
                numarProduse++;
            }
        }
        return numarProduse;
    }

    public int calculeazaTotalProduseClientiFideli(){
        int numarProduseClientiFideli = 0;
        for(Client client: clienti){
            if(client instanceof  ClientFidel){
                numarProduseClientiFideli++;
            }
        }
        return numarProduseClientiFideli;
    }
}
