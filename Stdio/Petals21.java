/*
1.5.21 Write a program that takes an integer command-line argument n and plots a rose with n petals (if n is odd) or 2n petals (if n is even), by plotting the polar coordinates (r, θ) of the function r = sin(n θ) for θ ranging from 0 to 2π radians.
 */
public class Petals21 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);  // number of petals
        int N = 1000;                       // number of line segments
        StdDraw.setXscale(-1, +1);
        StdDraw.setYscale(-1, +1);

        double[] x = new double[N+1];
        double[] y = new double[N+1];
        for (int i = 0; i <= N; i++) 
        {
            double theta = 2 * Math.PI * i / N;
            x[i] = Math.sin(n * theta) * Math.cos(theta);
            y[i] = Math.sin(n * theta) * Math.sin(theta);
        }

        StdDraw.filledPolygon(x, y);
    }
}