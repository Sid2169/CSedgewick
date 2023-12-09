public class Checksum
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int sum = 0;

        for(int i=2; i<=10; i++)
        {
            sum = sum + i*(n%10);
            n = n/10;
        }
        
        int rightMostDigit= 11-(sum%11);
        if(rightMostDigit<10)
        {
            System.out.println("Right most digit is "+rightMostDigit);
            System.out.println("The full ISBN number is "+args[0]+""+rightMostDigit);
        }
        else if(rightMostDigit==10)
        {
            
            System.out.println("Right most digit is X");
            System.out.println("The full ISBN number is "+args[0]+"X");
        } 
        else
        {
            System.out.println("Right most digit is 0");
            System.out.println("The full ISBN number is "+args[0]+"0");
        }
    }
}