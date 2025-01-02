package Entity;

public interface Entity {
    String name = "";
    final int HP = 20;
    double currentHealth = HP;




    String getName();
    void setName(String name);
    double getCurrentHP();
    void setCurrentHP(double currentHP);
}
