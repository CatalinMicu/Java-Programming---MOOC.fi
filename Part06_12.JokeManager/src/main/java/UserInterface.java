import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    
    private JokeManager gluma;
    private Scanner scanner;
    
    public UserInterface(JokeManager gluma, Scanner scanner) {
        this.gluma = gluma;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands: \n1 - add a joke \n2 - draw a joke \n3 - list jokes \nX - stop ");
            String input = scanner.nextLine();
            if (input.equals("X")) {
                break;
            } 
            if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String glumaAdaugata = scanner.nextLine();
                gluma.addJoke(glumaAdaugata);
            }
            if (input.equals("2")) {
                System.out.println(gluma.drawJoke());
            }
            if(input.equals("3")) {
                System.out.println("Printing the jokes.");
                gluma.printJokes();
            }
        }
    }
    
    
}
