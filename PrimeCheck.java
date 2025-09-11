import java.util.Scanner;
public class PrimeCheck {
 // Method to check prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // numbers less than or equal to 1 are not prime
        }
// check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // divisible, not prime
            }
        }
        return true; // prime number
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
 // method call
        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }

        sc.close();
    }
}