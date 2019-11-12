
public class loto {
	static double factorial(int N,int m) 
    { 
		double f=1;
        for (int i =m; i <= N; i++) 
            f = f*i; 
        return f; 
    } 

	public static void main(String[] args) {
		double cf= 1;
		double cp=factorial(49,44)/factorial(6,1);
		double loto=cf/cp;

       System.out.println(loto);

	}

}