
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        int cautat = Integer.valueOf(scanner.nextLine());
        int cautator = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == cautat) {
                System.out.println(cautat + " is at index " + i);
            }
        }
        

        // implement here finding the indices of a number
    }
}