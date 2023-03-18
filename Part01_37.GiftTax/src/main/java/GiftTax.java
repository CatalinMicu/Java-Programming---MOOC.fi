
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int valoare = Integer.valueOf(scan.nextLine());
        double taxa = 0;
        
        if (valoare < 5000) {
            System.out.println("No tax!");
        }
        if (valoare ==  5000) {
            System.out.println("Tax: 100.0");
        } else if (valoare > 5000 && valoare < 25000) {
            System.out.println("Tax: " + (100 + (valoare - 5000) * 0.08));
        }       
        if (valoare == 25000) {
            System.out.println("Tax: 1700.0");
        } else if (valoare > 25000 && valoare < 55000) {
            System.out.println("Tax: " + (1700 + (valoare - 25000) * 0.1));
        }
        if (valoare == 55000) {
            System.out.println("Tax: 4700.0");
        } else if (valoare > 55000 && valoare < 200000) {
            System.out.println("Tax " + (4700 + (valoare - 55000) * 0.12));
        }
     
        if (valoare == 200000) {
            System.out.println("Tax: 22 100");
        } else if (valoare > 200000 && valoare < 1000000) {
            System.out.println("Tax: " + (22100 + (valoare - 200000) * 0.15));
        }
     
        if (valoare == 1000000) {
            System.out.println("Tax: 142 100");
        } else if (valoare > 1000000) {
            System.out.println("Tax: " + (142100 + (valoare - 1000000) * 0.17));
        }
       
        
        
        
        
        
        
         

    }
}
