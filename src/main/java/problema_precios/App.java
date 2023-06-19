// Import libraries
package problema_precios;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * Main funtion
     * @param args
     */
    public static void main( String[] args )
    {
        // Define variables
        Scanner input = new Scanner(System.in);
        float price;

        // Get user data
        System.out.println("-------------------------------------------------------");
        System.out.println("| Digite precio de la carne");
        System.out.println("-------------------------------------------------------");
        price = input.nextInt();

        // Print
        System.out.println("-------------------------------------------------------");
        System.out.println("| El precio de la carne a las 9:00 am fue: " + priceAtMorning(price));
        System.out.println("| El precio de la carne a las 1:00 pm fue: " + priceAtAfternoon(price));
        System.out.println("-------------------------------------------------------");
    }


    /**
     * Funtion to calculate price in the afternoon
     * @param price
     * @return float
     */
    private static float priceAtAfternoon(float price) {
        /**
        * price = 100%
        * x     = 90%
        * x = (price * 90) / 100
        */

        // Define variable
        float price90Percent = (price * 90) / 100;

        // Return
        return price90Percent;
    }


    /**
     * Funtion to calculate price in the morning
     * @param price
     * @return float
     */
    private static float priceAtMorning(float price) {
        /**
        * price = 110%
        * x     = 100%
        * x = (price * 100) / 110
        */

        // Define variable
        float price100Percent = (price * 100) / 110;

        // Return
        return price100Percent;
    }
}
