package com.mycompany.ejemplo_exeptions;

public class Even {
    public boolean isEven(int number) throws Exception{
        if (number % 2 == 0){            //modulo
            throw  new Exception("No me gustan los numeros pares");
           
        }
        else{
            System.out.println("NO es par, ta bien");
        }
        return false;
            
    }
        
}
    

