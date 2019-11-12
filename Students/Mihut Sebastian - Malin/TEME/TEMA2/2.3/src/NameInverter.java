
public class NameInverter {

	public String name(String s) {
		if(s==null || s.contentEquals("")) 
			return s;
		else {
			String rez[]=s.split(" ");
			s="";
			int size=rez.length;
			if(size==1)
				s=s.concat(rez[0]);
			else if(size==2) {
				s=s.concat(rez[1]+" "+rez[0]);
			}
			else if(size==3) {
				s=s.concat(rez[2]+", "+rez[1]+" "+rez[0]);	
			}
			else if(size==4) {
				s=s.concat(rez[3]+", "+rez[2]+" "+rez[0]+" "+rez[1]);
			}
			return s;
		}
	}
	
	public static void main(String[] args) {
		NameInverter n= new NameInverter();
		System.out.println(n.name("Mr. Phd. Malin Mihut"));

	}
}
