public class cracker
{
    public static void main(String[] args) 
    {
        
        if (args.length >= 2) 
        {
            String word1 = args[0];
            String word2 = args[1];

        
            boolean result = word1.charAt(0) == word2.charAt(0) ||
                             word1.charAt(0) == word2.charAt(0) + 32 || 
                             word1.charAt(0) + 32 == word2.charAt(0);

            if (result == true)
            {
                System.out.println("First letter of both words are same");
            }
            else 
            {
                System.out.println("First letter of both words are different");
            }
        } 
        else 
        {
            System.out.println("Provide atleast two words");
        }
    }
}