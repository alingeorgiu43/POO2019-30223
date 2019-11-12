import java.math.BigDecimal;


public class Matrix {
	BigDecimal[][] matrix;

	public static void main(String[] args) {
		Matrix a= new Matrix();
		Matrix m= new Matrix();
		m.matrix=new BigDecimal[][] {
						new BigDecimal[] {new BigDecimal(3),new BigDecimal(1),new BigDecimal(1)},
						new BigDecimal[]{new BigDecimal(1),new BigDecimal(1),new BigDecimal(2)},
						new BigDecimal[]{new BigDecimal(1),new BigDecimal(1),new BigDecimal(1)},
		};
		Matrix n= new Matrix();
		n.matrix=new BigDecimal[][] {
						new BigDecimal[] {new BigDecimal(1),new BigDecimal(2),new BigDecimal(2)},
						new BigDecimal[]{new BigDecimal(3),new BigDecimal(4),new BigDecimal(2)},
						new BigDecimal[]{new BigDecimal(1),new BigDecimal(0),new BigDecimal(1)},
		};
		
		System.out.println("Matricile sunt:");
		MatrixOperations.show(m.matrix);
		System.out.println();
		MatrixOperations.show(n.matrix);
		System.out.println("ADD:");
		a.matrix=MatrixOperations.ADD(m.matrix, n.matrix);
		MatrixOperations.show(a.matrix);
		System.out.println("SUBTRACT:");
		a.matrix=MatrixOperations.SUBTRACT(m.matrix, n.matrix);
		MatrixOperations.show(a.matrix);
		System.out.println("MULTIPLY:");
		a.matrix=MatrixOperations.MULTIPLY(m.matrix, n.matrix);
		MatrixOperations.show(a.matrix);
		BigDecimal x =new BigDecimal(2);
		System.out.println("MULTIPLY SCALAR:");
		a.matrix=MatrixOperations.MULTIPLYSCALAR(m.matrix, x);
		MatrixOperations.show(a.matrix);
		int size=m.matrix.length;
		BigDecimal determinant=MatrixOperations.determinantOfMatrix(m.matrix,size);
		System.out.println("DETERMINANT:");
		System.out.println(determinant);
		
	}
}
