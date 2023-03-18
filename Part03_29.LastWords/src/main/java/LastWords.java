
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String sfoara = scanner.nextLine();
            String[] bucatele = sfoara.split(" ");
            System.out.println(bucatele[bucatele.length-1]);
          
          
            if (sfoara.equals("")) {
                break;
            }
        }



    }
}
