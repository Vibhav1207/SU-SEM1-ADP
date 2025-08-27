// Demonstrate how to store marks of 5 subjects in an array and calculate the average.

public class Question8 {
    public static void main(String[] args) {
        int[] marks = {80, 90, 85, 70, 95};
        int sum = 0;

        for(int m : marks)
            sum += m;

        double avg = (double)sum / marks.length;
        System.out.println("Average marks = " + avg);
    }
}
