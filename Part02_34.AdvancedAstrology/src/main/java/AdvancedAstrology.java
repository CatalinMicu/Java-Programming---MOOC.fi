
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i;
        for (i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        int i;
        int j;
        for (i = 1; i <= number; i++) {
            System.out.print(" ");
            
        }
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        for (int i=1; i<=size; i++) {
            for(int j=1; j<=size-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
       

    public static void christmasTree(int height) {
        int inaltime2 = height - 1;
        
        for (int j = 1; j < height*2; j += 2) {
            printSpaces(inaltime2);
            printStars(j);
            inaltime2--;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
        
  
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
