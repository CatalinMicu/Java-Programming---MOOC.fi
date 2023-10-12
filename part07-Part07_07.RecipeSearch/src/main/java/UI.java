import java.util.*;

public class UI {
    private Scanner Scanner;
    private CarteRetete carte;
    
    public UI(Scanner scanner, CarteRetete carte) {
        this.Scanner= scanner;
        this.carte = carte;
    }
    
    public static void printUserMenu() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        System.out.print("Enter command: ");
    }
    
    public void start() {
        System.out.println("File to read: ");
        String input = Scanner.nextLine();
        carte.scaneazaRetete(input);
        printUserMenu();
        String input2 = Scanner.nextLine();
        switch (input2) {
            case "list":
                carte.listeazaRetete();
                break;
            case "find name":
                System.out.println("Searched word: ");
                String numeCautat = Scanner.nextLine();
                carte.gasesteNume(numeCautat);
                break;
            case "find cooking time":
                System.out.print("Max cooking time: ");
                int timpMaxim = Scanner.nextInt();
                carte.gasesteTimp(timpMaxim);
                break;
            case "find ingredient":
                System.out.println("Ingredients: ");
                String ingredient = Scanner.nextLine();
                carte.gasesteIngredient(ingredient);
                break;
            case "stop":
                return;
        }
    }

}
