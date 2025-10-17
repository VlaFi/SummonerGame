package battle;

import entities.Creature;
import entities.Ability;

public class BattleEngine {
    public void fight(Creature hero, Creature enemy) {
        System.out.println("Битва начинается!");

        while (hero.isAlive() && enemy.isAlive()) {
            hero.getAbilities().get(0).use(hero, enemy);
            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " пал!");
                break;
            }

            enemy.getAbilities().get(0).use(enemy, hero);
            if (!hero.isAlive()) {
                System.out.println(hero.getName() + " пал!");
            }
        }
    }
}