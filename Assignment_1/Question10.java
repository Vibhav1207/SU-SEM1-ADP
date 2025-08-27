// Apply the concept of looping and arithmetic operators to find the sum of the digits of a number entered by the user. (For example, if the input is 456, the output should be 4 + 5 + 6 = 15.)

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
