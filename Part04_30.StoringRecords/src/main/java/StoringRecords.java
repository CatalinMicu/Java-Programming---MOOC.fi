
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        
        try (Scanner scanner2 = new Scanner (Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                String [] bucati = line.split(",");
                String nume = bucati[0];
                int varsta = Integer.valueOf(bucati[1]);
                persons.add(new Person(nume, varsta));
                
                
            }
        } catch (Exception e) {
            
        }
            
        
            
   

        // Write here the code for reading from file
        // and printing the read records
        return persons;

    }
}
