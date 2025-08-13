//WAP for bitwise operator

public class BitwiseOperator {
    public static void main(String[] args){
        int a = 12, b=25;

    System.out.println("A & B: "+ (a & b)); // Bitwise AND
    System.out.println("A | B: "+ (a | b)); // Bitwise OR
    System.out.println("A ^ B: "+ (a ^ b)); // Bitwise Exclusive OR
    System.out.println("~B: "+ (~b)); // Bitwise Complement of B
    System.out.println("A << 2: "+ (a << 2)); // Bitwise Shift Left by 2
    System.out.println("A >> 2: "+ (a >> 2)); // Bitwise Shift Right by 2
    System.out.println("A >>> 2: "+ (a >>> 2)); // Bitwise Shift Right zero fill by 2

    }
}