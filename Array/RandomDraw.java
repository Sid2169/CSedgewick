public class RandomDraw
{
    public static void main(String[] args)
    {
        String[] SUITS = {"Clubs" , "Diamonds" , "Hearts" , "Clubs"};
        String[] RANK = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" ,
                            "Jack" , "Queen" , "King" , "Ace" };
        int i = (int) (Math.random()*RANK.length);
        int j = (int) (Math.random()*SUITS.length);

        System.out.println(RANK[i] + " of " + SUITS[j]);                    
    }
}