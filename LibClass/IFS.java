package LibClass;

public class IFS {
    public static void main(String[] args) {

        if (args.length < 4)
        {
            throw new IllegalArgumentException
            ("Compilation : navigate to root directory (CSedgewick), use this commnad 'javac LibClass/IFS.java'\nExecution : java LibClass/IFS iterations r g b < *.txt\n");
        }
        
        // number of iterations
        int trials = Integer.parseInt(args[0]);

        //Take rgb values as command line arguments
        int red = Integer.parseInt(args[1]);
        int green = Integer.parseInt(args[2]);
        int blue = Integer.parseInt(args[3]);

        // probability distribution for choosing each rule
        double[] dist = StdArrayIO.readDouble1D();

        // update matrices
        double[][] cx = StdArrayIO.readDouble2D();
        double[][] cy = StdArrayIO.readDouble2D();

        // current value of (x, y)
        double x = 0.0, y = 0.0;

        // do trials iterations of the chaos game
        StdDraw.enableDoubleBuffering();
        for (int t = 0; t < trials; t++) {

            // pick a random rule according to the probability distribution
            int r = StdRandom.discrete(dist);

            // do the update
            double x0 = cx[r][0]*x + cx[r][1]*y + cx[r][2];
            double y0 = cy[r][0]*x + cy[r][1]*y + cy[r][2];
            x = x0;
            y = y0;

            // draw the resulting point
            StdDraw.setPenColor(red, green, blue);
            StdDraw.point(x, y);

            // for efficiency, display only every 100 iterations
            if (t % 100 == 0) {
                StdDraw.show();
                StdDraw.pause(10);
            }
        }

        // ensure everything gets drawn
        StdDraw.show();
    }
}
