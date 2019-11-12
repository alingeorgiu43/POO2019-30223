import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws IOException {

        File file = new File("pol.txt");
        Writer writer = new FileWriter("output.txt");
        try (Scanner input = new Scanner(file)) {

            int firstPoliDegree = input.nextInt();
            Polinom p1 = new Polinom(firstPoliDegree,"p1");
            int auxGrad1 = firstPoliDegree;
            while (auxGrad1 > 0){
                p1.coeficienti[auxGrad1 - 1] = input.nextInt();
                auxGrad1--;
            }

            Function f = new Function();

            //f.afisarePolinom2();
            afisarePolinom(p1,(FileWriter) writer);

            int secondPoliDegree = input.nextInt();
            Polinom p2 = new Polinom(secondPoliDegree,"p2");
            int auxGrad2 = secondPoliDegree;
            while (auxGrad2 > 0){
                p2.coeficienti[auxGrad2 - 1] = input.nextInt();
                auxGrad2--;
            }
            //f.afisarePolinom2(p2);
            afisarePolinom(p2,(FileWriter) writer);

            int k = input.nextInt();

            for (int i = 0; i < k; i++) {
                String operatie;
                int valoare;
                if (input.hasNext() == true) {
                    operatie = input.next();
                    if (operatie.equals("ADD")) {
                        Polinom p3 = f.add(p1, p2);
                        //f.afisarePolinom2(p3);
                        afisarePolinom(p3,(FileWriter) writer);
                    }
                    if (operatie.equals("SUBTRACT")) {
                        Polinom p3 = f.subtract(p1, p2);
                        //f.afisarePolinom2(p3);
                        afisarePolinom(p3,(FileWriter) writer);
                    }
                    if (operatie.equals("MULTIPLY")) {
                        Polinom p3 = f.multiply(p1, p2);
                        //f.afisarePolinom2(p3);
                        afisarePolinom(p3,(FileWriter) writer);
                    }
                    if (operatie.equals("MUL_SCAL")) {
                        if (input.hasNextInt() == true) {
                            valoare = input.nextInt();
                            Polinom p3 = f.mulScal(p1, valoare);
                            //System.out.print(valoare + "*p1 = ");
                            scriereString((FileWriter) writer,String.valueOf(valoare) + "*p1 = ");
                            //f.afisareSimpla(p3);
                            afisareFaraNume(p3,(FileWriter) writer);

                            p3 = f.mulScal(p2, valoare);
                            //System.out.print(valoare + "*p2 = ");
                            scriereString((FileWriter) writer,String.valueOf(valoare) + "*p2 = ");
                            //f.afisareSimpla(p3);
                            afisareFaraNume(p3,(FileWriter) writer);
                        }
                    }
                    if (operatie.equals("EVAL")) {
                        if (input.hasNextInt() == true) {
                            valoare = input.nextInt();
                            int valoarePolinom1 = f.eval(p1, valoare);
                            //System.out.print("Valoarea polinomului p1 in punctul x = " + valoare + " este: " + valoarePolinom1);
                            scriereString((FileWriter) writer, "Valoarea polinomului p1 in punctul x = " + String.valueOf(valoare) + " este: " + String.valueOf(valoarePolinom1) + "\n");
                            //System.out.println();
                            int valoarePolinom2 = f.eval(p2, valoare);
                            //System.out.print("Valoarea polinomului p2 in punctul x = " + valoare + " este: " + valoarePolinom2);
                            scriereString((FileWriter) writer, "Valoarea polinomului p2 in punctul x = " + String.valueOf(valoare) + " este: " + String.valueOf(valoarePolinom2) + "\n");
                            //System.out.println();
                        }
                    }
                }
            }

            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void scriereString(FileWriter writer, String valoareDeScris) throws IOException {
        writer.write(valoareDeScris);
    }

    public static void scriereValoare(FileWriter writer, int valoareDeScris) throws IOException {
        writer.write(String.valueOf(valoareDeScris));
    }

    public static void afisarePolinom(Polinom p, FileWriter writer) throws IOException {
        scriereString(writer,p.name + " = ");
        for (int i = p.grad - 1; i >= 0; i--) {
            if (p.coeficienti[i] != 0) {
                if (i != 0 && i != p.grad - 1) {
                    if (p.coeficienti[i] > 0) {
                        scriereString(writer,"+ " + String.valueOf(p.coeficienti[i]) + "*x^" + String.valueOf(i) + " ");
                    } else {
                        scriereString(writer,String.valueOf(p.coeficienti[i]) + "*x^" + String.valueOf(i) + " ");
                    }
                } else {
                    if (i == 0) {
                        if (p.coeficienti[i] > 0) {
                            scriereString(writer, "+ " + String.valueOf(p.coeficienti[i]));
                        } else {
                            scriereString(writer, String.valueOf(p.coeficienti[i]));
                        }
                    } else {
                        if (p.coeficienti[i] > 0) {
                            scriereString(writer,   String.valueOf(p.coeficienti[i]) + "*x^" + String.valueOf(i) + " ");
                        } else {
                            scriereString(writer, String.valueOf(p.coeficienti[i]) + "*x^" + String.valueOf(i) + " ");
                        }
                    }
                }
            }
        }
        writer.write("\n");
    }

    public static void afisareFaraNume(Polinom p, FileWriter writer) throws IOException {
        for (int i = p.grad - 1; i >= 0; i--) {
            if (p.coeficienti[i] != 0) {
                if (i != 0 && i != p.grad-1) {
                    if(p.coeficienti[i] > 0) {
                        scriereString(writer, "+ " + String.valueOf(p.coeficienti[i]) + "*x^" + String.valueOf(i) + " ");
                    } else {
                        scriereString(writer, String.valueOf(p.coeficienti[i]) + "*x^" + String.valueOf(i) + " ");
                    }
                } else {
                    if (i == 0) {
                        if(p.coeficienti[i] > 0) {
                            scriereString(writer, "+ " + String.valueOf(p.coeficienti[i]));
                        } else {
                            scriereString(writer,String.valueOf(p.coeficienti[i]));
                        }
                    } else {
                        if(p.coeficienti[i] > 0) {
                            scriereString(writer, String.valueOf(p.coeficienti[i]) + "*x^" + String.valueOf(i) + " ");
                        } else {
                            scriereString(writer, String.valueOf(p.coeficienti[i]) + "*x^" + String.valueOf(i) + " ");
                        }
                    }
                }
            }
        }
        writer.write("\n");
    }

    // altfel nu imi iesea scrierea in fisier :(
}