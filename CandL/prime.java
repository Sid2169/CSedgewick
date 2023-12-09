public class prime
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int counter = 0;
        if (n>=2) {counter=1; System.out.print(2+" ");}

        
        for(int i=3; i<=n; i=i+2)
        {
            
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++)
            {
                if (i%j==0)
                {isPrime=false; break;}
            }
            if(isPrime==true)
            {
                System.out.print(i+" ");
                counter+=1;
            }
        }
        System.out.println();
        System.out.println("Number of primes found under "+args[0]+" is "+counter);
    }
}