
import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> lista;

    
    public TodoList() {
        this.lista = new ArrayList<>();
    }
    
    public void add(String task) { 
        this.lista.add(task);
    }
    
    public void print() {
        for (int i = 0; i < this.lista.size(); i++) {
            System.out.println(i + 1 + ": " + this.lista.get(i));
        }
    }
    
    public void remove(int number) {
        int index = number - 1;
        if (index < 0 || index >= this.lista.size()) {
            return;
        }       
        this.lista.remove(index);
    }
    
    
}
 