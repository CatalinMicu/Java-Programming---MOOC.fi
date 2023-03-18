
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comparator = 0;
        
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] bucati = input.split(",");
            int integra = Integer.valueOf(bucati[1]);
            if (integra > comparator) {
                comparator  = integra;
            }
            String gigabrain =  String.valueOf(comparator);
            if (input.contains(gigabrain)) {
                System.out.println(bucati[0]);
            }
        }
        

    }
}
