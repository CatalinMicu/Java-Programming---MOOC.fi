
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean gasit = false;
        
        try (Scanner scanner2 = new Scanner (Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                String linie = scanner2.nextLine();
                if (linie.equals(searchedFor)) {
                    System.out.println("Found!");
                    gasit = true;
                    break;
                }
            } 
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        if (gasit == false) {
            System.out.println("Not found.");
        }
        

    }
}
