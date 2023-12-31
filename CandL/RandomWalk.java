public class RandomWalk
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int timeCounter = 0;

        while (-2*n<x && x<2*n && -2*n<y && y<2*n)
        {
           double directionChange = Math.random();
                 if(directionChange<1.0/4.0) {x+=1;}
            else if(directionChange<2.0/4.0) {x-=1;}
            else if(directionChange<3.0/4.0) {y+=1;}
                                        else {y-=1;}

            timeCounter+=1;    
            System.out.println(x + " " + y);                  
    
        }
        System.out.println(timeCounter + " Units times is the extimated time it will take to reach any one edge of the square");
    }    
}