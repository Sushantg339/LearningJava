// Write a letter template and replace <name> with a string(some name )

public class PracticeSet3_pr3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|> , Thanks a lot";
        System.out.println(letter.replace("<|name|>" , "Sushant"));
    }
}
