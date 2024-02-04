// Write a java program to detect double and triple spaces in a string
public class PracticeSet3_pr4 {
    public static void main(String[] args) {
        String myLine = "I am a  student of     bachelor of technology";
        System.out.println(myLine.indexOf("  "));
        System.out.println(myLine.indexOf("   "));
        System.out.println(myLine.lastIndexOf("  "));
        System.out.println(myLine.lastIndexOf("   "));
    }
}
