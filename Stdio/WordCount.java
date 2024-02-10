public class WordCount
{
    public static void main(String[] args)
    {
        int wordCount = 0;
        while(!StdIn.isEmpty())
        {
            StdIn.readString();
            wordCount++;
        }
        StdOut.println(wordCount);
    }
}