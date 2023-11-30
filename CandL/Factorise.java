public class Factorise {
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        System.out.print(n + "=");

        for (int i=2; i<=n; i++) 
        {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) 
            {
                if (i % j == 0) {isPrime = false; break;}
            }
            
            while (isPrime && n % i == 0) 
            {
                System.out.print(i);
                n = n / i;
                if (n > 1) {System.out.print("*");}
            }
        }
        System.out.println();
    }
}
