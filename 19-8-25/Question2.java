//  A person is eligible to vote if their age is 18 or above. If they are 18 or above, check if they have a voter ID card. If they do, print "You are eligible to vote." If they don't have a voter ID card, print "You need a voter ID to vote."

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Do you have a voter ID card? (yes/no)");
        String hasVoterID = sc.nextLine();

        if (age >= 18) {
            if (hasVoterID.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You need a voter ID to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}