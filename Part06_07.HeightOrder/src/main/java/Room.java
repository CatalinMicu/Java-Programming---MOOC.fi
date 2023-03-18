import java.util.ArrayList;


public class Room {
    private ArrayList<Person> lista;
    
    public Room() {
        this.lista = new ArrayList<>();
}
    
    public void add(Person person) {
        lista.add(person);
    }
    
    public boolean isEmpty() {
        if (lista.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.lista;
    }
    
    public Person shortest() {
        int inaltime = 300;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getHeight() < inaltime) {
                inaltime = lista.get(i).getHeight();
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getHeight() == inaltime) {
                return lista.get(i);
            }
        }
        if(lista.isEmpty()) {
            return null;
        }
        return null;
    }
    
    public Person take() {
        if (isEmpty()) {
            return null;
        } 
        
        Person scunda = this.shortest();
        this.lista.remove((scunda));
        return scunda;
       
        
 
    }
        
   
    
}
