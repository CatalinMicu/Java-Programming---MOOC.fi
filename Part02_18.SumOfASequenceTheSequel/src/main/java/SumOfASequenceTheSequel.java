
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int suma = 0;
        System.out.println("First number?");
        int interval1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int interval2 = Integer.valueOf(scanner.nextLine());
        
        for (i = interval1; i <= interval2; i++) {
            suma += i;
            
        }
        System.out.println("Thge sum is:" + suma);
        

    }
}
