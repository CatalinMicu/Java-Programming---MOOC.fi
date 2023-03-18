import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionar;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionar) {
        this.scanner = scanner;
        this.dictionar = dictionar;
}
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.println("Word: ");
                String input2 = scanner.nextLine();
                System.out.println("Translation: ");
                String input3 = scanner.nextLine();
                dictionar.add(input2, input3);       
            } else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String input4 = scanner.nextLine();
                if (dictionar.translate(input4) == null) {
                    System.out.println("Word " + input4 + " was not found");
                } else {
                    System.out.println("Translation: " + dictionar.translate(input4));
                }
             
                

                
                
            }
            System.out.println("Unknown command");
        }
    }
    
}