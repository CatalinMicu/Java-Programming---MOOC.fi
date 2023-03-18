import java.util.Scanner;


public class UserInterface {
    private TodoList lista;
    private Scanner scanner;
    
    public UserInterface(TodoList lista, Scanner scanner) {
        this.lista = lista;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String comanda = scanner.nextLine();
            if (comanda.equals("stop")) {
                break;
            }
            if (comanda.equals("add")) {
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                this.lista.add(toAdd);
            }
            if (comanda.equals("list")) {
                this.lista.print();
            }
            if(comanda.equals("remove")) {
                System.out.println("Which one is removed?");
                String remove = scanner.nextLine();
                int valoare = Integer.valueOf(remove);
                this.lista.remove(valoare);
            }
            
        }
    }
    
}
