
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numar;
        while (true) {
            System.out.println("Give a number:");
            numar = Integer.valueOf(scanner.nextLine());
            if (numar == 0) {
                break;
            }
            if (numar > 0) {
                System.out.println(numar * numar);
            } else if (numar < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            
        }

    }
}
