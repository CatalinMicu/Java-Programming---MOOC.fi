
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int puncte = Integer.valueOf(scan.nextLine());
        if (puncte < 0) {
            System.out.println("impossible!");
        } else if (puncte <=49) {
            System.out.println("failed");
        } else if (puncte <=59) {
            System.out.println("1");
        } else if (puncte <=69) {
            System.out.println("2");
        } else if (puncte <=79) {
            System.out.println("3");
        } else if (puncte <=89) {
            System.out.println("4");
        } else if (puncte <=100) {
            System.out.println("5");
        } else if (puncte >=100) {
            System.out.println("incredible!");
        }
       
        

    }
}
