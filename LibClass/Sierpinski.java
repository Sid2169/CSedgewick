package LibClass;

public class Sierpinski
{
    public static void main(String[] args)
    {
        double[] verticesX = {0.0, 1.0, 0.5};
        double[] verticesY = {0.05, 0.05, 0.916};

        double currentPointX = 0.0;
        double currentPointY = 0.05;
        StdDraw.point(currentPointX, currentPointY);

        for (int i = 0; i < 10000; i++)
        {
            int nextVertexIndex = (int)(Math.random() * 2 + 0.5);
            currentPointX = (currentPointX + verticesX[nextVertexIndex]) / 2;
            currentPointY = (currentPointY + verticesY[nextVertexIndex]) / 2;
            StdDraw.point(currentPointX, currentPointY);
        }
    }
}