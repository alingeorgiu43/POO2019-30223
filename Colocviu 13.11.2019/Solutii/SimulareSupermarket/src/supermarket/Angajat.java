package supermarket;

import java.util.Date;

public class Angajat extends Persoana implements Comparable<Angajat> {
    private Date dataAngajare;
    private int clientiServiti;
    private Client[] clienti;

    public Angajat(int id, String nume){
        super(id,nume);
        clienti = new Client[10];
    }
    public void setDataAngajare(Date dataAngajare){
        this.dataAngajare = dataAngajare;
    }

    //servest un client
    public void scaneazaProduse(Client client){
        clienti[clientiServiti] = client;
        clientiServiti++;

        if(client instanceof ClientFidel){
            ((ClientFidel) client).aplicaReducere();
        }

        System.out.println("Suma cumparaturilor este: " + client.getSumaCumparaturi());
    }


    public int compareTo(Angajat angajat){
        if(clientiServiti > angajat.clientiServiti){
            return 1;
        }else {
            if(clientiServiti < angajat.clientiServiti){
                return -1;
            }
        }
        return 0;
    }

    public String toString(){
        return super.toString() + ", clientiServiti: " + clientiServiti;
    }
}
