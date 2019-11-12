public class Polinom {
    int grad;
    int[] coeficienti;
    String name;

    public Polinom(int intGrad, String s){
        this.grad = intGrad;
        this.coeficienti = new int[intGrad];
        this.name = s;
    }

    public Polinom(int intGrad){
        this.grad = intGrad;
        this.coeficienti = new int[intGrad];
    }

    public boolean euqals(Polinom p1, Polinom p2){
        if (p1.grad != p2.grad){
            return false;
        } else{
            boolean ok = true;
            int auxGrad = p1.grad - 1;
            while (auxGrad >= 0 && ok == true){
                if (p1.coeficienti[auxGrad] != p2.coeficienti[auxGrad]){
                    ok = false;
                }
                auxGrad--;
            }
            return  ok;
        }
    }
}
