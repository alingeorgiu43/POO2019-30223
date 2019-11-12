import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Functions {
	
	public void showPolynom(String s) throws IOException {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\Malin\\2.1\\output.txt",true));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String[] a=s.split(" ");
		int size=a.length-1;
		out.write(a[0]+"x^"+size+" ");
		for(int i=size-1;i>=0;i--) {
			if(Integer.parseInt(a[size-i])>0) {
				if(i>1)
					out.write("+"+a[size-i]+"x^"+i+" ");
				else if(i==1)
					out.write("+"+a[size-i]+"x ");
				else 
					out.write("+"+a[size-i]);
			}
			else if(Integer.parseInt(a[size-i])<0) {
				if(i>1)
					out.write(a[size-i]+"x^"+i+" ");
				else if(i==1)
					out.write(a[size-i]+"x ");
				else 
					out.write(a[size-i]);
			}
		}
		out.newLine();
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ADD(String a, String b)
	{
		String[] a1 = a.split(" ");
		String[] a2 = b.split(" ");
		
		int size1 = a1.length-1;
		int size2 = a2.length-1;
		int maxx = Math.max(a1.length, a2.length);
		String[] dif = new String[maxx];
		
		for(int i=maxx-1;i>=0;i--)
		{
			if(size1<0)
				dif[i] = a2[size2];
			if(size2<0)
				dif[i] = a1[size1];
			else
				dif[i]= Integer.toString(Integer.parseInt(a1[size1])+Integer.parseInt(a2[size2]));
			size1--;
			size2--;
		}
		String result = Arrays.stream(dif).collect(Collectors.joining(" "));
		try {
			showPolynom(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void SUBSTRACT(String a, String b)
	{
		String[] a1 = a.split(" ");
		String[] a2 = b.split(" ");
		
		int size1 = a1.length-1;
		int size2 = a2.length-1;
		int maxx = Math.max(a1.length, a2.length);
		String[] sum = new String[maxx];
		
		for(int i=maxx-1;i>=0;i--)
		{
			if(size1<0)
				sum[i] = a2[size2];
			if(size2<0)
				sum[i] = a1[size1];
			else
				sum[i]= Integer.toString(Integer.parseInt(a1[size1])-Integer.parseInt(a2[size2]));
			size1--;
			size2--;
		}
		String result = Arrays.stream(sum).collect(Collectors.joining(" "));
		try {
			showPolynom(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void MULTIPLY(String a, String b) {
		String[] a1=a.split(" ");
		String[] a2=b.split(" ");
		int size1=a1.length-1;
		int size2=a2.length-1;
		int size3=size1+size2+1;
		String[] mul= new String[size3] ;
		for(int i=0;i<size3;i++)
			mul[i]="0";
		for(int i=0;i<=size1;i++) {
			for(int j=0;j<=size2;j++) {
				mul[i+j]= Integer.toString(Integer.parseInt(mul[i+j])+Integer.parseInt(a1[i])*Integer.parseInt(a2[j]));
			}
		}
		String result = Arrays.stream(mul).collect(Collectors.joining(" "));
		try {
			showPolynom(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void MUL_SCAL(String a,String b,int n) {
	String[] a1=a.split(" ");
	String[] a2=b.split(" ");
	int size1=a1.length-1;
	int size2=a2.length-1;
	for(int i=0;i<=size1;i++)
		a1[i]= Integer.toString(n*Integer.parseInt(a1[i]));
	String result1 = Arrays.stream(a1).collect(Collectors.joining(" "));
	try {
		showPolynom(result1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(int i=0;i<=size2;i++)
		a2[i]= Integer.toString(n*Integer.parseInt(a2[i]));
	String result2 = Arrays.stream(a2).collect(Collectors.joining(" "));
	try {
		showPolynom(result2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void EVAL(String a, String b,int n) throws IOException
	{
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\Malin\\2.1\\output.txt",true));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String[] a1 = a.split(" ");
		String[] a2 = b.split(" ");
		
		int size1 = a1.length-1;
		int size2 = a2.length-1;
		int sum1 = 0;
		int sum2 = 0;
		int x = 1;
		for(int i=size1;i>=0;i--)
		{
			sum1 +=x*Integer.parseInt(a1[i]);
			x *=n;
		}
		x = 1;
		for(int i=size2;i>=0;i--)
		{
			sum2+=x*Integer.parseInt(a2[i]);
			x *=n;
		}
		out.write(sum1+" vs "+sum2);
		out.newLine();
		out.close();
	}
	
	public static void main(String[] args) {
	}
}
