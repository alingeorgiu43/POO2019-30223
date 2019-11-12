import java.math.BigDecimal;

public class MatrixOperations {
    public static void printMatirx(BigDecimal[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++ ) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static BigDecimal[][] add(BigDecimal[][] mat1, BigDecimal[][] mat2, int rows, int columns) {
        BigDecimal[][] mat3 = new BigDecimal[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat3[i][j] = mat1[i][j].add(mat2[i][j]);
            }
        }
        return mat3;
    }

    public static BigDecimal[][] subtract(BigDecimal[][] mat1, BigDecimal[][] mat2, int rows, int columns) {
        BigDecimal[][] mat3 = new BigDecimal[rows][columns];
        for (int i = 0; i < rows; i++ ) {
            for (int j = 0; j < columns; j++ ) {
                mat3[i][j] = mat1[i][j].subtract(mat2[i][j]);
            }
        }
        return mat3;
    }

    public static BigDecimal[][] multiply(BigDecimal[][] mat1, BigDecimal[][] mat2, int rows, int columns) {
        BigDecimal[][] mat3 = new BigDecimal[rows][columns];
        BigDecimal partialResult = new BigDecimal(0);
        BigDecimal zero = new BigDecimal(0);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    partialResult = partialResult.add(mat1[i][k].multiply(mat2[k][j]));
                }
                mat3[i][j] = partialResult;
                partialResult = zero;
            }
        }
        return mat3;
    }

    public static BigDecimal[][] multiplyScalar(BigDecimal[][] mat, int rows, int columns, int scalar) {
        BigDecimal[][] matResult = new BigDecimal[rows][columns];
        BigDecimal bigDecimalScalar = new BigDecimal(scalar);
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matResult[i][j] = mat[i][j].multiply(bigDecimalScalar);
            }
        }
        return matResult;
    }

    public static boolean areEqual(BigDecimal[][] mat1, BigDecimal[][] mat2, int rows, int columns) {
        boolean ok = true;
        int i = 0;
        int j = 0;
        while (i < rows && ok == true) {
            while (j < columns && ok == true) {
                if (mat1[i][j].equals(mat2[i][j]) == false) {
                    ok = false;
                }
                j++;
            }
            i++;
        }
        return  ok;
    }

    public static boolean isZeroMatrix(BigDecimal[][] mat, int rows, int columns) {
        boolean ok = true;
        BigDecimal zero = new BigDecimal(0);
        int i = 0;
        int j = 0;
        while (i < rows && ok == true) {
            while(j < columns && ok == true) {
                if (mat[i][j].equals(zero) == false) {
                    ok = false;
                }
                j++;
            }
            i++;
        }
        return  ok;
    }

    public static boolean isIdentityMatrix(BigDecimal[][] mat, int rows, int columns) {
        boolean ok = true;
        int i = 0;
        int j = 0;
        BigDecimal zero = new BigDecimal(0);
        BigDecimal unu = new BigDecimal(1);
        while (i < rows && ok == true) {
            if (mat[i][i].equals(unu) == false) {
                ok = false;
            }
            i++;
        }
        if (ok == true) {
            i = 0;
            while (i < rows && ok == true) {
                while(j < columns && ok == true) {
                    if (i != j){
                        if (mat[i][j].equals(zero) == false){
                            ok = false;
                        }
                    }
                    j++;
                }
                i++;
            }
            return ok;
        } else {
            return false;
        }
    }

    public static BigDecimal fillDegree(BigDecimal[][] mat, int rows, int columns) {
        BigDecimal nrElemente = new BigDecimal(rows * columns);
        BigDecimal zero = new BigDecimal(0);
        BigDecimal unu = new BigDecimal(1);
        int numarElementeNenule = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mat[i][j].equals(zero) == false) {
                    numarElementeNenule += 1;
                }
            }
        }
        BigDecimal nrElementeNenule = new BigDecimal(numarElementeNenule);
        BigDecimal grad = nrElementeNenule.divide(nrElemente);
        //int suta1 = 100;
        //BigDecimal suta = new BigDecimal(suta1);
        grad = BigDecimal.valueOf(100).multiply(grad);
        return grad;
    }
}
