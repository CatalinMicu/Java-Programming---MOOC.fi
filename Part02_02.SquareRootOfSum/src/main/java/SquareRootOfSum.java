
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numar = Integer.valueOf(scanner.nextLine());
        int numar2 = Integer.valueOf(scanner.nextLine());
        double radacina = Math.sqrt(numar + numar2);
        System.out.println(radacina);
        
        

    }
}
