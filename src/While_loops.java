import java.util.Scanner ;

public class While_loops {
    public static void main(String[] args) {
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = 1 ;
        while(j <= i){
            System.out.println(j);
            j++ ;
        }
    }
}
