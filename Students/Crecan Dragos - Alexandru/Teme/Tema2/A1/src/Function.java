public class Function {
    public static void afisarePolinom2(Polinom p){
        System.out.print(p.name + " = ");
        for (int i = p.grad - 1; i >= 0; i--){
            if (p.coeficienti[i] != 0){
                if (i != 0 && i != p.grad-1){
                    if(p.coeficienti[i] > 0){
                        System.out.print("+ " + p.coeficienti[i] + "*x^" + i + " ");
                    } else {
                        System.out.print(p.coeficienti[i] + "*x^" + i + " ");
                    }
                } else {
                    if (i == 0){
                        if(p.coeficienti[i] > 0){
                            System.out.print("+ " + p.coeficienti[i]);
                        } else {
                            System.out.print(p.coeficienti[i]);
                        }
                    } else {
                        if(p.coeficienti[i] > 0){
                            System.out.print(p.coeficienti[i] + "*x^" + i + " ");
                        } else {
                            System.out.print(p.coeficienti[i] + "*x^" + i + " ");
                        }
                    }
                }
            }
        }
        System.out.println();
    }

    public static void afisareSimpla(Polinom p){
        for (int i = p.grad - 1; i >= 0; i--){
            if (p.coeficienti[i] != 0){
                if (i != 0 && i != p.grad-1){
                    if(p.coeficienti[i] > 0){
                        System.out.print("+ " + p.coeficienti[i] + "*x^" + i + " ");
                    } else {
                        System.out.print(p.coeficienti[i] + "*x^" + i + " ");
                    }
                } else {
                    if (i == 0){
                        if(p.coeficienti[i] > 0){
                            System.out.print("+ " + p.coeficienti[i]);
                        } else {
                            System.out.print(p.coeficienti[i]);
                        }
                    } else {
                        if(p.coeficienti[i] > 0){
                            System.out.print(p.coeficienti[i] + "*x^" + i + " ");
                        } else {
                            System.out.print(p.coeficienti[i] + "*x^" + i + " ");
                        }
                    }
                }
            }
        }
        System.out.println();
    }

    public static int gradMaxim(Polinom p1, Polinom p2){
        if (p1.grad > p2.grad){
            return p1.grad;
        } else {
            return p2.grad;
        }
    }

    public static Polinom add(Polinom p1, Polinom p2){
        if (p1.grad > p2.grad){
            Polinom p3 = new Polinom(p1.grad, "p1 + p2");
            int n = p1.grad;
            int m = p2.grad;
            for (int i = n - 1; i >= m; i--){
                p3.coeficienti[i] = p1.coeficienti[i];
            }
            for (int i = m - 1; i >= 0; i--) {
                p3.coeficienti[i] = p1.coeficienti[i] + p2.coeficienti[i];
            }
            return p3;
        }  else {
            Polinom p3 = new Polinom(p2.grad, "p2 + p1");
            int n = p2.grad;
            int m = p1.grad;
            for (int i = n - 1; i >= m; i--){
                p3.coeficienti[i] = p1.coeficienti[i];
            }
            for (int i = m - 1; i >= 0; i--) {
                p3.coeficienti[i] = p1.coeficienti[i] + p2.coeficienti[i];
            }
            return p3;
        }
    }

    public static boolean isValidSubtract(Polinom p1, Polinom p2){
        if (p1.grad >= p2.grad){
            return true;
        } else{
            return false;
        }
    }

    public static Polinom subtract(Polinom p1, Polinom p2){
        int n = p1.grad;
        int m = p2.grad;
        if (n >= m){
            Polinom p3 = new Polinom(p1.grad, p1.name + " - " + p2.name);
            while (n != m){
                p3.coeficienti[n - 1] = p1.coeficienti[n - 1];
                n--;
            }
            for (int i = m - 1; i >= 0; i--){
                p3.coeficienti[i] = p1.coeficienti[i] - p2.coeficienti[i];
            }
            return p3;
        } else {
            Polinom p3 = new Polinom(p2.grad,p1.name + " - " + p2.name);
            while (n != m){
                p3.coeficienti[m - 1] = (-1) * p2.coeficienti[m - 1];
                m--;
            }
            for (int i = n - 1; i >= 0; i--){
                p3.coeficienti[i] = p1.coeficienti[i] - p2.coeficienti[i];
            }
            return p3;
        }
    }

    public static Polinom mulScal(Polinom p, int scalar){
        Polinom pResult = new Polinom(p.grad);
        for (int i = 0; i < p.grad; i++){
            pResult.coeficienti[i] = scalar * p.coeficienti[i];
        }
        return pResult;
    }

    public static Polinom multiply(Polinom p1, Polinom p2){
        Polinom result = new Polinom(p1.grad + p2.grad, "p1 * p2");
        for (int i = 0; i < result.grad; i++){
            result.coeficienti[i] = 0;
        }
        for (int i = 0; i < p1.grad; i++){
            for (int j = 0; j < p2.grad; j++){
                result.coeficienti[i + j] +=  p1.coeficienti[i] * p2.coeficienti[j];
            }
        }
        return result;
    }

    public static int ridicareLaPuterePozitiva(int baza, int exponent){
        if (exponent == 0){
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= exponent; i++){
                result *= baza;
            }
            return result;
        }
    }

    public static int eval(Polinom p, int x){
        int valoarePolinom = 0;
        for (int i = 0; i < p.grad; i++){
            valoarePolinom += p.coeficienti[i] * ridicareLaPuterePozitiva(x,i);
        }
        return valoarePolinom;
    }


}
