
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int suma = 0;
        for (int i = 0; i < list.size(); i++) {
            suma = list.get(i) + suma;
        }

        System.out.println("Sum:" + suma);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
