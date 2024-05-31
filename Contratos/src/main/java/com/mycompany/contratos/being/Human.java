package com.mycompany.contratos.being;

public class Human extends Being implements Move,Fly {    //"implements" palabra clave, eredar y despues implementar si quieres usar los dos en ese orden
    private int height;
    private String name;  

    public Human(int height, String name) {
        this.height = height;
        this.name = name;
    }
    
    // Vamos a colocar caracteristicas de ser vivo al humano como caminar,correr; El contrato te avisa que objeto no tiene tales metodos sino cumple con todas las tareas del contrato o metodos te va tirar error
    
    @Override
    public void walk(){
        System.out.println("Estoy caminando erguido");
    }
    
    @Override
    public void run(){
        System.out.println("Corriendo como naruto");
    }
    
    @Override
    public void fly(){
        System
                .out.println("Estoy volando!!!");   // Cada clase tiene su forma particular de hacer dicha tarea pero simepre se hace esa tarea
    }
    
    @Override
    public void crawl(){
        System.out.println("Estoy gateando");
    }
    
}
