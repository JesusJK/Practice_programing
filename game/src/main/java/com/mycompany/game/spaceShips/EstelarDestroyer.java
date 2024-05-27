package com.mycompany.game.spaceShips;

public class EstelarDestroyer extends NuclearShip{
    private boolean hyperSpeed;
    private boolean shield;

    public EstelarDestroyer(boolean hyperSpeed, boolean shield, String name, boolean armed, int crew, int damage, int health, int speed) {
        super(name, armed, crew, damage, health, speed);
        this.hyperSpeed = hyperSpeed;
        this.shield = shield;
    }
    
    @Override
    public void shoot(){
        super.shoot();     //refinamiento, ejecuta el disparo del padre y su disparo.
        System.out.println("Disparo con rasho Laser!!!");
    }
}
