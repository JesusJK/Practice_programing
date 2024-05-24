package restaurantapp;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishList;
    private DishType dishType;
    
    public Menu(){
        this.dishList = new ArrayList<>();
    }
    
    public Menu (ArrayList<Dish> dishList){
        this.dishList = dishList;
    }
    
    public void addDish(Dish dish){
        this.dishList.add(dish);
    }
    
    public ArrayList<String> getDishesPertype(DishType dishtype){
        ArrayList<String> foundDishes = new ArrayList<>();
        
        for(Dish dish : dishList){
            if(dish.getType() == dishType){
                foundDishes.add(dish.getName());
            }
        }
        return foundDishes;
    }
    
    public void showMenu(){
        for (DishType dishType : DishType.values()) {
            System.out.println("---" + dishType + "---");
        }
    }
    
            
}
