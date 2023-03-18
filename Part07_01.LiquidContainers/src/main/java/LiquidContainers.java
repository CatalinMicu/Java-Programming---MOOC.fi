
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int volumFirst = 0;
        int volumSecond = 0;
        int maxim = 100;


        while (true) {
            System.out.println("First: " + volumFirst + "/100");
            System.out.println("Second: " + volumSecond + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
         
            if (command.equals("add")) {
                if (amount <= 0 ) {
                    volumFirst = volumFirst;
                }
                else if (volumFirst + amount <= maxim) {
                    volumFirst = volumFirst + amount;
                }
                
                else if (volumFirst + amount >= maxim) {
                    volumFirst = 100;
                }
            } else if (command.equals("move")) {
                if (amount <= 0) {
                    volumSecond = volumSecond;
                }
                else if (amount <= volumFirst) {
                    volumFirst = volumFirst - amount;
                    volumSecond = volumSecond + amount;
                }
                else if (amount >= volumFirst) {
                    volumSecond = volumFirst;
                    volumFirst = 0;
                } 
                if (volumSecond > maxim) {
                    volumSecond = maxim;
                }
            } else if (command.equals("remove")) {
                if (amount <= 0) {
                    volumSecond = volumSecond;
                }
                else if (amount <= volumSecond) {
                    volumSecond = volumSecond - amount;
                }
                else if (amount >= volumSecond) {
                    volumSecond = 0;
                }
        }
            

        }
    }

}
