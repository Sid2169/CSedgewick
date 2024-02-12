/* 
1.5.17 Write a program that reads in a sequence of real numbers between –1 and +1 and prints their average magnitude, average power, and the number of zero crossings. The average magnitude is the average of the absolute values of the data values. The average power is the average of the squares of the data values. The number of zero crossings is the number of times a data value transitions from a strictly negative number to a strictly positive number, or vice versa. These three statistics are widely used to analyze digital signals
*/

public class crossing17
{
    public static void main(String[] args)
    {
        if(StdIn.isEmpty()){StdOut.println("No input available");}

        else
        {
            double xPrev = StdIn.readDouble();
            double sum = xPrev;
            double sqSum = xPrev*xPrev;
            int n = 1;
            int zeroCrossings = 0;

            while(!StdIn.isEmpty())
            {
              double x = StdIn.readDouble();
              if((x<0 && xPrev>0 ) || (x>0 && xPrev<0))
              {zeroCrossings++;}
               n++;
              sum += x;
              sqSum += x*x;
              xPrev = x;  
            }
            double average = sum/n;
            double powerAverage = sqSum/n;
            StdOut.printf("Average is %1.3f, average power is %1.3f and the number of zero crossings is %d ",   average, powerAverage, zeroCrossings );

        }
        
    }
}