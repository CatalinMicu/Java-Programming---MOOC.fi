
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comparator = 0;
        
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] bucati = input.split(",");
            System.out.println(bucati[1]);
            int integra = Integer.valueOf(bucati[1]);
            if (integra > comparator) {
                comparator  = integra;
            }
            String gigabrain =  String.valueOf(comparator);
            if (input.contains(gigabrain)) {
                System.out.println(bucati[0]);
            }
        }
        
        System.out.println(comparator);


    }
}
