
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        
        String input = scanner.nextLine();
        
        try (Scanner scanner2 = new Scanner (Paths.get(input))) {
            while (scanner2.hasNextLine()) {
                String totem = scanner2.nextLine();
                String bucati[] = totem.split(",");
                String nume = bucati[0];
                int varsta = Integer.valueOf(bucati[1]);
                if (varsta > 1) {
                System.out.println(nume + ", age: " + varsta + " years");
            }
                if (varsta == 1) {
                System.out.println(nume + ", age: " + varsta + " year");
            }
                if (varsta == 0) {
                System.out.println(nume + ", age: " + varsta + " years");
            }
                
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        
        

    }
}
