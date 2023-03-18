import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int duratie3;
        
        while(true) {
            System.out.println("Name:");
            String nume = scanner.nextLine();
            if (nume.isEmpty()) {
                break;
            }
            System.out.println("Duration");
            Integer duratie = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(nume, duratie));
        }
        
        System.out.println("Program's maximum duration?");
        Integer duratie2 = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < programs.size(); i++) {
            if (duratie2 == programs.get(i).getDuration()) {
                System.out.println(programs.get(i));
            
        }
        }
        
        
        
            

    }
}
