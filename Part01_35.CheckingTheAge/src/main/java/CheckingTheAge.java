
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int varsta = Integer.valueOf(scan.nextLine());
        if (varsta < 0 || varsta > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }

    }
}
