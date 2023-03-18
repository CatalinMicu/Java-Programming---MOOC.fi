import java.util.Scanner;

public class Container {
    
    private int volum;
    private int maxim;
    
    public Container() {
        this.volum = 0;
        this.maxim = 100;
    }
    
    public int contains() {
        return this.volum;
    }
    
    public void add(int amount) {
        if (amount <= 0) {
            this.volum = this.volum;
        } else if (this.volum + amount >= this.maxim) {
            this.volum = this.maxim;
        } else {
            this.volum = this.volum + amount;
        }   
    }
    
    public void remove(int amount) {
        if (amount <= 0) {
            this.volum = this.volum;
        } else if (this.volum - amount <= 0) {
            this.volum = 0;
        } else {
            this.volum = this.volum - amount;
        }
    }
    
    public String toString() {
        return this.volum + "/" + maxim;
    }
    
}
