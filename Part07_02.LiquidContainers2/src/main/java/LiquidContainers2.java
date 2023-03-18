
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();
        Scanner scan = new Scanner(System.in);
        UserInterface interfata = new UserInterface(container1, container2, scan);
        
        interfata.start();
        
        
        



    }

}
