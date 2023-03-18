
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0;
        
        try (Scanner scanner2 = new Scanner (Paths.get(file))) {
            while(scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                int conversie = Integer.valueOf(line);
                if (conversie >= lowerBound && conversie <= upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            
        }
        
        System.out.println("Numbers: " + count);

    }

}
