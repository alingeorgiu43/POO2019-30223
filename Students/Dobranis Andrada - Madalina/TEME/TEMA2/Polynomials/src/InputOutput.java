
public class InputOutput {

	public static void main(String[] args) {
		Polynomials a=new Polynomials( new int[] { 5, -4, 2, 0, -2, 3, 0, 3, -17 },9);
		Polynomials b=new Polynomials( new int[] { 4, -2, 0, 1},4);

		a.display();
		b.display();
		Polynomials sum=Functions.add(a, b);
		Polynomials dif=Functions.substract(a, b);
		Polynomials prod=Functions.multiply(a, b);
		Polynomials pscalar=Functions.mul_scal(a, 6);
		int e2=Functions.eval_x(a,2);
		int e9=Functions.eval_x(b,9);
		

		sum.display();
		dif.display();
		prod.display();
	    pscalar.display();
		System.out.println(e2);
		System.out.println(e9);
		
	}

}
