
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int counter = 0;
        int win = 0;
        int loss = 0;
        
        ArrayList<String> lista = new ArrayList<String>();
        
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                String [] bucati = line.split(",");
                String home = bucati[0];
                String visiting = bucati[1];
                int ht = Integer.valueOf(bucati[2]);
                int vt = Integer.valueOf(bucati[3]);
                
                
                
                if (bucati[0].matches(team) ||  bucati[1].matches(team)) {
                    counter++;       
                    
                   if (bucati[0].matches(team)) {
                       if (ht > vt) {
                           win++;
                       } else {
                           loss++;
                       }
                   } 
                   
                   if (bucati[1].matches(team)) {
                       if (vt > ht) {
                           win++;
                       } else {
                           loss++;
                       }
                   }
            }
                
                
                
                
            
            }
             
        } catch (Exception e) {
        
    }
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
        

    }

}
