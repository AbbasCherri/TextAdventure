package Entity;

import Input.InputHandler;
import Items.Item;
import Items.Weapon;

public class Player implements Entity {

    private String name;
    private final int HP = 20;
    private double currentHP = HP;

    Item place = new Item("",0, 0);
    Weapon wPlace = new Weapon("", 0, 0, 0, 0);
    private Item[] inventory = {place, place, place, place, place, place, place, place, place};
    private Weapon[] weaponsInventory = {wPlace, wPlace, wPlace, wPlace, wPlace};
    public InputHandler input = new InputHandler();


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getCurrentHP() {
        return currentHP;
    }

    @Override
    public void setCurrentHP(double currentHP) {
        this.currentHP = currentHP;
    }

    public Item[] getInventory() {
        return inventory;
    }
    public void addItem(Item item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].isPlaceHolder()) {
                inventory[i] = item;
                return;
            }
        }
    }

    public void addWeapon(Weapon weapon){
        for (int i = 0; i < weaponsInventory.length; i++) {
            if (weaponsInventory[i] == wPlace) {
                weaponsInventory[i] = weapon;
                return;
            }
        }
    }

    public int attack(){
        int j;

        // Displays the Weapons
        j = 1;
        for (Weapon weapon : weaponsInventory) {
            if (weapon != wPlace) {
                System.out.println(j + ". " + weapon + " does " + weapon.getDamage() + " damage");
                j++;
            }
        }

        // Picking the Weapon
        int choice = input.takeInt() - 1;


        return weaponsInventory[choice].getDamage();
    }


}
