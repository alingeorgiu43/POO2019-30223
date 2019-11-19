package hotel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReceptieHotel {

    public static void main(String[] args) {

        // se creeaza un hotel
        Hotel hotel = new Hotel();

        // se adauga angajati
        try {
            adaugaAngajati(hotel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // se adauga camere
        adaugaCamere(hotel);

        //angajatii cazeaza oaspeti
        try {
            cazeazaOaspeti(hotel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // sorteaza angajati
        System.out.println("SORTARE ANGAJATI: ");
        Angajat[] angajatiSortati = hotel.sorteazaAngajati();
        afiseazaAngajati(angajatiSortati);

        //sorteazaClienti
        System.out.println("\n\n SORTARE CLIENTI: ");
        Client[] clientiSortati = hotel.sorteazaClienti();
        afiseazaClienti(clientiSortati);

        // emite factura pentru toti clientii
        System.out.println("\n\n FACTURI:");
        emiteFacturi(hotel);

        //arata statistici legate de camer goale si camere pline
        afiseazaStatistici(hotel);

        // arata o lista cu camere libere
        System.out.println("CAMERE LIBERE: ");
        afiseazaListaCamereLibere(hotel);

        // decazeaza un oaspetei
        System.out.println("\n\nDOI OASPETI S-AU DECAZAT.");
        decazeazaClienti(hotel);

        // arata o lista cu camere libere
        System.out.println("\n\nCAMERE LIBERE: ");
        afiseazaListaCamereLibere(hotel);
    }

    private static void adaugaAngajati(Hotel hotel) throws Exception {
        Angajat angajat1 = new Angajat(1, "Dan", "0768453211");
        Angajat angajat2 = new Angajat(2, "Cristina", "0345890012");
        Angajat angajat3 = new Angajat(3, "Daniel", "0761903702");

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAngajare = dateFormatter.parse("13/11/2019");

        hotel.adaugaAngajat(angajat1, dataAngajare);
        hotel.adaugaAngajat(angajat2, dataAngajare);
        hotel.adaugaAngajat(angajat3, dataAngajare);
    }

    private static void adaugaCamere(Hotel hotel) {
        Camera camera1 = new Camera(1, 2);
        camera1.setPretNoapte(100);
        camera1.setPretRegimSingle(250);
        Camera camera2 = new Camera(2, 3);
        camera2.setPretNoapte(90);
        camera2.setPretRegimSingle(210);
        Camera camera3 = new Camera(3, 4);
        camera3.setPretNoapte(70);
        camera3.setPretNoapte(190);

        hotel.adaugaCamera(camera1);
        hotel.adaugaCamera(camera2);
        hotel.adaugaCamera(camera3);
    }

    private static void emiteFacturi(Hotel hotel) {
        for (Client client : hotel.getClienti()) {
            hotel.emiteFactura(client);
            hotel.emiteFactura(client, 0.2);
        }
    }

    private static void afiseazaStatistici(Hotel hotel) {
        int camereLibere = hotel.calculeazaCamereLibere();
        int camereOcupate = hotel.calculeazaCamerePline();
        System.out.println("In hotel sunt " + camereLibere + " camere libere.");
        System.out.println("In hotel sunt " + camereOcupate + " camere pline.");
    }

    private static void afiseazaListaCamereLibere(Hotel hotel) {
        int camereLibere = hotel.calculeazaCamereLibere();
        if(camereLibere == 0){
            System.out.println("Nu sunt camere libere.");
        }else{
            for (Camera camera : hotel.getCamere()) {
                if (!camera.esteOcupata()) {
                    System.out.println(camera);
                }
            }
        }
    }

    private static void afiseazaAngajati(Angajat[] angajati) {
        for (Angajat angajat : angajati) {
            System.out.println(angajat);
        }
    }

    private static void afiseazaClienti(Client[] clienti) {
        for (Client client : clienti) {
            System.out.println(client);
        }
    }

    public static void cazeazaOaspeti(Hotel hotel) throws Exception {
        Client client1 = new Client(1, "Client1", "0761694031");
        Client client2 = new Client(2, "Client2", "0761694031");
        Client client3 = new Client(3, "Client3", "0761694031");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataCheckIn = dateFormat.parse("13/11/2019");
        Date dataCheckOut1 = dateFormat.parse("19/11/2019");
        Date dataCheckOut2 = dateFormat.parse("14/11/2019");
        Date dataCheckOut3 = dateFormat.parse("16/11/2019");

        hotel.getAngajati()[0].cazeazaClient(hotel, client1, hotel.getCamere()[1], "normal", dataCheckIn, dataCheckOut1);
        hotel.getAngajati()[0].cazeazaClient(hotel, client2, hotel.getCamere()[1], "normal", dataCheckIn, dataCheckOut2);
        hotel.getAngajati()[0].cazeazaClient(hotel, client3, hotel.getCamere()[1], "normal", dataCheckIn, dataCheckOut3);

        Client client4 = new Client(1, "Client4", "0761694031");
        Client client5 = new Client(2, "Client5", "0761694031");

        Date dataCheckOut4 = dateFormat.parse("30/11/2019");
        Date dataCheckOut5 = dateFormat.parse("29/11/2019");

        hotel.getAngajati()[1].cazeazaClient(hotel, client4, hotel.getCamere()[0], "normal", dataCheckIn, dataCheckOut4);
        hotel.getAngajati()[1].cazeazaClient(hotel, client5, hotel.getCamere()[0], "normal", dataCheckIn, dataCheckOut5);

        Client client6 = new Client(6, "Client6", "0761694031");
        Date dataCheckOut6 = dateFormat.parse("21/11/2019");

        hotel.getAngajati()[2].cazeazaClient(hotel, client6, hotel.getCamere()[2], "single", dataCheckIn, dataCheckOut6);
    }

    private static void decazeazaClienti(Hotel hotel) {
        Client client1 = hotel.getClienti()[0];
        hotel.getAngajati()[0].decazeazaClient(hotel, client1);
        Client client6 = hotel.getClienti()[5];
        hotel.getAngajati()[2].decazeazaClient(hotel, client6);
    }

}
