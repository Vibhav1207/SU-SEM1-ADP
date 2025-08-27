// Apply the concept of arrays and decision statements to find the highest and lowest score from a list of student marks.

public class Question14 {
    public static void main(String[] args) {
        int[] marks = {56, 89, 34, 77, 92};

        int max = marks[0], min = marks[0];

        for(int m : marks) {
            if(m > max) max = m;
            if(m < min) min = m;
        }

        System.out.println("Highest = " + max);
        System.out.println("Lowest = " + min);
    }
}
