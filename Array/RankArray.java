public class RankArray
{
    public static void main(String[] args)
    {
        //Initialize an array by taking elements as command line arguments.
        int n = args.length;
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(args[i]);
            System.out.print(a[i] + " ");
        }
        System.out.println();

         // Process to get the rank and print the reduced array
        int[] ranks = new int[n];
        for (int i = 0; i < n; i++) 
        {
            ranks[i] = 0;
            for (int j = 0; j < n; j++) 
            {
                if (a[j] < a[i] || (a[j] == a[i] && j < i)) 
                {ranks[i]++;}
            }
        }

        // Print the reduced array using the ranks
        for (int i = 0; i < n; i++) {
            System.out.print(ranks[i] + " ");
        }
        System.out.println();
    }
}