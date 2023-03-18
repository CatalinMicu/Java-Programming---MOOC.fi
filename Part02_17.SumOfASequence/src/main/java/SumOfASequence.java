
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int i;
        System.out.println("Last number?");
        int numar = Integer.valueOf(scanner.nextLine());
        
        for (i=1; i<=numar; i++ ) {
            suma = suma + i;
        }
        System.out.println("The sum is " + suma);

    }
}
