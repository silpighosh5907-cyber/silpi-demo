import java.util.Scanner;
public class OddEvenCheck {
// Method to check odd or even
    public static void checkOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
 // Call method
        checkOddEven(number);
         sc.close();
    }
}