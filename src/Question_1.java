import java.util.Scanner ;

public class Question_1 {
    public static void main(String[] args) {
        System.out.println("enter number of subject 1 : ");
        Scanner sc1 = new Scanner(System.in);
        int sub1 = sc1.nextInt();
        System.out.println("enter number of subject 2 : ");
        Scanner sc2 = new Scanner(System.in);
        int sub2 = sc2.nextInt();
        System.out.println("enter number of subject 3 : ");
        Scanner sc3 = new Scanner(System.in);
        int sub3 = sc3.nextInt();
        float percent = (sub1 + sub2 + sub3)/3.0f ;
        if(percent>40 && sub1>33 && sub2>33 && sub3>33){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

//        if(sub1<33){
////            System.out.println("You failed in Subject 1");
////        }
////        else if(sub2<33){
////            System.out.println("you failed in subject 2");
////        }
////        else if(sub3<33){
////            System.out.println("you failed in subject 3");
////        }
////        else if(percent < 40){
////            System.out.println("Failed");
////        }
////        else{
////            System.out.println("Pass");
////        }
    }
}
