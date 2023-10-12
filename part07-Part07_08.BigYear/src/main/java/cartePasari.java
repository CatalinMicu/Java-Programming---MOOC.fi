import java.util.*;

public class cartePasari {
    private ArrayList<Bird> carte;
    private Scanner scanner;
    
    
    public cartePasari(Scanner scanner) {
        this.carte = new ArrayList<>();
        this.scanner = scanner;
    }
    
    public void Add() {
        System.out.println("Name: ");
        String numePasare = this.scanner.nextLine();
        System.out.println("Name in Latin: ");
        String numeLatina = scanner.nextLine();
        Bird pasare = new Bird(numePasare, numeLatina);
        this.carte.add(pasare);
    }
    
    public ArrayList<Bird> carte() {
        return carte;
    }
    
    public void All() {
        for (Bird b : carte) {
            System.out.println(b);
        }
    }
    
    public String printOne(String nume) {
        for (Bird b : carte) {
            if (b.getNume().equals(nume)) {
                System.out.println(b);
            }
        }
        return null;
    }
    
    public void observatie(String b) {
        for (int i = 0; i < carte.size(); i++) {
            if (carte.get(i).getNume().equals(b)) {
                carte.get(i).addObservatie();
            }
        }
    }
   
}
