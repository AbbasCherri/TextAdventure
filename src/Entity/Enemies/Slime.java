package Entity.Enemies;

import Entity.Mobs;
import Menus.Menu;

public class Slime extends Mobs {


    public final String name = "Slime";
    public final int HP = 10;
    public double currentHealth = HP;


    // Attacks
    public int jumpAttack() {
        return 5;
    }

    public int attack() {
        double playerHP = Menu.player.getCurrentHP();

        if (currentHealth - 2 == 0) {
            basicHeal();
            return 0;
        }
        if (playerHP-jumpAttack() > playerHP - basicAttack()){
            return jumpAttack();
        }else{
            return basicAttack();
        }
    }
}
