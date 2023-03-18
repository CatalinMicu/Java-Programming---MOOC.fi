
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String atisoara = scan.nextLine();
        System.out.println("Give an integer:");
        int integr = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double dublu = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean buleana = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + atisoara);
        System.out.println("You gave the integer " + integr);
        System.out.println("You gave the double " + dublu);
        System.out.println("You gave the boolean " + buleana );
        
        
        
        
        
        

        // Write your program here

    }
}
