public class Reverse 
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {a[i] = i+1;}
       for(int i = 0; i < n; i++)
        {System.out.print(a[i] + " ");}
        System.out.println();

        for(int i = 0; i < n/2; i++)
        {
            int t = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = t;
        }
        for(int i = 0; i < n; i++)
        {System.out.print(a[i] + " ");}
        System.out.println();
    }
}