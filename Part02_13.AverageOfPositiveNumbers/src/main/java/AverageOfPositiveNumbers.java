
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double repetari = 0;
        double suma = 0;
        double average = 0;
        
        while (true) {
            int numar = Integer.valueOf(scanner.nextLine());
            if (numar == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (numar < 0) {
                continue;
            }
            if (numar > 0) {
                repetari = repetari +1;
                suma = suma + numar;
            }
            
            if (numar == 0) {
                break;
            }
            
            
            
        }
        average = suma/repetari;
        System.out.println(average);

    }
}
