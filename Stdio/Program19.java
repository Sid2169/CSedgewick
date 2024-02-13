/*
1.5.19 Write a program that takes as command-line arguments an integer n and a floating-point number p (between 0 and 1), plots n equally spaced points on the circumference of a circle, and then, with probability p for each pair of points, draws a gray line connecting them. */

public class Program19 
{
   public static void main(String[] args) 
   {
       int n = Integer.parseInt(args[0]);
       double p = Double.parseDouble(args[1]);
       double[][] points = new double[n][2];

       StdDraw.setCanvasSize(800, 800);
       StdDraw.setScale(-1.0, 1.0);
       StdDraw.setPenRadius(.015);

       for (int i = 0; i < n; i++) 
       {
           points[i][0] = Math.cos(2 * Math.PI * i / n);
           points[i][1] = Math.sin(2 * Math.PI * i / n);
           StdDraw.point(points[i][0], points[i][1]);
       }

       StdDraw.setPenRadius();

       for (int i = 0; i < n; i++) 
       {
           for (int j = 0; j < n; j++) 
           {
               if (Math.random() < p) 
               {
                   StdDraw.line(points[i][0], points[i][1], points[j][0], points[j][1]);
               }
           }
       }
   }
}