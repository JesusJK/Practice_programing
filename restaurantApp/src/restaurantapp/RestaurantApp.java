package restaurantapp;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "asd", "Fulanito de tal");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "pta", "blasphemous de tal");
        administrative.sellFood();
        
        //clase/instancia
        Menu menu = new Menu();
        
        Dish breakfast1 = new Dish(DishType.BREAKFAST, "Huevos fritos", "Huevo, Sal y pimienta", 2400, 20 );
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "caldo de huevo", "Huevo, papa, tostadas", 2400, 25 );
        Dish lunch1 = new Dish(DishType.LUNCH, "carne frita", "carne , papas fritas", 2400, 18 );
        Dish lunch2 = new Dish(DishType.LUNCH, "spagetti a la boloñesa", "Spaguetti, albondigas de carne, salasa de tomate", 2400, 16 );
        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        menu.addDish(lunch2);
        
        menu.showMenu();
        System.out.println(menu.getDishesPertype(DishType.BREAKFAST));
        System.out.println(menu.getDishesPertype(DishType.LUNCH));
        
    }  
    
}
