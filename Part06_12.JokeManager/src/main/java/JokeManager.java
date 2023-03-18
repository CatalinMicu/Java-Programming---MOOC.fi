import java.util.ArrayList;
import java.util.Random;


public class JokeManager {
    
    private ArrayList<String> lista;
    
    public JokeManager() {
        this.lista = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.lista.add(joke);
    }
    
    public String drawJoke() {
        Random rand = new Random();
        if (lista.isEmpty()) {
            return "Jokes are in short supply.";
        }
        int rand_int = rand.nextInt(lista.size());
        return lista.get(rand_int);
    }
    
    public void printJokes() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    
    
    
}
