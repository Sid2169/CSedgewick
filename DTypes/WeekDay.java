public class WeekDay
{
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        
        //Now using month(m), day(d) and year(y) to get a serial number for how many days have passed
        double yAbsolute = y - (14-m)/12;
        double x = yAbsolute + (yAbsolute/4) - (yAbsolute/100) + (yAbsolute/400);

        double mAbsolute = m + (12*((14-m)/12)) - 2;

        int weekDay = (int)((d + x + (31*mAbsolute)/12) % 7);

        if (weekDay == 0) {System.out.println("Sunday");}
        else if(weekDay ==1) {System.out.println("Monday");}
        else if(weekDay ==2) {System.out.println("Tuesday");}
        else if(weekDay ==3) {System.out.println("Wednesday");}
        else if(weekDay ==4) {System.out.println("Thursday");}
        else if(weekDay ==5) {System.out.println("Friday");}
        else if(weekDay ==6) {System.out.println("Saturday");}

        
        

        
        
    }
}