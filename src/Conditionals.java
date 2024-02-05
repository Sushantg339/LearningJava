import java.util.Scanner ;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("yes you can drive !");
        }
        else {
            System.out.println("no, you cannot drive yet !");
        }
    }
}
