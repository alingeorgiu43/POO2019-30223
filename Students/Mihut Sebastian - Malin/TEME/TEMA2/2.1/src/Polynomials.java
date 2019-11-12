import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Polynomials {
		public String s1;
		public String s2;
		public String operations[]=new String[100];

	public static void main(String[] args) throws IOException {
		Polynomials p=new Polynomials();
		InputOutput inputOutput = new InputOutput();
		Functions functions=new Functions();
		
		inputOutput.readFromFile(p);
	
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\Malin\\2.1\\output.txt",true));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		out.write("Cele 2 polinoame sunt");
		out.newLine();
		functions.showPolynom(p.s1);
		functions.showPolynom(p.s2);
			
			
		for(int i=0;i<inputOutput.count;i++) {
			if(p.operations[i].contains("ADD")) {
				out.write("ADD:");
				out.newLine();
				functions.ADD(p.s1, p.s2);
			}
			else if(p.operations[i].contains("SUBSTRACT")) {
				out.write("SUBSTRACT:");
				out.newLine();
				functions.SUBSTRACT(p.s1, p.s2);
			}
			else if(p.operations[i].contains("MULTIPLY")) {
				out.write("MULTIPLY:");
				out.newLine();
				functions.MULTIPLY(p.s1, p.s2);
			}
			else if(p.operations[i].contains("MUL_SCAL")) {
				String s=p.operations[i];
				String rez[]=s.split(" ");
				int x=Integer.parseInt(rez[1]);
				out.write("MUL_SCAL "+rez[1]+":");
				out.newLine();
				functions.MUL_SCAL(p.s1,p.s2,x);
			}
			else if(p.operations[i].contains("EVAL")) {
				String s=p.operations[i];
				String rez[]=s.split(" ");
				int x=Integer.parseInt(rez[1]);
				out.write("EVAL "+rez[1]+":");
				out.newLine();
				functions.EVAL(p.s1,p.s2,x);
			}
		}
		out.close();
	}
}

