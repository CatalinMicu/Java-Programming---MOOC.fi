
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
            String[] bucati = input.split(" ");
            int i = 0;
            System.out.println(bucati[i]);
            if (input.equals("")) {
                break;
            }
        }


    }
}
