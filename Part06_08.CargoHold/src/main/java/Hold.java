import java.util.ArrayList;


public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> lista = new ArrayList<>();
    
    public Hold(int maxim) {
        this.maximumWeight = maxim;
        this.lista = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int greutateTotala = 0;
        for (int i = 0; i < lista.size(); i++) {
            greutateTotala = greutateTotala + lista.get(i).totalWeight();
        }
        
        if (greutateTotala + suitcase.totalWeight() <= maximumWeight) {
            lista.add(suitcase);
        }
    }
    
    public String toString() {
        int greutate = 0;
        for (int i = 0; i < lista.size(); i++) {
            greutate = greutate + lista.get(i).totalWeight();
        }
        return lista.size() + " suitcases (" + greutate + " kg)"; 
    }
    
    public void printItems() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).printItems();
        }
    }
}
