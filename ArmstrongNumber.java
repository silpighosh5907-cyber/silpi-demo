import java.util.Scanner;
public class ArmstrongNumber {
// Method to check if number is Armstrong (returns boolean)
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // count digits
while (num > 0) {
            int digit = num % 10;                // extract last digit
            sum += Math.pow(digit, digits);      // add power of digit
            num /= 10;                           // remove last digit
        }
 return sum == original;  // true if Armstrong
    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
// Call method
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
sc.close();
    }
}