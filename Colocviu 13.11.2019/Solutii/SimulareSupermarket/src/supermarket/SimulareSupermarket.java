package supermarket;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimulareSupermarket {

    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        // adauga angajati
        try {
            adaugaAngajati(supermarket);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //adauga produse
        adaugaProduse(supermarket);

        //serveste clienti fideli si clienti obisnuiti
        servesteClienti(supermarket);

        //sorteaza clienti
        System.out.println("\nSORTEAZA CLIENTI FIDELI: ");
        ClientFidel[] clientiFideli = supermarket.sorteazaClientiFideli();
        afiseazaClientiFideli(clientiFideli);

        // sorteaza angajati
        System.out.println("\nSORTEAZA ANGAJATI: ");
        Angajat[] angajati = supermarket.sorteazaAngajati();
        afiseazaAngajati(angajati);

        //arata statistici
        determinaStatistici(supermarket);
    }

    private static void afiseazaClientiFideli(ClientFidel[] clientiFideli) {
        for (ClientFidel clientFidel : clientiFideli) {
            System.out.println(clientFidel);
        }
    }

    private static void afiseazaAngajati(Angajat[] angajati) {
        for (Angajat angajat : angajati) {
            System.out.println(angajat);
        }
    }

    private static void adaugaAngajati(Supermarket supermarket) throws Exception {
        Angajat angajat1 = new Angajat(1, "Angajat1");
        Angajat angajat2 = new Angajat(2, "Angajat2");
        Angajat angajat3 = new Angajat(3, "Angajat3");

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAngajare = dateFormatter.parse("13/11/2019");

        supermarket.adaugaAngajat(angajat1, dataAngajare);
        supermarket.adaugaAngajat(angajat2, dataAngajare);
        supermarket.adaugaAngajat(angajat3, dataAngajare);
    }

    private static void adaugaProduse(Supermarket supermarket) {
        Produs produs1 = new Produs("Paine", 3.5, 8);
        Produs produs2 = new Produs("Lapte", 5.7, 10);
        Produs produs3 = new Produs("Cerelea", 6.1, 12);
        Produs produs4 = new Produs("Carte", 10.7, 8);
        Produs produs5 = new Produs("Sapun", 1.4, 20);
        Produs produs6 = new Produs("Compot", 3.3, 15);

        supermarket.adaugaProdus(produs1);
        supermarket.adaugaProdus(produs2);
        supermarket.adaugaProdus(produs3);
        supermarket.adaugaProdus(produs4);
        supermarket.adaugaProdus(produs5);
        supermarket.adaugaProdus(produs6);
    }

    private static void servesteClienti(Supermarket supermarket) {
        ClientFidel clientFidel1 = new ClientFidel(1, "ClientFidel1");
        ClientFidel clientFidel2 = new ClientFidel(2, "ClientFidel2");
        ClientFidel clientFidel3 = new ClientFidel(3, "ClientFidel3");

        Client client1 = new Client(4, "Client1");
        Client client2 = new Client(5,"Client2");

        supermarket.adaugaClient(clientFidel1);
        supermarket.adaugaClient(clientFidel2);
        supermarket.adaugaClient(clientFidel3);
        supermarket.adaugaClient(client1);
        supermarket.adaugaClient(client2);

        supermarket.getClienti()[0].adaugaProdus(supermarket.getProduse()[0], 1);
        supermarket.getClienti()[0].adaugaProdus(supermarket.getProduse()[1], 2);
        supermarket.getClienti()[0].adaugaProdus(supermarket.getProduse()[3], 3);
        supermarket.getClienti()[1].adaugaProdus(supermarket.getProduse()[3], 1);
        supermarket.getClienti()[1].adaugaProdus(supermarket.getProduse()[2], 2);
        supermarket.getClienti()[2].adaugaProdus(supermarket.getProduse()[5], 4);
        supermarket.getClienti()[3].adaugaProdus(supermarket.getProduse()[0], 1);
        supermarket.getClienti()[4].adaugaProdus(supermarket.getProduse()[3], 3);

        supermarket.getAngajati()[0].scaneazaProduse(supermarket.getClienti()[0]);
        supermarket.getAngajati()[0].scaneazaProduse(supermarket.getClienti()[1]);
        supermarket.getAngajati()[2].scaneazaProduse(supermarket.getClienti()[2]);
        supermarket.getAngajati()[1].scaneazaProduse(supermarket.getClienti()[3]);
        supermarket.getAngajati()[1].scaneazaProduse(supermarket.getClienti()[4]);
    }

    public static void determinaStatistici(Supermarket supermarket) {
        int produseClienti = supermarket.calculeazaTotalProduseClienti();
        int produseClientiFideli = supermarket.calculeazaTotalProduseClientiFideli();

        System.out.println("\nProduse vandute clientilor fideli: " + produseClienti);
        System.out.println("\nPrduse vandute celorlalti clienti: " + produseClientiFideli);

    }
}
