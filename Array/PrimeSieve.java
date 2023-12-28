public class PrimeSieve
{
    public static void main(String[] args)
    {
        //Print the number of primes <=n.

        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];

        for(int i = 2; i<=n; i++)
        {isPrime[i] = true;}

        for(int i = 2; i<=n/i; i++)
        {
            if(isPrime[i])
            {//Mark multiples of i as no-prime
               for(int j = i; j<=n/i; j++)
               {
                isPrime[i*j] = false;
               }

            }
        }

        int count = 0;
        for(int i = 2; i<=n; i++)
        {
            if(isPrime[i] == true)
            {
                count++;
                System.out.print(i + " ");
            
            }
        }
        System.out.println();

        System.out.println("Total number of primes found under "+ n+ " is "+count);
    }
}