/* Birthday problem.  Develop a class with appropriate static methods for studying the birthday problem. Suppose that people enter an empty room until a pair of people share a birthday. On average, how many people will have to enter before there is a match? Run experiments to estimate the value of this quantity. Assume birthdays to be uniform random integers between 0 and 364. */
public class Birthday
{
    public static void main(String[] args)
    {
        System.out.println(averageNoOfPeople(Integer.parseInt(args[0])));
    }
    
    public static int countBeforeMatch()//Simulater the process of people entering the room until two people share the same Birthday.
    {
        boolean[] FoundBirthDay = new boolean[365];
        boolean match = false;
        int count = 0;

        while(!match)
        {
            int index =(int)(Math.random() * 365);
            if (index == 365) {index -= 1;}
            
            if (!FoundBirthDay[index])
            {
                FoundBirthDay[index] = true;
                count++;
            }
            else
            {
                count++;
                match = true;
            }
        }
        return count;
    }

    public static int averageNoOfPeople(int n)//Calls countBeforeMatch() n time to calculate the average.
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += countBeforeMatch();
        }
        return (int)(sum / n);
    }
}