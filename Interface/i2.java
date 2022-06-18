interface Bank{
    float rateOfInterest();
}
class SBI implements Bank{
    public float rateOfInterest()
    {
        return 9.15f;
    }
}
class HDFC implements Bank{
    public float rateOfInterest()
    {
        return 9.7f;
    }
}
public class i2{
    public static void i2(String[] args){
        Bank b = new SBI();
        System.out.println("ROI: " + b.rateOfInterest());
    }
}
