package Menus;

import Menus.Menu;
import Entity.Enemies.Slime;

public class CaveOneFull {

    Slime blueSlime = new Slime();



    public void firstCaveEncounters(){
        double playerHP, slimeHP;
        int playerAttack, slimeAttack;
        System.out.println("AS YOU ENTER THIS CAVE YOU LOOK AROUND AND ARE ABLE TO SPOT A HORRIFYING IMAGE...");
        System.out.println("IT IS THE ALL MIGHTY SLIME!!!");
        System.out.println("A wild " + blueSlime + " has appeared!");

        do{
            playerHP = Menu.player.getCurrentHP();
            slimeHP = blueSlime.getCurrentHP();
            System.out.println("YOU HP IS " + playerHP);
            System.out.println("SLIME HP IS "+ blueSlime.getCurrentHP());
            playerAttack = Menu.player.attack();
            blueSlime.setCurrentHP(slimeHP - playerAttack);
            System.out.println("SLIME HP IS "+ blueSlime.getCurrentHP());

            slimeAttack = blueSlime.attack();
            Menu.player.setCurrentHP(slimeAttack);
        }while(playerHP == 0 || slimeHP == 0);

        if (playerHP == 0){
            System.out.println("YOUR HEALTH HIT ZERO YOU DIE!");
        }else{
            System.out.println("THE SLIME HAS BEEN DEFEATED!");
        }

    }


}