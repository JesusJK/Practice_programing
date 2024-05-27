package com.mycompany.game.spaceShips;

public class MilleniumFalcon extends NuclearShip{
    private boolean hyperSpeed;
    private boolean shield;
    private int cannons;

    public MilleniumFalcon(boolean hyperSpeed, int cannons, boolean shield, String name, boolean armed, int crew, int damage, int health, int speed) {  //al colocar constructor al padre tambien debes agregarle al hijo y en el construcotr se mencionaran los atributos heredados
        super(name, armed, crew, damage, health, speed);
        this.hyperSpeed = hyperSpeed;
        this.cannons = cannons;
        this.shield = shield;
    }
    
    @Override   // sirve para sobrescribir el metodo en esta clase
    public void shoot(){
            System.out.println("Disparo a cañonasos!!!");
    }
    
    /*
    @Override                 // no se puede sobreescribir ya que en el padre el fly es metodo final 
    public void fly(){ }
    */
    

    public void toggleShield(){
        this.shield = !this.shield;
        System.out.println("Los escudos se han activado");
    }
    
}
