
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int numar1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int numar2 = Integer.valueOf(scanner.nextLine());
        int suma = numar1 * numar2;
        System.out.println(numar1 + " * " + numar2 + " = " + suma);

        // Write your program here

    }
}
