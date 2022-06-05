import java.util.regex.*;
public class re3 {
    public static void main(String args[]){
        System.out.println("? quantifier ... ");
        System.out.println(Pattern.matches("[amn]?","a"));
        System.out.println(Pattern.matches(" [amn]?","aaa"));
        System.out.println(Pattern.matches("[amn]?","aammmnn"));
        System.out.println(Pattern.matches("[amn]?","aazzta"));
        System.out.println(Pattern.matches("[amn]?","am"));

    }
}
