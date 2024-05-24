package restaurantapp;
import java.util.Scanner;
public class Customer {
        CustomerRole role;
        String id;
        String fullname;
        
    public Customer(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
        
        void sayMenu(){
            System.out.println("¿Que Desea comprar el dia de hoy?");
            System.out.println("1.Desayuno  2.Almuerzo  3.Comida");
            
        }
        
        void buyFood(){
            
        }
        
        void cancelBuy(){
            
        }

        
        public void sellFood(){
            if(this.role != CustomerRole.ADMINISTRATIVE){
                System.out.println("Usted no tiene permiso para vender!!!");
                return;
            }
            System.out.println("Ya lo atiendo");
        }
        
}
