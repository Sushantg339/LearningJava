import java.util.Scanner ;
public class Do_while_loops {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1 ;
        do{
            System.out.println(i);
            i++ ;
        } while(i<=n) ;
    }
}
