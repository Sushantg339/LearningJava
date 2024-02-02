import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        System.out.println("enter your name : ");
        Scanner str = new Scanner(System.in) ;
        String name = str.next();
        // Method  1
//        System.out.print("hello ");
//        System.out.print(name );
//        System.out.println(" ,Have a good day !");
        //Method 2
        System.out.println("Hello " + name + " Have a good day");
    }
}
