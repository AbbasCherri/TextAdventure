package Items;

public class Weapon extends Item{
    private final int damage;
    private final int extraDamage;

    public Weapon(String itemName, int itemPrice, int itemAmount, int damage, int extraDamage) {
        super(itemName, itemPrice, itemAmount);
        this.damage = damage;
        this.extraDamage = extraDamage;
    }


    public int getDamage() {
        return damage;
    }

    public int getExtraDamage() {
        return extraDamage;
    }
}
