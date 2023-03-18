
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(5,9);
        

    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        int i;
        for (i = beginning; i <= end; i++ ) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        
    }

}
