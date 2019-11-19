package supermarket;

public class ClientFidel extends Client {
    private int puncte;
    private double discount;

    public ClientFidel(int id, String nume){
        super(id,nume);
    }


    public void aplicaReducere(){
        calculeazaPuncte();
        calculeazaDiscount();
    }

    public String toString(){
        return super.toString() + ", puncte: " + puncte;
    }

    private void calculeazaPuncte(){
        puncte =  (int) ((sumaCumparaturi* 75) / 10 );
    }

    private void calculeazaDiscount(){
        discount = puncte * 0.005;
    }

    public double getSumaCumparaturi(){
        return sumaCumparaturi;
    }
}
