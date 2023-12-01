public class Growth
{
    public static void main(String[] args)
    {
        for(int n=16; n<=2048;n=n*2)
        {
            System.out.println("log "+n+"="+Math.log10(n)+" "+n+ " "+n+" log "+n+"="+n*(Math.log10(n))+ " "+n*n+" "+n*n*n+" "+Math.pow(2, n));
        }
    }
}