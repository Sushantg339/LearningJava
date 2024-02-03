import java.util.Scanner ;
public class TakingInput {
    public static void main(strings[] args) {
      //  System.out.println("aisa kaise ho skta h !");
        Scanner s = new Scanner(System.in);
        System.out.print("enter marks 1 : ");
        int a = s.nextInt();
        System.out.print("enter marks 2 : ");
        int b = s.nextInt();
        System.out.print("enter marks 3 : ");
        int c = s.nextInt();
        System.out.print("enter marks 4 : ");
        int d = s.nextInt();
        System.out.print("enter marks 5 : ");
        int e = s.nextInt();
        float per = (a+b+c+d+e) /5.0f;
        System.out.print("the percentage is : ");
        System.out.print(per);

    }
}
