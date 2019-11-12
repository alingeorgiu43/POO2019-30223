import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner sir = new Scanner(System.in);
		System.out.print("Introduceti string-ul de la tastatura: ");
		String newString = sir.nextLine();
		
		System.out.println(newString);
		String string = stringInverter(newString);
		System.out.println(string);
	}
		
		public static String stringInverter(String str) {
			if(str.equals(null)== true)
			{
				return null;
			}
			else 
			{
				if(str.contains(" "))
				{
					str = str.trim();
				}
				String[] words = str.split(" ");
				if(words.length==1)
				{
					return words[0];
				}
				else if (words.length == 2)
				{
					str = words[2].concat(", ");
					str = str.concat(words[0]);
						return str;
				}
				else if(words.length == 3)
				{
					str = words[2].concat(", ");
					str = str.concat(words[1]);
					str = str.concat(" ");
					str = str.concat(words[0]);
					return str;
				}
				else if(words.length == 4)
				{
					str = words[3].concat(", ");
					str = str.concat(words[2]);
					str = str.concat(" ");
					str = str.concat(words[0]);
					str = str.concat(" ");
					str = str.concat(words[1]);
					return str;
				}
			}
			
			return str;
		}
	}

