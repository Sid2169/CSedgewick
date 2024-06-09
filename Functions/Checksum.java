public class Checksum
{
    public static int checksum(int d)
    {
        int sum = 0;
        String stringOfd = Integer.toString(d);

        for (int i = 0, n = stringOfd.length(); i < n; i++)
        {
            if (i % 2 == 0)
            {
                int t = stringOfd.charAt(i);
                sum += t;
            }
            else 
            {
                int t = stringOfd.charAt(i);
                sum += f(t);
            }
        }
        return sum;    
    }
    
    
    public static int f(int d)
    {
        int result = ((2 * d) % 10) + ((2 * d) / 10);
        return result;
    }

    public static void main(String[] args)
    {
        int accountNumber = Integer.parseInt(args[0]);
        int checkSum = checksum(accountNumber);
        if (checkSum % 10 != 0)
        {
            System.out.println("Invalid account number");
        }
        else
        {
            System.out.print(accountNumber);
            System.out.println(checkSum / 10);
        }

    }
}