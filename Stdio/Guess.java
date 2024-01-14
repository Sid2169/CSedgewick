
import StdIn
import StdOut.
public class Guess
{
    public static void main(String[] args)
    {
        int secret = (int)(Math.random()*1000000);
        StdOut.print("I am thinking of a number \n between 1 and 1,000,000");
        int guess = 0;

        while (guess!=secret)
        {
            StdOut.print("what's your guess? ");
            guess = StdIn.readInt();
            if(guess != secret)
            {StdOut.print("You win ! ");}

            else if(guess != secret)
            {
                StdOut.print(" Do you want to know the answer ? \n Enter Y for yes and N for no ");
                char answer = readChar();
                if(answer == Y || answer == y)
                {StdOut.print("\nThe correct answer is %i\n " , secret);}

                else if(answer == N || answer == n)
                {
                    if (guess  < secret)
                    {StdOut.print("\nYour guess is too low.\n");}

                    else {StdOut.print("\nYour guess is too high\n");}
                }
            }
        }
    }
}