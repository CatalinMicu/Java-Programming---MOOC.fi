
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarteRetete carteRetete = new CarteRetete();
        UI ui = new UI(scanner, carteRetete);
        ui.start();

    }
    



}
