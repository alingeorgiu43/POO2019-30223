import java.math.BigDecimal;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MatrixOperations matrixOperation = new MatrixOperations();

        System.out.print("Numarul de al primei matrice este: ");
        int rows1 = keyboard.nextInt();
        System.out.print("Numarul de coloane al primei matrice este: ");
        int columns1 = keyboard.nextInt();

        BigDecimal[][] matrix1 = new BigDecimal[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++ ) {
                System.out.print("mat1[" + i + "][" + j + "] = ");
                matrix1[i][j] = keyboard.nextBigDecimal();
            }
        }

        System.out.print("Numarul de linii pentru a doua matrice este: ");
        int rows2 = keyboard.nextInt();
        System.out.print("Numarul de coloane pentru a doua matrice este: ");
        int columns2 = keyboard.nextInt();

        BigDecimal[][] matrix2 = new BigDecimal[rows2][columns2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print("mat2[" + i + "][" + j + "] = ");
                matrix2[i][j] = keyboard.nextBigDecimal();
            }
        }

        System.out.println("Prima matrice este: ");
        matrixOperation.printMatirx(matrix1,rows1,columns1);

        System.out.println("A doua matrice este: ");
        matrixOperation.printMatirx(matrix2,rows2,columns2);

        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Nu se pot efectua operatii pe aceste doua matrici!");
        } else {
            BigDecimal[][] addResult = matrixOperation.add(matrix1,matrix2,rows1,columns1);
            System.out.println("Suma celor doua matrici este: ");
            matrixOperation.printMatirx(addResult,rows1,columns1);

            BigDecimal[][] subtractResult = matrixOperation.subtract(matrix1,matrix2,rows1,rows2);
            System.out.println("Diferenta celor doua matrici este: ");
            matrixOperation.printMatirx(subtractResult,rows1,columns1);

            BigDecimal[][] multiplyResult = matrixOperation.multiply(matrix1,matrix2,rows1,columns1);;
            System.out.println("Rezultatul inmultirii celor doua matrici este: ");
            matrixOperation.printMatirx(multiplyResult,rows1,columns1);

            System.out.print("Valoarea scalarului este: ");
            int scalar = keyboard.nextInt();
            BigDecimal[][] firstMultiplyScalar = matrixOperation.multiplyScalar(matrix1,rows1,columns1,scalar);
            System.out.println(scalar + " * matricea1: ");
            matrixOperation.printMatirx(firstMultiplyScalar,rows1,columns1);
            BigDecimal[][] secondMultiplyScalar = matrixOperation.multiplyScalar(matrix2,rows2,columns2,scalar);
            System.out.println(scalar + " * matricea2: ");
            matrixOperation.printMatirx(secondMultiplyScalar,rows2,columns2);

            if (matrixOperation.areEqual(matrix1,matrix2,rows1,columns1) == true) {
                System.out.println("Cele doua matrici sunt egale.");
            } else {
                System.out.println("Cele doua matrici nu sunt egale.");
            }

            if(matrixOperation.isZeroMatrix(matrix1,rows1,columns1) == true) {
                System.out.println("Prima matrice este matricea nula.");
            } else {
                System.out.println("Prima matrice nu este matricea nula.");
            }
            if (matrixOperation.isZeroMatrix(matrix2,rows2,columns2) == true) {
                System.out.println("A doua matrice este matricea nula.");
            } else {
                System.out.println("A doua matrice nu este matricea nula.");
            }

            if(matrixOperation.isIdentityMatrix(matrix1,rows1,columns1) == true) {
                System.out.println("Prima matrice este matricea identitate.");
            } else {
                System.out.println("Prima matrice nu este matricea identitate.");
            }
            if(matrixOperation.isIdentityMatrix(matrix2,rows2,columns2) == true) {
                System.out.println("A doua matrice este matricea identitate.");
            } else {
                System.out.println("A doua matrice nu este matricea identitate.");
            }

            BigDecimal gradUmplere1 = matrixOperation.fillDegree(matrix1,rows1,columns1);
            System.out.println("Gradul de umplere al primei matrice este: " + gradUmplere1 + "%");
            BigDecimal gardUmplere2 = matrixOperation.fillDegree(matrix2,rows2,columns2);
            System.out.println("Gradul de umplere al celei de-a doua matrice este: " + gardUmplere2 + "%");

        }
    }
}
