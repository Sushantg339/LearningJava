import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {

        System.out.print("enter a number : ");
        Scanner s = new Scanner(System.in);
        System.out.println(s.hasNextInt());
    }
}
