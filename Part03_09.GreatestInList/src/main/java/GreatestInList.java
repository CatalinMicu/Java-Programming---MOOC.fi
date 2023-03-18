
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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
        
        int pivot = list.get(0);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > pivot) {
                pivot = list.get(i);
            }
        }
        
        System.out.println("The greatest number: " + pivot);
        
        

        // implement finding the greatest number in the list here
    }
}
