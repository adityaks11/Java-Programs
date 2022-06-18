import java.util.ArrayList;
import java.util.List;

public class addAll1
{
    public static void main(String[] args)
    {
        List<Integer> val1 = new ArrayList<>();
        val1.add(50);
        val1.add(100);
        List<Integer> val2 = new ArrayList<>();
        val2.add(300);
        val2.add(600);
        val2.addAll(val1);
        System.out.println(val1);
        System.out.println(val2);
    }
}
