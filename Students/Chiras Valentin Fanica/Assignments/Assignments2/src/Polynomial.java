import java.util.*;
public class Polynomial {
	private int[]coeficient;
	private int grad;
	
	public Polynomial( int a ,int b)
	{
		coeficient = new int [b+1];
		coeficient[b] = a;
		grad = degree();
	}
	
	public Polynomial (Polynomial p) {
		 coeficient = new int[p.coeficient.length];
		 for(int i =0;i<p.coeficient.length;i++) {
			 coeficient[i]=p.coeficient[i];
	}
		 grad=p.degree();		
	}
	
	public int degree() {
		
		int d=0;
		for(int i =0;i<coeficient.length;i++)
			if(coeficient[i] !=0 ) d = i;
		return d;
	}
	
	public Polynomial ADD(Polynomial b){		
		Polynomial a= this;
		Polynomial c = new Polynomial(0,Math.max(a.grad,b.grad));
		for(int i =0;i<=a.grad;i++)
			c.coeficient[i] += a.coeficient[i];
		for(int i =0;i<=b.grad;i++)
			c.coeficient[i] +=b.coeficient[i];
		c.grad=c.degree();
		return c;	
	}
	
	public Polynomial SUBSTRACT(Polynomial b)
	{
		Polynomial a= this;
		Polynomial c = new Polynomial(0,Math.max(a.grad, b.grad));
		for(int i =0;i<=a.grad;i++)
			c.coeficient[i] += a.coeficient[i];
		for(int i =0;i<=b.grad;i++)
			c.coeficient[i] -=b.coeficient[i];
		c.grad=c.degree();
		return c;
	}
	
	public Polynomial MULTIPLY(Polynomial b)
	{
		Polynomial a =this;
		Polynomial c= new Polynomial(0,a.grad+b.grad);
		for(int i =0;i<=a.grad;i++)
			for(int j=0 ; j<=b.grad;j++)
				c.coeficient[i+j]+=(a.coeficient[i]*b.coeficient[j]);
					c.grad=c.degree();
					return c;		
	}
	
	public static void main(String[] args) {
		
	}
}
