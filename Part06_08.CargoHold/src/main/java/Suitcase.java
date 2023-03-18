import java.util.ArrayList;


public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maximumWeight;
    
    public Suitcase(int greutate) {
        this.maximumWeight = greutate;
        this.items = new ArrayList<>();
        
    }
    
    public void addItem(Item item) {
        int suma = 0;
        for (int i = 0; i < items.size(); i++) {
            suma = suma + items.get(i).getWeight();
        }
        if ((suma + item.getWeight()) <= maximumWeight) {
            items.add(item);
        }
        }
    
    public String toString() {
        int suma = 0;
        for (int i = 0; i < items.size(); i++) {
            suma = suma + items.get(i).getWeight();
        }
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return "1 item " + "(" + suma + "kg)";
        }
        return items.size() + " items (" + suma + "kg)";
    }
    
    public void printItems() {
        String printeaza = "";
        for (int i = 0; i < items.size(); i++) {
            printeaza = printeaza + "\n" + items.get(i);
        }
        System.out.print(printeaza);
    }
    
    public int totalWeight() {
        int suma = 0;
        for (int i = 0; i < items.size(); i++) {
            suma = suma + items.get(i).getWeight();
        }
        return suma;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item placeholder = this.items.get(0);
        
        for (int i = 0; i < this.items.size(); i++) {
            if (placeholder.getWeight() < this.items.get(i).getWeight()) {
                placeholder = this.items.get(i);
            }
            
        }
        return placeholder;
       
    }
    }  

