/*
1.4.4 Write a code fragment that reverses the order of the values in a one-dimensional string array. Do not create another array to hold the result. Hint: Use the code in the text for exchanging the values of two elements. */
public class Reverse 
{
    public static void main(String[] args)
    {
        for (int i = 0, n = args.length; i < (n / 2); i++)
        {
            String temp = args[i]; 
            args[i] = args[n - i - 1];
            args[n - i - 1] = temp;
        }

        for (int i = 0, n = args.length; i < n; i++)
        {
            System.out.print(args[i] + " ");
        }
        System.out.println();

    }
}