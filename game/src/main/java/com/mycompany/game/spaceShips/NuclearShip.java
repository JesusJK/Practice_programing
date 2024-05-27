package com.mycompany.game.spaceShips;

public class NuclearShip {
    private String name;
    private boolean armed;
    private int crew;
    private int damage;
    private int health;
    private int speed;

    public NuclearShip(String name, boolean armed, int crew, int damage, int health, int speed) {
        this.name = name;
        this.armed = armed;
        this.crew = crew;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
    }
    
    final public void fly(){        //final es el valor final y no se sobreeescribe
        System.out.println("A volar");
    }
    
    public void shoot(){
        System.out.println("A disparar");
    }
    public void maneuver(){
        System.out.println("");
    }
    
}
