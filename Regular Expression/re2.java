import java.util.regex.*;
public class re2 {
    public static void main(String args[]){
        System.out.println(Pattern.matches("[amn]","abcd"));
        System.out.println(Pattern.matches("[amn]","ammmna"));
        System.out.println(Pattern.matches("[amn]","a"));
    }
}
