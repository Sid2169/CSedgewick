/*


1.5.22 Write a program that takes a string command-line argument s and displays it in banner style on the screen, moving from left to right and wrapping back to the beginning of the string as the end is reached. Add a second command-line argument to control the speed.
 */
import java.awt.Font;

public class Banner22 
{

    public static void main(String[] args) 
    {
        String s = args[0];

        // set the font
        Font font = new Font("Arial", Font.BOLD, 60);
        StdDraw.setFont(font);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.enableDoubleBuffering();


        for (double i = 0.0; true; i += 0.01) 
        {
            StdDraw.clear(StdDraw.BLACK);
            StdDraw.text((i % 1.0),       0.5, s);
            StdDraw.text((i % 1.0) - 1.0, 0.5, s);
            StdDraw.text((i % 1.0) + 1.0, 0.5, s);
            StdDraw.pause(60);
            StdDraw.show();
        }

    }

}
