import java.util.*;

public class Reteta {
    private String nume;
    private int timp;
    private ArrayList<String> ingrediente;
    
    public Reteta(String nume, int timp, ArrayList<String> ingrediente) {
        this.nume = nume;
        this.timp = timp;
        this.ingrediente = ingrediente;
    }
    
    public String getNume() {
        return nume;
    }
    
    public int getTimp() {
        return timp;
    }
    
    public ArrayList<String> getIngrediente() {
        return ingrediente;
    }
    
    @Override
    public String toString() {
        return nume + ", cooking time: " + timp;
    }
}
