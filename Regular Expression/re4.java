import java.util.regex.*;
public class re4 {
    public static void main(String args[]){
        System.out.println("+ quantifier ...");
        System.out.println(Pattern.matches("[amn]+", "a"));
        System.out.println(Pattern.matches("[amn]+", "aaa"));
        System.out.println(Pattern.matches("[amn]+", "aaazzta"));
        System.out.println("* quantifier ...");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));
    }
}
