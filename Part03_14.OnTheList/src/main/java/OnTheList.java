
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String nume = scanner.nextLine();
        boolean adv = false;
        
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(nume)) {
                System.out.println(nume + " was found!");
                adv = true;
            }
        } 
        
        if (adv != true) {
            System.out.println(nume + " was not found!");
        }
        
       
        

    }
}
