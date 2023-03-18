
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        
        System.out.println("Where to?");
        System.out.println("Where from?");
        int destinatie = Integer.valueOf(scanner.nextLine());
        int inceput  = Integer.valueOf(scanner.nextLine());
        for (i=inceput ; i<= destinatie; i++) {
            System.out.println(i);
        }

        // Write your program here
    }
}
