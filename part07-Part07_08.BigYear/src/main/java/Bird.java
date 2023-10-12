import java.util.*;


public class Bird {
    private String nume;
    private String numeLatina;
    private int observatii;
    
    public Bird(String nume, String numeLatina) {
        this.nume = nume;
        this.numeLatina = numeLatina;
        this.observatii = 0;
    }
    
    public void addObservatie() {
        observatii++;
    }
    
    public String getNume() {
        return this.nume;
    }
    
    public String getNumeLatina() {
        return this.numeLatina;
    }
    
    
    
 @Override
 
 public String toString() {
    return nume + " (" + numeLatina +"):" + observatii + " observations";
 }
    
}
