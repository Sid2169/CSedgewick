/*
 * This program takes n as input command line argument and simulate object selection by generating random 
 * numbers between 0 and n-1 until getting every possible value.
 * 
 */
public class Collector
{
    public static void main(String[] args)
    {
        //Generate random values in [0...n ] until finding each one

        int n = Integer.parseInt(args[0]);
        boolean[] isSelected = new boolean[n];
        int count = 0;
        int distinct = 0;

        while (distinct < n)
        {//Generate another object.
           int r = (int) (Math.random()*n);
           count++; 
           System.out.print(r + " ");
           if (!isSelected[r])
           {
            distinct++;
            isSelected[r] = true;
           }
        }// n distinct objects are found.
        System.out.println();
        System.out.println(count);
    }
}