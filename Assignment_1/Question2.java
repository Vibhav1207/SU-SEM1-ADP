/*  Demonstrate how to compare the marks of two students to check who scored higher. */

public class Question2 {
    public static void main(String[] args) {
        int student1 = 85, student2 = 92;

        if(student1 > student2)
            System.out.println("Student 1 scored higher.");
        else if(student2 > student1)
            System.out.println("Student 2 scored higher.");
        else
            System.out.println("Both scored the same.");
    }
}
