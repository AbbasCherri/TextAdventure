package Menus;

import Entity.Player;
import Input.InputHandler;
import Items.Weapon;
import Items.List.WeaponsList;

import java.util.NoSuchElementException;

public class Menu {
    public static Player player = new Player();
    public static InputHandler in = new InputHandler();
    public static WeaponsList weapons = new WeaponsList();
    public static CaveOneFull enc = new CaveOneFull();


    public static void startGame(){
        System.out.println("Hello Adventurer!");
        System.out.println("Welcome to this world full of wonder and exploration!");
        System.out.println("What should we call you powerful one?");
        player.setName(in.takeString());
    }
    public static void caveChoice() {
        System.out.println("Amazing to meet you " + player.getName());
        System.out.println("I am the all mighty wizard Balthazar!");
        System.out.println("I require you to enter this  great cave and return with the great treasure");
        System.out.println("There is one problem however. I am unsure where the great treasure is!");
        System.out.println("You have two a choice the cave of the left (type 1) and the cave of the right (type 2)!");
        System.out.println("Where do you wish to venture chosen one?");
        try {
            int choice = in.takeInt();
            do {
                if (choice == 1) {
                    caveOne();
                } else if (choice == 2) {
                    caveTwo();
                } else {
                    System.out.println("That is an invalid choice young one please try again!");
                    choice = in.takeInt();
                }
            } while (choice != 1 && choice != 2);
        }catch (NoSuchElementException e){
            System.out.println("You have no more choices!");
        }
    }

    private static void caveOne() {
        System.out.println("Very well you have chosen the cave of the left!");
        System.out.println("As such I will present you with two choices two weapons to aid you in your journey!");
        System.out.println("Your choices are \n1. The Hammer of Nausea \n2. The Trusty Sword of the Elder One");
        weaponPicker(weapons.TheHammerOfNausea, weapons.TheTrustySwordOfTheElderOne);
        enc.firstCaveEncounters();
    }
    private static void caveTwo(){
        System.out.println("Very well you have chosen the cave of the left!");
        System.out.println("As such I will present you with two choices two weapons to aid you in your journey!");
        System.out.println("Your choices shall be \n1. The Gun of Eternal Damnation \n2. The Sword of the Wise One!");
        weaponPicker(weapons.TheGunOfEternalDamnation, weapons.TheSwordOfTheWiseOne);
        enc.firstCaveEncounters();
    }

    private static void weaponPicker(Weapon weaponOne, Weapon weaponTwo) {
        int choice = in.takeInt();
        do{
            if (choice == 1) {
                player.addItem(weaponOne);
                System.out.println("CONGRATULATIONS! YOU HAVE ACQUIRED " + weaponOne);
            }if (choice == 2){
                player.addItem(weaponTwo);
                System.out.println("CONGRATULATIONS! YOU HAVE ACQUIRED " + weaponTwo);
            }else{
                System.out.println("That is an invalid choice young one please try again!");
                choice = in.takeInt();
            }
        }while (choice != 1 && choice != 2);
    }
}

