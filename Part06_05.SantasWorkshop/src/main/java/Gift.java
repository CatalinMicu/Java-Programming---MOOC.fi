/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CiCi
 */
import java.util.Objects;
public class Gift {
    private String nume;
    private int greutate;
    
    public Gift(String nume, int greutate) {
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
        return getName() + "(" + greutate + " kg" + ")";
    }
    
}
