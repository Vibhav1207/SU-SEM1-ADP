//WAP  for assignment operator

public class AssignmentOperator {
    public static void main (String[] args){
        int a = 20, b = 10, c;
        a += b;
        System.out.println("A = " + a);
        a -= b;
        System.out.println("A = " + a);
        a *= b;
        System.out.println("A = " + a);
        a /= b;
        System.out.println("A = " + a);
        c = a  + b;
        System.out.println("C = " + c);
        c = a%b;
        System.out.println("C = " + c);
    }
}