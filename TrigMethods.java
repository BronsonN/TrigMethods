import java.util.*;

public class TrigMethods {

    public static void main (String [] args) {

        // Create a Scanner object attached to the keyboard
        Scanner in = new Scanner (System.in);

        System.out.print ("Enter the # of degrees: ");
        double d = in.nextDouble();

        // convert to radians
        double r = Math.toRadians(d);

        System.out.println ("Sin is " + Math.sin(r));
        System.out.println ("Cos is " + Math.cos(r));
        System.out.println ("Tan is " + Math.tan(r));
    }
}
