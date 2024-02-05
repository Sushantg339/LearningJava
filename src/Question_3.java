import java.util.Scanner ;
public class Question_3 {
    public static void main(String[] args) {
        System.out.println("enter a number (1 to 7): ");
        Scanner sc = new Scanner (System.in);
        int week = sc.nextInt();
        switch (week){
            case 1 :{
                System.out.println("monday");
                break;
            }
            case 2 :{
                System.out.println("tuesday");
                break;
            }
            case 3 :{
                System.out.println("wednesday");
                break;
            }
            case 4 :{
                System.out.println("thursday");
                break;
            }
            case 5 :{
                System.out.println("friday");
                break;
            }
            case 6 :{
                System.out.println("saturday");
                break;
            }
            case 7 :{
                System.out.println("sunday");
                break;
            }
            default :{
                System.out.println("jyada chull hai kya bhai , daal le 1 se 7 ke beech ka number");
            }
        }
    }
}
