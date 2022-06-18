import java.util.ArrayList;
import java.util.List;

public class clear
{
    public static void main(String[] args)
    {
        List<String> val = new ArrayList<>();
        val.add("Apple");
        val.add("is");
        val.add("Healthy");
        System.out.println("before clear: " +val);
        val.clear();
        System.out.println("after clear: " +val);
    }
}
