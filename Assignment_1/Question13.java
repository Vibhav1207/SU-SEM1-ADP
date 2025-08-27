// Apply the concept of a while loop to reverse a number entered by the user.

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        while(num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        System.out.println("Reversed number = " + rev);
    }
}
