public class example3 {
    public enum Season {
        SUMMER,WINTER,SPRING,AUTUMN
    }
    public static void main(String[] args){
        for (Season s : Season.values()){
            System.out.println(s);
        }
        System.out.println("Value of SPRING is: "+Season.valueOf("SPRING"));
        System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());
    }
}
