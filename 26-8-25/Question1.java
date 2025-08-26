//Write a java program to create a class calculator with a method that 1) adds 2 numbers , 2) adds 3 numbers call both the methods from the main method and print the result

public class Question1 {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Question1 calc = new Question1();
        int sum2 = calc.add(5, 10);
        int sum3 = calc.add(1, 2, 3);
        System.out.println("Sum of 2 numbers: " + sum2);
        System.out.println("Sum of 3 numbers: " + sum3);
    }
}