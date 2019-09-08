
public class q6_29 {

	public static void main(String[] args) {
		// Find  and display all twin primes less than 1,000

		System.out.println();
		for (int p = 2; p < 1000; p++) {
			if (isTwinprime(p))
				System.out.println("(" + p + ", " + (p + 2) + ")");
		}
	}


	public static boolean isTwinprime(int num) {
		return PrimeNumberMethod.isPrime(num)
				&& PrimeNumberMethod.isPrime(num + 2);
	}


}