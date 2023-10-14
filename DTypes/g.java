public class g
{
    public static void main(String[] args)
    {
       
        Double G = 0.0000000000667408;
        Double planetMass = Double.parseDouble(args[0]);
        Double r = Double.parseDouble(args[1]);
        Double g = (G * planetMass) / (r * r);
        System.out.println("Gravitational accelaration on the surface of the celestial body is "+g+"m/s^2");
    }
}