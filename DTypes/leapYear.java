public class leapYear
{
    public static void main(String[] args)
    {
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 !=0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        if(isLeapYear == true) {
            System.out.println( year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}