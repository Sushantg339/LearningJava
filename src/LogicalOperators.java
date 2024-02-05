import java.util.Scanner ;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("enter a condition : ");
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        System.out.println("enter another condition : ");
        Scanner st = new Scanner(System.in);
        boolean b = st.nextBoolean();
        if(a || b){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
