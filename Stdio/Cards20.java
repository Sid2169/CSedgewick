/* 


1.5.20 Write code to draw hearts, spades, clubs, and diamonds. To draw a heart, draw a filled diamond, then attach two filled semicircles to the upper left and upper right sides.
*/
public class Cards20
{
    public static void main(String[] args)
    {
         // Set up the canvas
         StdDraw.setYscale(-1.0, 1.0);

         // Draw a heart
         StdDraw.setPenColor(StdDraw.RED);
         StdDraw.filledCircle(-0.5, 0.5, 0.5);
         StdDraw.filledCircle(0.5, 0.5, 0.5);
         double[] xsHeart = {-1.0, 0.0, 1.0};
         double[] ysHeart = {0.0, -1.0, 0.0};
         StdDraw.filledPolygon(xsHeart, ysHeart);
 
         // Draw a diamond
         StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
         double[] xsDiamond = {-0.5, 0.0, 0.5, 0.0};
         double[] ysDiamond = {0.0, 0.5, 0.0, -0.5};
         StdDraw.filledPolygon(xsDiamond, ysDiamond);
 
         // Draw a club
         StdDraw.setPenColor(StdDraw.GREEN);
         StdDraw.filledCircle(-0.3, -0.3, 0.2);
         StdDraw.filledCircle(0.0, -0.1, 0.2);
         StdDraw.filledCircle(0.3, -0.3, 0.2);
         StdDraw.filledRectangle(0.0, -0.5, 0.1, 0.2);
 
         // Draw a spade
         StdDraw.setPenColor(StdDraw.BLACK);
         StdDraw.filledCircle(-0.5, -0.8, 0.5);
         StdDraw.filledCircle(0.5, -0.8, 0.5);
         double[] xsSpade = {-1.0, 0.0, 1.0};
         double[] ysSpade = {-0.8, -1.8, -0.8};
         StdDraw.filledPolygon(xsSpade, ysSpade);
    }
}