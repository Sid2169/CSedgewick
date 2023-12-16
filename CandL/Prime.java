public class Prime
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int primeCouter = 0;

        if(n>=2) {primeCouter+=1; System.out.print(2 + " ");}

        for(int i=3; i<=n; i+=2)
        {
            boolean isPrime = true;
            
            for(int j=2; j<=i/j; j++)
            {
                if(i%j==0) {isPrime=false; break;}
            }

            if (isPrime==true) {primeCouter+=1; System.out.print(i + " ");}
        }

        System.out.println();
        System.out.println("Total number of primes under "+ n + " is " + primeCouter);
    }
}