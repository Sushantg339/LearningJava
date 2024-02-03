import java.util.Scanner ;
public class KmToMiles {
    public static void main(strings[] args) {
        Scanner miles = new Scanner(System.in);
        System.out.print("enter kms : ") ;
        float mile = miles.nextFloat();
        mile = mile * 0.621371f ;
        System.out.println(mile);
    }
}
