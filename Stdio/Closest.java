public class Closest
{
    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        double xC = StdIn.readDouble();
        double yC = StdIn.readDouble();
        double zC = StdIn.readDouble();

        double distance = Math.pow((x-xC), 2) + Math.pow((y-yC), 2)+ Math.pow((z-zC), 2);

        while(!StdIn.isEmpty())
        {
            double xI = StdIn.readDouble();
            double yI = StdIn.readDouble();
            double zI = StdIn.readDouble();

            if(distance > Math.pow((x-xI), 2) + Math.pow((y-yI), 2)+ Math.pow((z-zI), 2))
            {
                distance = Math.pow((x-xI), 2) + Math.pow((y-yI), 2)+ Math.pow((z-zI), 2);
                xC = xI; yC = yI; zC = zI;
            }
        }  
        StdOut.printf(" The closest point is %1.3f %1.3f %1.3f",xC , yC , zC);
    }
}