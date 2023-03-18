
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int suma = 0;
        int count = 0;
        int comparator = 0;
        int index = 0;
        
       
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] bucati = input.split(",");
            lista.add(bucati[0]);
            int integra = Integer.valueOf(bucati[1]);
            suma = suma + integra;
            count++;
            
        }
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length() > comparator) {
                comparator = lista.get(i).length();
            }
         }
        for (int j = 0; j < lista.size(); j++) {
            if (lista.get(j).length() == comparator) {
                index = j;
                break;
            }
        }
        
        System.out.println("Longest name: " + lista.get(index));
        System.out.println("Average of the birth years: " + (1.0 * suma / count));
                                    
             
        }
    
  
    }


