
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numar = Integer.valueOf(scanner.nextLine());
        int numar2 = Integer.valueOf(scanner.nextLine());
        
        if (numar > numar2) {
            System.out.println(numar + " is greater than " + numar2 + ".");
        } else if (numar2 > numar) {
            System.out.println(numar + " is smaller than " + numar2 + ".");
        } 
        
        if (numar == numar2) {
            System.out.println(numar + " is equal to " + numar2 + "." );
        }

    }
}
