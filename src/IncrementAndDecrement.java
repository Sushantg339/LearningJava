import java.util.Scanner ;
public class IncrementAndDecrement {
    public static void main(strings[] args) {
        System.out.println("enter a number : ") ;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
//        int b = a++;
//        int c = --a ;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
    }
}
