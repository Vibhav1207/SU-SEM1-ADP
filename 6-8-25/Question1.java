//WAP to demonstrade all unary operators in Java.

public class Question1 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        
        System.out.println("Unary Plus:" + (+a));
        System.out.println("Unary Plus:" + (+b));

        System.out.println("--------------------");

        System.out.println("Unary Minus:" + (-a));
        System.out.println("Unary Minus:" + (-b));

        System.out.println("--------------------");

        
        System.out.println("Unary Negation:" + (!true));
        System.out.println("Unary Negation:" + (!false));

        System.out.println("--------------------");

    
        System.out.println("Unary Bitwise Complement:" + (~a));
        System.out.println("Unary Bitwise Complement:" + (~b));

        System.out.println("--------------------");

       
        System.out.println("Unary Increment:" + (++a));
        System.out.println("Unary Increment:" + (++b));
        
        System.out.println("--------------------");

        
        System.out.println("Unary Decrement:" + (--a));
        System.out.println("Unary Decrement:" + (--b));
    }
}