
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> lista = new ArrayList<>();
         
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            lista.add(input);
        }
        
        int cautator = lista.get(0);
        int nrgasit = 0;
        int index = 0;
        int pivot = lista.get(0);
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > pivot) {
                pivot = lista.get(i);
            }
        }
        
        for (int i = 0; i < lista.size(); i++) {
            if (pivot > lista.get(i) ) {
                pivot = lista.get(i);
                nrgasit = pivot;
            }
            if (lista.get(i) == pivot) {
                index = i;
            }
            
        }
        
        
        System.out.println("Smallest number: " + nrgasit);
        
        for (int i = 0; i < lista.size(); i ++) {
            if (lista.get(i) == nrgasit) {
                System.out.println("Found at index: " + i);
            }
        }

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
