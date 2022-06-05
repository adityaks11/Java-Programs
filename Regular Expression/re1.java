import java.util.regex.*;
public class re1 {
    public static void main(String args[]){
        System.out.println(Pattern.matches(".s","as"));
        System.out.println(Pattern.matches(".s","nd"));
        System.out.println(Pattern.matches(".s","anns"));
        System.out.println(Pattern.matches(".s","mst"));
        System.out.println(Pattern.matches("..s","mas"));
    }
}
