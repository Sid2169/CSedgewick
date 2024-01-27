public class Guess
{
    public static void main(String[] args)
    {
        int secret = (int)(Math.random()*1000000);
        StdOut.print("I am thinking of a number \n between 1 and 1,000,000");
        int guess = 0;
        int answer;

        while (guess!=secret)
        {
            StdOut.print("\nwhat's your guess? ");
            guess = StdIn.readInt();
            if(guess == secret)
            {StdOut.print("You win ! ");}

            else if(guess != secret)
            {
                StdOut.print("Oops! Incorrect :)\nDo you want to know the answer ? \nEnter 1 for yes and 0 for no ");
                answer = StdIn.readInt();
                
                if(answer == 1)
                {StdOut.print("\nThe correct answer is " + secret + "\n"); break;}

                else if(answer == 0)
                {
                    if (guess  < secret)
                    {StdOut.print("\nYour guess is too low.\n");}

                    else {StdOut.print("\nYour guess is too high\n");}
                }
            }
        }
    }
}