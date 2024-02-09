public class Spirograph 
{
    public static void main(String[] args) 
    {
        double R = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);

        StdDraw.setXscale(-R-r-a, R+r+a);
        StdDraw.setYscale(-R-r-a, R+r+a);

        StdDraw.setPenRadius(0.005);

        for (double t = 0.0; t <= 100; t += 0.01) 
        {
            double x = (R+r)*Math.cos(t) - a*Math.cos((R+r)*t/r);
            double y = (R+r)*Math.sin(t) - a*Math.sin((R+r)*t/r);
            StdDraw.point(x, y);
        }
    }
}
