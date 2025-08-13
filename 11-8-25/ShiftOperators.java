
public class ShiftOperators {
    public static void main(String[] args) {
        int num = 4;
        System.out.println("Binary: "+ Integer.toBinaryString(num));
        System.out.println("Original Number: "+ num);
        System.out.println("Left Shift Operator: "+ (num << 1));
        System.out.println("Binary: "+ Integer.toBinaryString(num << 1));
        System.out.println("Right Shift Operator: "+ (num >> 1));
    System.out.println("Binary: "+ Integer.toBinaryString(num >> 1));
        
}
}
