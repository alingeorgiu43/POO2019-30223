
public class Functions extends Polynomials{
		Functions(int degree){
			super(degree);
	}
    public static Polynomials add(Polynomials a,Polynomials b) {
    	if(a.degree<b.degree) {
    		 Polynomials sum = new  Polynomials(b.degree);
    		for(int i=0; i<a.degree; i++)
    			sum.v[i] = a.v[i] + b.v[i];
    		for(int i=a.degree; i<b.degree; i++)
    			sum.v[i] = b.v[i];
    		return sum;
    	}
    	else {
    		Polynomials sum = new Polynomials(a.degree);
    		for(int i=0; i<b.degree; i++)
    			sum.v[i] = a.v[i] + b.v[i];
    		for(int i=b.degree; i < a.degree; i++)
    			sum.v[i] = a.v[i];
    		return sum;
    	}
    		
    }
    
    public static Polynomials substract(Polynomials a, Polynomials b) {
    	if(a.degree<b.degree) {
    		Polynomials dif = new Polynomials(b.degree);
    		for(int i=0; i<a.degree; i++)
    			dif.v[i] = a.v[i] - b.v[i];
    		for(int i=a.degree; i<b.degree; i++)
    			dif.v[i] = -b.v[i];
    		return dif;
    	}
    	else {
    		Polynomials dif = new Polynomials(a.degree);
    		for(int i=0; i<b.degree; i++)
    			dif.v[i] = a.v[i] - b.v[i];
    		for(int i=b.degree; i < a.degree; i++)
    			dif.v[i] = a.v[i];
    		return dif;
    	}
    		
    }
    

    public static Polynomials multiply(Polynomials a, Polynomials b) {
    	Polynomials p = new Polynomials(a.degree + b.degree -1);
    	for(int i=0; i<a.degree; i++)
    		for(int j=0; j<b.degree; j++)
    			p.v[i+j] += a.v[i] * b.v[j];
    	return p;
    		
    }
    
   public static Polynomials mul_scal(Polynomials a, int n) {
    	Polynomials p = new Polynomials(a.degree);
    	for(int i=0; i<a.degree; i++)
    		p.v[i] = a.v[i] * n;
    	return p;
    		
    }
    
    public static int eval_x(Polynomials a, int x) {
    	int rez=0;
    	int p=1;
    	for(int i=0; i<a.degree; i++) {
    		rez+=a.v[i]*p;
    		p=p*x;
    	}
    	return rez;
    }
}
