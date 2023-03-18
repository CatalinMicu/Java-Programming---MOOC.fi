
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetari = -1;
        
        while (true) {
            System.out.println("Give a number:");
            int numar = Integer.valueOf(scanner.nextLine());
            repetari = repetari +1;
            if (numar == 0) {
                break;
            }
            continue;
            
            
            
        }
        System.out.println("Number of numbers: " + repetari);
        
        

    }
}
