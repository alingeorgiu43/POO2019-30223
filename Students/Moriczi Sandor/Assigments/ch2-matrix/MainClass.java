import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainClass {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public static void main(String[] args) {
		long rez[][]= new long[100][100];
		long a[][]= {
						{1,0,2},
						{3,1,0},
						{2,0,1}
					};
		long b[][]= {
						{1,2,0},
						{1,2,0},
						{1,2,0}
					};
		int lenghtL=a.length;
		int lenghtC=a[0].length;
		int lenghtCb=b[0].length;
		//System.out.println(lenghtCb);
		Operatii op= new Operatii();
		//op.add(a, b, rez);
		//op.subtract(a, b, rez);
		op.multiply(a, b, rez);
		op.afisare(rez, lenghtL, lenghtCb);
		int scalar=4;
		op.multiplyScalar(a, rez, scalar);
		op.afisare(rez, lenghtL, lenghtC);
		System.out.println("det: "+ op.determinantOfMatrix(a, lenghtL, lenghtL));
		op.areEqual(a, b);
		op.isZeroMatrix(a);
		op.isIdentityMatrix(a);
		System.out.println("fill degree:" + df2.format(op.fillDegree(a))+ "%") ;
		
		

	}

}
