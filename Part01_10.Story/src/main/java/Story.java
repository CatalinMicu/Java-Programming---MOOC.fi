
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String mesaj1 = scanner.nextLine();
        System.out.println("What is their job?");
        String mesaj2 = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + mesaj1 + "," + " who was " + mesaj2 + ".");
        System.out.println("On the way to work, " + mesaj1 + " reflected on life.");
        System.out.println("Perhaps " + mesaj1 + " will not be " + mesaj2 + " forever.");

        // Write your program here

    }
}
