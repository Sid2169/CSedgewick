public class LongestPlateau
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {a[i] = (int)(Math.random()*n); System.out.print(a[i] + " ");}
    System.out.println();

        int currentPlateauBegins = 0;
        int currentPlateauEnds = 0;
        int currentLength = 0;
        int maxLength = 0;
        int maxPlateauBegins = 0;
        int maxPlateuaEnds = 0;

        while(n - currentPlateauEnds + 1 > maxLength)
        {
            for(int i = currentPlateauEnds; a[i] < a[i+1]; i++)
            {currentPlateauBegins = i+1;}
            for(int i = currentPlateauBegins; a[i]>=a[i+1]; i++)
            {currentPlateauEnds = i;}

            if(currentPlateauEnds + 1 - currentPlateauBegins > currentLength)
            {
                maxLength = currentPlateauEnds + 1 - currentPlateauBegins;
                currentLength = maxLength;
                maxPlateauBegins = currentPlateauBegins;
                maxPlateuaEnds = currentPlateauEnds;
            }
            else if(currentPlateauEnds + 1 - currentPlateauBegins == currentLength)
            {currentLength = currentPlateauEnds + 1 - currentPlateauBegins;}
        }
        for(int i = maxPlateauBegins; i <= maxPlateuaEnds; i++)
        {System.out.print(a[i] + " ");}
        System.out.println(maxPlateauBegins + " " + maxPlateuaEnds + " " + maxLength);
    }
}