
public class Newton {
	int a = 1;
	int b = 4;
	int c = -5;
	float x0 = 2;
    public static float evaluatef(int a,int b,int c,float x){
        return a*x*x+b*x+c;
    }
    public static float derivate(int a,int b,float x){
        return 2*a*x+b;
    }
    public static float findRoot(int a,int b,int c,float x0){

        float x1 = x0;
        do{
            x0 = x1;
            x1 = x0 - evaluatef(a,b,c,x0)/derivate(a,b,x0);
        }while(Math.abs(x1-x0) > 0.00001f);
        return x1;
    }

	public static void main(String[] args) {
		Newton n=new Newton();
		System.out.println(n.findRoot(n.a,n.b,n.c,n.x0));
		
		
	
	}

}
