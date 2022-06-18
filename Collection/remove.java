import java.util.ArrayList;
import java.util.List;

public class remove
{
    public static void main(String[] args)
    {
        List<Integer> val = new ArrayList<>();
        val.add(0);
        val.add(13);
        val.add(24);
        val.add(35);
        val.remove(2);
        System.out.println(" ArrayList: " + val);
    }
}
