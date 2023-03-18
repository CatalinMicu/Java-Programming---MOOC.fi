
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int repetari = -1;
        while (true) {
            System.out.println("Give a number: " );
            int numar = Integer.valueOf(scanner.nextLine());
            suma = suma + numar;
            repetari = repetari +1;
            if (numar == 0) {
                break;
            }
            continue;
                                
            
            
        }
        System.out.println("Number of numbers: " + repetari);
        System.out.println("Sum of the numbers: " + suma);

    }
}
