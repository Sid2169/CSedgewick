public class kary
{
    public static void main(String[] args)
    {
        int i = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        int k_to_n = 1;
        while( k_to_n <= i/k) {k_to_n*= k;}

        while(k_to_n>=1)
        {
            int digit = i/k_to_n;
            
            if(digit<=10) {System.out.print(digit);}
            else if(digit==11) {System.out.print('A');}
             else if(digit==12) {System.out.print('B');}
              else if(digit==13) {System.out.print('C');}
               else if(digit==14) {System.out.print('D');}
                else if(digit==15) {System.out.print('E');}
                else {System.out.print('F');}
            
            i = i%k_to_n;
            k_to_n/=k;
        }
        System.out.println();
    }
}