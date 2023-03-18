
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> arhiva = new ArrayList<>();
        
        while (true) {
            boolean adauga = true;
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item obiect = new Item(identifier, name);
            for (int i = 0; i < arhiva.size(); i++) {
                if (arhiva.get(i).equals(obiect)) {
                    adauga = false;
                }
            }
            if (adauga == true) {
                arhiva.add(obiect);
            }
            
        }
        System.out.println("==Items==");
        for (int i = 0; i < arhiva.size(); i++) {
            System.out.println(arhiva.get(i));
        }
        
    }  
    
}
