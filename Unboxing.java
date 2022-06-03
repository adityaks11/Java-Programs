//Wrapper to Primitive
public class Unboxing
{
    public static void main(String args[]){
        Integer a=new Integer(10);
        int i=a.intValue();
        int j=a;
        System.out.println(a+" "+i+" "+j);
    }
}
