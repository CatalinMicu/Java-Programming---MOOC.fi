
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int factorial = 1   ;
        System.out.println("Give a number:");
        int numar = Integer.valueOf(scanner.nextLine());
        for (i=1; i <= numar; i++) {
            factorial *= i; 
        }
        System.out.println("Factorial: " +factorial);

    }
}
