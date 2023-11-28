public class binary
{
    public static void main(String[] args)
    {
        int powerOfTwo = 1;
        int number = Integer.parseInt(args[0]);

        while(powerOfTwo<=number/2)
        {
            powerOfTwo*=2;
        }

        while (powerOfTwo>=1)
        {
            if(number/powerOfTwo == 1)
            {System.out.print('1');}

            else
            {System.out.print('0');}

            number = number%powerOfTwo;
            powerOfTwo = powerOfTwo/2;
        }
        System.out.println();
    }
}