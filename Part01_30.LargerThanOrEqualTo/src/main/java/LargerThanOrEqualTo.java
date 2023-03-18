
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number");
        int numar1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number");
        int numar2 = Integer.valueOf(scan.nextLine());
        
        if (numar1 > numar2) {
            System.out.println("Greater number is: " + numar1);
        } else if (numar2 > numar1) {
            System.out.println("Greater number is: " + numar2);
        } else if (numar1 == numar2) {
            System.out.println("The numbers are equal!");
        }
        
        

    }
}
