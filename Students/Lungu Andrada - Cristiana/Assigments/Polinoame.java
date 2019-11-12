package lab3;//abstract
import java.io.*;
import java.io.File; 
import java.util.Scanner;
import java.io.FileWriter;
// Import the File class
//import java.io.FileNotFoundException;  // Import this class to handle errors
//import java.util.Scanner; // Import the Scanner class to read t
public class Polinoame {
	  
	    
		  public static int[] add(int n,int m,int[] vec1,int[] vec2){
				//int p=0;
				//int[] rez=new int[m+n];
				//int[]vecmax;
				//int[] vecmin;
			  //System.out.println(m);
				if (m>=n) {
					
					int[] rez=new int[m];
						int t=0;
						for(int i=0;i<m-n;i++) {
							
							rez[t]=vec2[i];
							t++;
						}
						//System.out.println(1);
						for(int i=0;i<n;i++) {
							//System.out.println(1);
							rez[t]=(vec2[m-n+i]+vec1[i]);
							t++;
						}
						return rez;
				}
				else {
					
					int[] rez=new int[n];
					int t=0;
					for(int i=0;i<n-m;i++) {
						rez[t]=vec1[i];
						t++;
					}
					for(int i=0;i<m;i++) {
						rez[t]=(vec1[n-m+i]+vec2[i]);
						
						t++;
					}
					//for(int i=0;i<n;i++)
						//System.out.println(rez[i]);
					return rez;
				}
				
					
				//return rez;
				
			}
			public static int[] substract(int n,int[] vec1,int m,int[] vec2) {
				int[] aux=new int[m];
				for(int i=0;i<m;i++)
					aux[i]=-vec2[i];
				if (m>=n) {
					
					int[] rez=new int[m];
						int t=0;
						for(int i=0;i<m-n;i++) {
							
							rez[t]=aux[i];
							t++;
						}
						//System.out.println(1);
						for(int i=0;i<n;i++) {
							//System.out.println(1);
							rez[t]=(aux[m-n+i]+vec1[i]);
							t++;
						}
						return rez;
				}
				else {
					
					int[] rez=new int[n];
					int t=0;
					for(int i=0;i<n-m;i++) {
						rez[t]=vec1[i];
						t++;
					}
					for(int i=0;i<m;i++) {
						rez[t]=(vec1[n-m+i]+aux[i]);
						
						t++;
					}
					//for(int i=0;i<n;i++)
						//System.out.println(rez[i]);
					return rez;
				}
				
			}
			public static int[] multiply(int n,int[] vec1,int m,int[] vec2) {
				int[] rez=new int[m+n];
				for(int i=0;i<m+n;i++)
					rez[i]=0;
				for(int i=0;i<n;i++)
					for(int j=0;j<m;j++)
						rez[i+j]=rez[i+j]+vec1[i]*vec2[j];
				return rez;
		}
			
			public static int[] mul_scal_n(int n,int[] vec,int scal) {
				int[] rez=new int [n];
				for(int i=0;i<n;i++)
					rez[i]=vec[i]*scal;
				return rez;
			}
			public static int power(int a,int b) {
				int putere=1;
				for(int i=1;i<=b;i++)
					putere=putere*a;
				return putere;
			}
			public static int eval(int n,int[] vec,int nr) {
				int rez=0;
				for(int i=0;i<n;i++)
					rez=rez+vec[i]*(power(nr,n-1-i));
				return rez;
			}
			public static void main(String[] args) throws Exception{
				File f=new File("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\lab3\\\\src\\\\lab3\\\\pol.txt");
				FileWriter myWriter = new FileWriter("C:\\Users\\Lenovo\\eclipse-workspace\\lab3\\src\\lab3\\out.txt");
				Scanner scan=new Scanner(f);
				String s=scan.nextLine();
				String[] vec1=s.split(" ");
				int l1=vec1.length;
				int[] p1=new int[l1];
				//System.out.println("polinomul1=");
				for(int i=0;i<l1;i++)
				{
					p1[i]=Integer.parseInt(vec1[i]);
					//System.out.println(p1[i]);
				
				}
				s=scan.nextLine();
				String[] vec2=s.split(" ");
				int l2=vec2.length;
				int[] p2=new int[l2];
				for(int i=0;i<l2;i++)
				{
					p2[i]=Integer.parseInt(vec2[i]);
					//System.out.println(p1[i]);
				
				}
				while(scan.hasNextLine()) {
					s=scan.nextLine();
					if(s.equals("ADD")) {
						int[] rez=new int[l1+l2];
						rez=add(l1,l2,p1,p2);
						int max=l1;
						if (l2>l1)
							max=l2;
						//myWriter.write("\n");
						System.out.println("Suma polinoamelor=");
						for(int i=0;i<max;i++)
							System.out.println(rez[i]+" ");
					}
					else
						if(s.equals("SUBSTRACT")) {
							int[] rez=new int[l1+l2];
							rez=substract(l1,p1,l2,p2);
							int max=l1;
							if(l2>l1)
								max=l2;
							System.out.println("\n");
							System.out.println("Diferenta polinoamelor=");
							for(int i=0;i<max;i++)
								System.out.println(rez[i]+" ");
						}
						else
							if(s.equals("MULTIPLY")) {
								int[] rez=new int[l1+l2];
								rez=multiply(l1,p1,l2,p2);
								System.out.println("\n");
								System.out.println("Inmultirea polinoamelor=");
								for(int i=0;i<l1+l2;i++)
									System.out.println(rez[i]+" ");
									
							}
							else
								//if ((s.charAt(0)=='M' )&& (s.charAt(1)=='U') && (s.charAt(2)=='L') && (s.charAt(3)=='_') && (s.charAt(4)=='S')&& (s.charAt(5)=='C') &&( s.charAt(6)=='A') && (s.charAt(7)=='L') &&( s.charAt(8)!=' ') && (s.charAt(9)>='0') && (s.charAt(9)<='9'))
							if(s.startsWith("MUL_SCAL "))
								
							{
									String s1="";
									s1=s.substring(9); 
									int var;
									var=Integer.parseInt(s1);
									int[] rez=new int[l1];
									rez=mul_scal_n(l1,p1,var);
									System.out.println("\n");
									System.out.println("Inmultirea polinomului cu "+var+"=");
									for(int i=0;i<l1;i++)
										System.out.println(rez[i]+" ");
									
								}
								else
								{
									String s1;
									s1=s.substring(5); 
									int var=Integer.parseInt(s1);					
									int rez;
									rez=eval(l2,p2,var);
									System.out.println("\n");
									System.out.println("Evaluarea polinomului cu "+var+"="+rez);
								}
									
						
				}
				
				}
				
	  
}

