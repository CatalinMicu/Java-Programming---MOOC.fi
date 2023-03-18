import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Books> raft = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Title:");
            String titlu = scanner.nextLine();
            if (titlu.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pagini = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int anPub = Integer.valueOf(scanner.nextLine());
            raft.add(new Books(titlu, pagini, anPub));
        }
        
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        
  
        for (int i = 0; i < raft.size(); i++) {
            if (input.equals("everything")) {
                System.out.println(raft.get(i).toString());        
            }
            if (input.equals("name")) {
                System.out.println(raft.get(i).getTitlu());
            }
        }
              
 
    }
}
