public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 10 are:");

        for (int num = 2; num <= 10; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Check divisors up to square root of the number
            if (number % i == 0) {
                return false; // Not a prime number if divisible
            }
        }
        return true; // Prime number
    }
}
