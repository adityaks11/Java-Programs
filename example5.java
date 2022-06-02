public class example5
{
    enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}
    public static void main(String args[]){
        Day day=Day.THURSDAY;
    switch(day)
    {
        case SUNDAY:
            System.out.println("Moving towads Monday");
            break;
        case FRIDAY:
            System.out.println("It's a weekend");
            break;
        default:
            System.out.println("other day");
    }
    }

}
