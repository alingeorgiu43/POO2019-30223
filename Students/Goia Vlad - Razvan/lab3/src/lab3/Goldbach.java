package lab3;

public class Goldbach {

	public static void main(String[] args) {
		int maxCheck = 100;

        int[] primeNumbers = new int[maxCheck];

        for (int number = 1, index = 0; number <= maxCheck; number++, index++) {
            if (isPrime(number)) {
                primeNumbers[index] = number;
            }
        }

        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        for (int index = 0; index < primeNumbers.length; index++) {
            if (primeNumbers[index] != 0) {
                System.out.printf("%d ", primeNumbers[index]);
            }
        }

        System.out.println();

        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i] == 0) {
                continue;
            }

            for (int j = i; j < primeNumbers.length; j++) {
                if (primeNumbers[j] == 0) {
                    continue;
                }

                int number = primeNumbers[i] + primeNumbers[j];

                if (number % 2 == 0) { // conjecture only applies to even numbers
                    System.out.printf("%d = %d + %d\n", number, primeNumbers[i], primeNumbers[j]);
                }
            }
        }
    }

    public static boolean isPrime(int number) {

        if (number < 2 || number % 2 == 0) {
            return (number == 2);
        }

        for (int odd = 3; odd * odd <= number; odd += 2) {
            if (number % odd == 0) {
                return false;
            }
        }

        return true;
	}

}
