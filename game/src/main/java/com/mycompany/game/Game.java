package com.mycompany.game;

import com.mycompany.game.spaceShips.EstelarDestroyer;
import com.mycompany.game.spaceShips.MilleniumFalcon;


public class Game {

    public static void main(String[] args) {
        EstelarDestroyer nave1 = new EstelarDestroyer(true, true, "Navy1", true, 150, 200, 1340, 200);
        nave1.shoot();
        
        MilleniumFalcon nave2 = new MilleniumFalcon(true, 2, true, "Navy2", true, 10, 400, 2500, 170);
        nave2.shoot();
    }
}