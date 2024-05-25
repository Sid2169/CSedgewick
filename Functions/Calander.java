public class Calander
{
    
    public static int day(int month, int day, int year) 
    {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }
    
    // return true if the given year is a leap year
    public static boolean isLeapYear(int year) 
    {
        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
        if  (year % 400 == 0) return true;
        return false;
    }
    
    public static void calander(int month, int year)
    {
        String day =      "Su Mo Tu We Th Fr Sa";
        String[] months = {"Invalid Month", 
                           "January", 
                           "February", 
                           "March", 
                           "April", 
                           "May", 
                           "June", 
                           "July", 
                           "August", 
                           "September", 
                           "October", 
                           "November", 
                           "December"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        
        // check for leap year
        if (month == 2 && isLeapYear(year)) days[month] = 29;                  
         
        // print calendar header
         StdOut.println("   " + months[month] + " " + year);
         StdOut.println(day);
        
         // starting day
        int d = day(month, 1, year);
        
        // print the calendar
         for (int i = 0; i < d; i++)
         {
            StdOut.print("   ");
         }
         for (int i = 1; i <= days[month]; i++) 
         {
            StdOut.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month])) StdOut.println();
         }
    }

    public static void main(String[] args)
    {
        calander(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}