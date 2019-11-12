import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduceti string-ul de la tastatura: ");
        String newString = keyboard.nextLine();
        System.out.println(newString);
        String string = stringInverter(newString);
        System.out.println(string);

    }

    public static String stringInverter(String string) {
        if (string.equals(null) == true) {
            return null;
        } else {
            if (string.contains(" ")) {
                string = string.trim();
            }
            String[] words = string.split(" ");
            if (words.length == 1) {
                return words[0];
            } else if (words.length == 2) {
                string = words[1].concat(", ");
                string = string.concat(words[0]);
                return string;
            } else if (words.length == 3) {
                string = words[2].concat(", ");
                string = string.concat(words[1]);
                string = string.concat(" ");
                string = string.concat(words[0]);
                return string;
            } else if (words.length == 4) {
                string = words[3].concat(", ");
                string = string.concat(words[2]);
                string = string.concat(" ");
                string = string.concat(words[0]);
                string = string.concat(" ");
                string = string.concat(words[1]);
                return string;
            }
        }
        return string;
    }
}
