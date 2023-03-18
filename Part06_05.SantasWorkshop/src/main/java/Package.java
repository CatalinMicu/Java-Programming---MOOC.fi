import java.util.ArrayList;
import java.util.Objects;

public class Package {
    private ArrayList<Gift> lista; 
    
    public Package() {
        this.lista = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        lista.add(gift);
    }
    
    public int totalWeight() {
        int greutate = 0;
        for (int i = 0; i < lista.size(); i++) {
            greutate = greutate + lista.get(i).getWeight();
        }
        return greutate;
    }
    
}
