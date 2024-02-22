public class angle
{
    public static void main(String[] args)
    {
        int h = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        double hour = h + (m/60);

        double angle = Math.abs(6*(5*hour - m));

        if(angle <= 360) System.out.println("The minimum angle between two hands of the clock will be   " + angle);
        else System.out.println("The minimum angle between the hands of the clock will be " + (360 - angle)); 

        


    }
}