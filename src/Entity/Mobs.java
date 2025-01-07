package Entity;

public abstract class Mobs implements Entity {
    public String name = "";
    public int HP = 20;
    public double currentHealth = HP;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
    }
    @Override
    public double getCurrentHP() {
        return currentHealth;
    }
    @Override
    public void setCurrentHP(double currentHP) {
        currentHealth = currentHP;
    }
    @Override
    public String toString() {
        return getName();
    }


    // Attacks
    public int basicAttack(){
        return 2;
    }

    public void basicHeal(){
        currentHealth += 1;
    }

}
