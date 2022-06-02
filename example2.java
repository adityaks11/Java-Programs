public class example2 {
    public enum Season {
        SUMMER,WINTER,SPRING,AUTUMN
    }
    public static void main(String[] args){
        for(Season s : Season.values()){
            System.out.println(s);
        }
    }
}
