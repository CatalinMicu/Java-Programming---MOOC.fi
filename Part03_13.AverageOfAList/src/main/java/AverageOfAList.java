
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            lista.add(input);
        }
        
        double suma = 0;
        
        for (int i = 0; i < lista.size(); i++) {
            suma = lista.get(i) + suma;
        }
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        double average = suma/lista.size();
        System.out.println("Average: " + average);
    }
}
