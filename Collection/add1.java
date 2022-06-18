import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class add1
{
    public static void main(String[] args){
        List<Integer> val = new ArrayList<>();
        val.add(0);
        val.add(12);
        val.add(24);
        Iterator z=val.iterator();
        while(z.hasNext())
        {
            System.out.print(z.next());
        }
        System.out.println(" ArrayList: " +val);
    }
}
