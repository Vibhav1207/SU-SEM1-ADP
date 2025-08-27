// Apply the concept of arrays to separate even and odd numbers from a given list of integers.

public class Question15 {
    public static void main(String[] args) {
        int[] numbers = {10, 23, 45, 66, 78, 91, 100};

        System.out.print("Even numbers: ");
        for(int n : numbers) {
            if(n % 2 == 0) System.out.print(n + " ");
        }

        System.out.print("\nOdd numbers: ");
        for(int n : numbers) {
            if(n % 2 != 0) System.out.print(n + " ");
        }
    }
}
