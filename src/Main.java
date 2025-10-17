package src;

import entities.Creature;
import entities.BasicAttack;
import battle.BattleEngine;

public class Main {
    public static void main(String[] args) {
        Creature hero = new Creature("КотВлафи", 120, 25, 10, 18);
        Creature enemy = new Creature("КотИзКафе", 100, 20, 15, 15);

        hero.addAbility(new BasicAttack());
        enemy.addAbility(new BasicAttack());

        BattleEngine engine = new BattleEngine();
        engine.fight(hero, enemy);
    }
}