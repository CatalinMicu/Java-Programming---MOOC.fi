
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        while (true) {
            System.out.println("Give a number:");
            int numar = Integer.valueOf(scanner.nextLine());
            suma = suma + numar;
            if (numar == 0) {
                break;
            }
            continue;
            
            
            
        }
        System.out.println("Sum of the numbers: " + suma);
        

    }
}
