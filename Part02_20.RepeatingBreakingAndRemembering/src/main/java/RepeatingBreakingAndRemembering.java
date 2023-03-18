
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        int suma = 0;
        double suma2;
        int i;
        int numardenumere=0;
        double average;
        int even = 0;
        int odd = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        while (true) {
            int numar = Integer.valueOf(scanner.nextLine());
            
            if (numar == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            if (numar % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            
            numardenumere++;
            suma += numar;
            
            
            
        }
        suma2 = suma;
        average = suma2/numardenumere;
        System.out.println("Sum: " + suma);
        System.out.println("Numbers: " + numardenumere);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        

    }
}
