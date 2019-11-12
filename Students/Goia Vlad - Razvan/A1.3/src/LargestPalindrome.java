
public class LargestPalindrome {
    public static void main(String[] args) 
    {
    	int maxim = -1;
    	for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
            	int produs = i * j;
                if (produs <= maxim) {
                    break;
                }

                if (isPalindrome(produs)) {
                    maxim = produs;
                }
            }
        }
        System.out.print(maxim);
    }
    private static boolean isPalindrome(final int candidat) {
        int p = candidat;
        int invers = 0;
        while (p != 0) {
            invers *= 10;
            invers += p % 10;
            p /= 10;
        }
        return invers == candidat;
    }

}
