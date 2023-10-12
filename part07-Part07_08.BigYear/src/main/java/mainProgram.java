
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        cartePasari carte = new cartePasari(scan);
        
        while (true) {
            System.out.println("?");
            String input = scan.nextLine();
            
            switch(input) {
                case "Add" :
                    carte.Add();
                    break;
                    
                case "Observation" :
                    System.out.println("Bird?");
                    String observatie = scan.nextLine();
                    boolean gasit = false;
                    for (Bird b : carte.carte()) {
                        if (b.getNume().equals(observatie)) {
                            b.addObservatie();
                            gasit = true;
                            break;
                        }
                        
                    }
                    if (!gasit) {
                        System.out.println("Not a bird!");
                        break;
                    }
                    break;
                case "All" :
                    carte.All();
                    break;
                case "One" :
                    System.out.println("Bird?");
                    String inputOne = scan.nextLine();
                    carte.printOne(inputOne);
                    break;
                case "Quit" :
                    return;
            }
     
    }

}
}
