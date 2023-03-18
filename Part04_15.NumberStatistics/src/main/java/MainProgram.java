
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        
        Statistics obiect = new Statistics();
        Statistics obiect2 = new Statistics();
        Statistics obiect3 = new Statistics();
        
        while (true) {
            int numar = Integer.valueOf(scanner.nextLine());
            if (numar == -1) {
                break;
            }
            obiect.addNumber(numar);
            if (numar % 2 == 0) {
                obiect2.addNumber(numar);
            }
            if (numar % 2 !=0 ) {
                obiect3.addNumber(numar);
            }
            
        }
        
        
        
        
        
        System.out.println("Sum: " + obiect.sum());
        System.out.println("Sum of even numbers: " + obiect2.sum());
        System.out.println("Sum of odd numbers: " + obiect3.sum());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
