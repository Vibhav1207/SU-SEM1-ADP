// Demonstrate how to count the number of characters in a word entered by the user

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        System.out.println("Number of characters: " + word.length());
    }
}
