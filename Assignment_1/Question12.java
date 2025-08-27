// Apply the concept of nested if-else to find the largest among three numbers entered by the user.

public class Question12 {
    public static void main(String[] args) {
        int a = 12, b = 25, c = 9;

        if(a > b) {
            if(a > c)
                System.out.println("Largest = " + a);
            else
                System.out.println("Largest = " + c);
        } else {
            if(b > c)
                System.out.println("Largest = " + b);
            else
                System.out.println("Largest = " + c);
        }
    }
}
