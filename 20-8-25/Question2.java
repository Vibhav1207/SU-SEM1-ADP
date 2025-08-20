//There are 2 sides given as a = 3, b=2 and c=7. Check that will it form a triangle

public class Question2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 7;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides form a triangle.");
        } else {
            System.out.println("The sides do not form a triangle.");
        }
    }
}