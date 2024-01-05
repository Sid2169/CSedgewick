public class LongestPlateau 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];

        // Fill the array with random values
        for (int i = 0; i < n; i++) 
        {
            a[i] = (int) (Math.random() * n);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int currentPlateauBegins = 0;
        int currentLength = 1;
        int maxLength = 1;
        int maxPlateauBegins = 0;

        // Loop through the array to find the longest plateau
        for (int i = 1; i < n; i++) 
        {
            if (a[i] == a[i - 1])
            {currentLength++;} 
            else 
            {
                if (currentLength > maxLength) 
                {
                    maxLength = currentLength;
                    maxPlateauBegins = currentPlateauBegins;
                }
                currentPlateauBegins = i;
                currentLength = 1;
            }
        }

        // Check the last plateau
        if (currentLength > maxLength) 
        {
            maxPlateauBegins = currentPlateauBegins;
        }

        // Print the elements of the longest plateau and its indices
        System.out.print("Longest Plateau: ");
        for (int j = maxPlateauBegins; j < maxPlateauBegins + maxLength; j++) 
        {
            System.out.print(a[j] + " ");
        }
        System.out.println("\nStart Index: " + maxPlateauBegins);
        System.out.println("End Index: " + (maxPlateauBegins + maxLength - 1));
    }
}
