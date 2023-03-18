
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal) {
        String meniu = meal;
        if (!(meals.contains(meniu))) {
            meals.add(meniu);
        }

        
    }
    
    public void printMeals() {
        for (int i = 0; i < meals.size(); i++) {
            System.out.println(meals.get(i));
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
   

    // implement the required methods here
}
