
public class PoliAplic {
	
	public  void PrintPol(polinom p)
	{
		int n=p.grad;
		System.out.print(p.coef[n]+"x^"+n);
		for (int i=n-1;i>1; i--)
		{
			int pow=i;
			int c=p.coef[i];
			if (c < 0)
				System.out.print(c + "x^" + pow);
			else if (c > 0)
				System.out.print("+" + c + "x^" + pow);
		}

		if (p.coef[1] < 0)
			System.out.print(p.coef[1] + "x");
		else if (p.coef[1] > 0)
			System.out.print("+" + p.coef[1] + "x");
		if (p.coef[0] < 0)
			System.out.print(p.coef[0]);
		else if (p.coef[0] > 0)
			System.out.print("+" + p.coef[0]);
		
		System.out.println();
	}
	
	public  polinom adunare(polinom p1, polinom p2)
	{
		int maxGrad;
		if (p2.grad > p1.grad)
			maxGrad = p2.grad;
		else 
			maxGrad= p1.grad;
		polinom p3 = new polinom(maxGrad);
		
		for (int i = 0; i <= maxGrad; i++)
		{
			int c1 = 0;
			int c2 = 0;
			
			if (i <= p1.grad)
				c1 = p1.coef[i];
			
			if (i <= p2.grad)
				c2 = p2.coef[i];
			
			p3.coef[i] = c1 + c2;
		}

		return p3;
	}
	
	public  polinom scadere(polinom p1, polinom p2)
	{
		int maxGrad;
		if (p2.grad > p1.grad)
			maxGrad = p2.grad;
		else 
			maxGrad= p1.grad;
		polinom p3 = new polinom(maxGrad);
		
		for (int i = 0; i <= maxGrad; i++)
		{
			int c1 = 0;
			int c2 = 0;
			
			if (i <= p1.grad)
				c1 = p1.coef[i];
			
			if (i <= p2.grad)
				c2 = p2.coef[i];
			
			p3.coef[i] = c1 - c2;
		}

		return p3;
	}
	
	public  polinom inmultire(polinom p1, polinom p2)
	{
		int max_grad = p1.grad + p2.grad;
		polinom p3 = new polinom (max_grad);
		
		for (int i = 0; i <= max_grad; i++)
		{
			p3.coef[i] = 0;
		}
	if(p1.grad>p2.grad)
	{
		for (int i = 0; i <= p1.grad; i++)
		{
			for (int j = 0; j <= p2.grad; j++)
			{
				p3.coef[i+j] += p1.coef[i] * p2.coef[j];
			}
		}
	}
	else
		for (int i = 0; i <= p2.grad; i++)
		{
			for (int j = 0; j <= p1.grad; j++)
			{
				p3.coef[i+j] += p1.coef[i] * p2.coef[j];
			}
		}
		return p3;
	}
	
	public  polinom inmultireScalar(polinom p, int scalar)
	{
		int m = p.grad;
		
		for (int i = 0; i <= m; i++)
			p.coef[i] *= scalar;
		
		return p;
	}
	
	public int eval(polinom p, int val)
	{
		int m = p.grad;
		int rez = 0;
		int x = 1;
		
		for (int i = 0; i <= m; i++)
		{
			rez += x * p.coef[i];
			x *= val;
		}
		
		return rez;
	}
	
}
