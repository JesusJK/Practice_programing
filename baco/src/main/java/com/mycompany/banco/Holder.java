package com.mycompany.banco;

public class Holder {
    private String name;
    private double money;

    public Holder(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public Holder(String name) {
        this.name = name;
        this.money = 0;
    }

    public String getName() {
        return name;
    }
    
    /*
    public void setName(String name) {
        this.name = name;
    }
    */
    
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void consignMoney(double qty){
        if (qty < 0) {
            System.out.println("No se puede consignar");
            return;
        }
        //this.money = this.money + qty; ----> this.money += qty;
        this.money += qty;
        System.out.println("Consignación realizada");
    }
     
    public void withdrawmoney (double qty){
        if (qty > this.money) {
            System.out.println("Saldo insuficiente");
            return;
        }
        
        this.money -= qty;
        System.err.println("recibido realizado");
    }
    
}
