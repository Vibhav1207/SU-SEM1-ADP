// Apply the concept of shift operators to show how multiplying and dividing a number by 2 can be done efficiently. (For example, if the number is 8, left shift gives 16 and right shift gives 4.)


public class Question11 {
    public static void main(String[] args) {
        int num = 8;

        System.out.println("Original: " + num);
        System.out.println("Left Shift (multiply by 2): " + (num << 1));
        System.out.println("Right Shift (divide by 2): " + (num >> 1));
    }
}
