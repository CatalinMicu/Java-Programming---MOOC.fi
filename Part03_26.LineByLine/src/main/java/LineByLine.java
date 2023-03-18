
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            String[] bucatele = input.split(" ");
            for (int i = 0; i < bucatele.length; i++) {
                System.out.println(bucatele[i]);
            }
            if (input.equals("")) {
                break;
            }
        }
        
        


    }
}
