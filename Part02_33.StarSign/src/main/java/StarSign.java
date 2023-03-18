public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int i;
        for (i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        // first part of the exercise
    }

    public static void printSquare(int size) {
        int i;
        int j;
        for (j = 1; j <= size; j++) {
            for (i = 1; i <= size; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        // second part of the exercise
    }

    public static void printRectangle(int width, int height) {
        int i;
        int j;
        for (j=1; j<= height; j++) {
            for (i=1; i<= width; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // third part of the exercise
    }

    public static void printTriangle(int size) {
        int i;
        int j;
        for (i = 0; i<size; i++) {
            for (j= 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }
        // fourth part of the exercise
    }
}
