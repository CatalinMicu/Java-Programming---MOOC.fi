
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try (Scanner scanner2 = new Scanner(Paths.get(input))) {
            while (scanner2.hasNextLine()) {
                String row = scanner2.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
