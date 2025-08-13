//Declare a statsic , local and instance variable 

public class Question2 {
    static int a = 5; // statsic 
    int b = 10; // instance
    void display() {
        int c = 15; // local
        System.out.println("Static variable a: " + a);
        System.out.println("Instance variable b: " + b);
        System.out.println("Local variable c: " + c);
    }

    public static void main(String[] args) {
        Question2 obj = new Question2();
        obj.display();
    }
}