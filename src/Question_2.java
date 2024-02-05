import java.util.Scanner ;

public class Question_2{
    public static void main(String[] args) {
        System.out.println("enter your income : ");
        Scanner in = new Scanner(System.in);
        float income = in.nextFloat();
        float tax ;
        if(income<=250000){
            System.out.println("no tax applicable ");
        }
        else if(income<500000){
            tax = income*5/100 ;
            System.out.println("tax payable = " + tax );
        }
        else if (income<1000000) {
            //tax = income*5/100 ;
            tax = income*20/100 + income*5/100 ;
            System.out.println("tax payable = " + tax );
        }
        else if(income > 1000000){
            tax = income*30/100 + income*20/100 + income*5/100;
            System.out.println("tax payable = " + tax );
        }
    }
}
