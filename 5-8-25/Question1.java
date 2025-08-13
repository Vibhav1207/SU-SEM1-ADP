//WAP to take user input of 3 numbers and print the sun of the numbers.
 public class Question1 {
  public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number:");
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The sum of the numbers is:" + sum);
        scanner.close();

  }
    
 }
