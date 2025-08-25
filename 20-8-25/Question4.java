//Write a java program using switch-case, that takes numbers from 1-7 from the user and prints the corresponding day
 import java.util.Scanner;
public class Question4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        switch(num){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wedneday");
            break;
            case 4:
            System.out.println("Thurday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        }
    }
}