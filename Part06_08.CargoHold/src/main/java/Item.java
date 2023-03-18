import java.util.ArrayList;



public class Item {
    private String nume;
    private int greutate;
    
    public Item(String nume, int greutate) {
        this.nume = nume;
        this.greutate = greutate;
    }
    
    public String getName() {
        return this.nume;
    }
    
    public int getWeight() {
        return this.greutate;
    }
    
    public String toString() {
        return this.nume + " (" + this.greutate + " kg)";
    }
    
    
}
