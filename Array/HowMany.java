/*
1.4.11 Write a program HowMany that takes a variable number of command-line arguments and prints how many there are. */
public class HowMany
{
    public static void main(String[] args)
    {
        int  n = args.length;
        System.out.println("You entered " + n + " Command-line-arguments");
    }
}