import java.util.*;
import java.nio.file.Paths;
        
public class CarteRetete {
    private ArrayList<Reteta> retete;
    
    public CarteRetete() {
        this.retete = new ArrayList<>();
    }
    
    public void scaneazaRetete(String numeFisa) {
        try (Scanner scanner = new Scanner(Paths.get(numeFisa))) {
            while(scanner.hasNextLine()) {
                String numeReteta = scanner.nextLine();
                int timpPreparare = Integer.parseInt(scanner.nextLine());
                ArrayList<String> ingrediente = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingrediente.add(ingredient);
                }
                Reteta reteta = new Reteta(numeReteta, timpPreparare, ingrediente);
                this.retete.add(reteta);
            }
        } catch (Exception e) {
            
        }
    }
    
    public void listeazaRetete() {
        System.out.println("Recipes: ");
        this.retete.forEach(System.out::println);
    }
    
    public void gasesteNume(String nume) {
        System.out.println("Recipes: ");
        ArrayList<Reteta> rezultate = new ArrayList<>();
        for (Reteta reteta : this.retete) {
            if (reteta.getNume().contains(nume))
                rezultate.add(reteta);
        }
        rezultate.forEach(System.out::println);
    }
    
    public void gasesteTimp(int timp) {
        System.out.println("Recipes: ");
        ArrayList<Reteta> rezultate = new ArrayList<>();
        for (Reteta reteta :this.retete) {
            if(reteta.getTimp() <= timp) {
                rezultate.add(reteta);
            }
        }
        rezultate.forEach(System.out::println);
    }
    
    public void gasesteIngredient(String ingredient) {
        System.out.println("Recipes: ");
        ArrayList<Reteta> rezultate = new ArrayList<>();
        for (Reteta reteta :this.retete) {
            if(reteta.getIngrediente().contains(ingredient)) {
                rezultate.add(reteta);
            }
        }
        rezultate.forEach(System.out::println);
    }
    
    
}
