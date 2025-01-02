package Entity;

import Items.Item;

public class Player implements Entity {

    private String name;
    private final int HP = 20;
    private double currentHP = HP;

    Item place = new Item("",0, 0);
    private Item[] inventory = {place, place, place, place, place, place, place, place, place};


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
}
