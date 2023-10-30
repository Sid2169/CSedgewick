public class diceRoll
{
    public static void main(String[] args)
    {
        double c = Math.random();
        double d = Math.random();

        System.out.println((int)((1+c*5)+(1+d*5)));
    }
}