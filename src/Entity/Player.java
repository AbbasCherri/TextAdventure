package Entity;

import Input.InputHandler;
import Items.Item;
import Items.Weapon;

public class Player implements Entity {

    private String name;
    private final int HP = 20;
    private double currentHP = HP;

    Item place = new Item("",0, 0);
    private Item[] inventory = {place, place, place, place, place, place, place, place, place};
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
            }
        }
    }

    public int attack(){
        int j;

        // Counts Weapons in Player's Inventory
        j = 1;
        for (Item item : inventory) {
            if (item instanceof Weapon) {
                j++;
            }
        }

        // Adds the Weapons to the Weapons Array
        Weapon[] attacks = new Weapon[j];
        j = 0;
        for (Item item : inventory) {
            if (item instanceof Weapon) {
                attacks[j] = (Weapon) item;
                j++;
            }
        }

        // Displays the Weapons
        j = 1;
        for (Weapon weapon : attacks) {
            System.out.println(j + ". " + weapon + " does " + weapon.getDamage() + " damage");
            j++;
        }

        // Picking the Weapon
        int choice = input.takeInt() - 1;


        return attacks[choice].getDamage();
    }


}
