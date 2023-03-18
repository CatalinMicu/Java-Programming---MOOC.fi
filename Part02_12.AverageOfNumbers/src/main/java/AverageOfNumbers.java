
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double repetari = -1;
        double suma = 0;
        double average = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int numar = Integer.valueOf(scanner.nextLine());
            suma = suma + numar;
            repetari = repetari + 1;
            
            if (numar == 0) {
                break;
            }
        }
        average = suma/repetari;
        System.out.println("Average of the numbers: " + average);

    }
}
