/*This code checks every odd number starting from 3 until n if it is prime or not .
 * Second for loop starts at i == 2 which is a prime  and isPrime[2] is also set to true at the moment. 
 * Since if condition is true at the first iteration of loop the next for loop inside the if condition 
 * sets all multiples of i, which is a prime for i == 2, to false. This continues and eleminates every 
 * multiple of prime at the end we can add a for loop to count no.of true values in array is Prime[]
 */
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