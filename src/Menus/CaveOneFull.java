package Menus;

import Menus.Menu;
import Entity.Enemies.Slime;

public class CaveOneFull {

    Slime blueSlime = new Slime();



    public void firstCaveEncounters(){
        double playerHP, slimeHP;

        System.out.println("AS YOU ENTER THIS CAVE YOU LOOK AROUND AND ARE ABLE TO SPOT A HORRIFYING IMAGE...");
        System.out.println("IT IS THE ALL MIGHTY SLIME!!!");
        System.out.println("A wild " + blueSlime + " has appeared!");

        do{
            playerHP = Menu.player.getCurrentHP();
            slimeHP = blueSlime.getCurrentHP();
            Menu.player.attack();
            blueSlime.attack();



        }while(playerHP == 0 || slimeHP == 0);


    }


}