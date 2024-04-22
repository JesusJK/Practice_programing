package com.mycompany.exeption;
public class Exeption {

    public static void main(String[] args) {
         Calculator calculator = new Calculator();
         
        // try catch 
         try{
             int res = calculator.division(4, 2);
             System.out.println(res);        
            }  
         
         catch (Exception exception){              //Exeption "la funcion" y despues la variable cualquier nombre
             System.out.println("A ocurrido un problema");
             System.out.println(exception);
            }
         finally {                                 //finally siemore se ejecuta
             System.out.println("jakjakjakjs");
            }
         /*
         try{
             int [] numbers = new int [3];
             numbers [5] = 2/0;
         }
         catch(ArithmeticException e){
             System.out.println("Operacion no permitida"); 
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Posición de array no valida");
         }
         catch (Exception e){
             */
         }
        
    }

   

