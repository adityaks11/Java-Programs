import java.util.ArrayList;
import java.util.List;

public class addAll
{
    public static void main(String[] args)
    {
        List<String> val1 = new ArrayList<>();
        val1.add("Hello");
        List<String> val2 = new ArrayList<>();
        val2.add("welcome to the class");
        val1.addAll(val2);
        System.out.println(val1);
    }
}
