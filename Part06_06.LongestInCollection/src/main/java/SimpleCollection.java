
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
    
    public String longest() {
        int marime = 0;
        if (this.elements.isEmpty()) {
            return null;
        }
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).length() > marime) {
                marime = elements.get(i).length();
            }
        }
        for (int i = 0; i < elements.size(); i++) {
            if (marime == elements.get(i).length()) {
                return elements.get(i);
            }
        }
        return "cf";
    
    }

}
