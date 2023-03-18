/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CiCi
 */
public class Item {
    private String identifier;
    private String nume;
    
    public Item(String identifier, String nume) {
        this.identifier = identifier;
        this.nume = nume;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item itemcomparat = (Item) compared;
        
        if (this.identifier.equals(itemcomparat.identifier)) {
            return true;
        }  
        return false;
    }
    
    public String toString() {
        return this.identifier + ": " + this.nume;
    }
    
}
