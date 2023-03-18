
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String numnar = String.valueOf(elements.size());
        String printeaza = "";
        for (String characters: elements) {
           printeaza = printeaza + "\n" + characters;
        }
       
        if (elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        }
        if (elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:" + printeaza;
        }
        return "The collection " + this.name + " has " + numnar + " elements:" + printeaza;
    }
}
