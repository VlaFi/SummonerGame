package src;

import abilities.FurballAttack;
import abilities.ToyAttack;
import entities.Creature;
import entities.BasicAttack;
import battle.BattleEngine;
import entities.Rune;

public class Main {
    public static void main(String[] args) {
        Creature player = new Creature("КотВлафи", 120, 25, 10, 18);
        Creature enemy = new Creature("КотИзКафе", 100, 20, 15, 15);

        player.addAbility(new BasicAttack());
        player.addAbility(new ToyAttack());
        enemy.addAbility(new BasicAttack());
        enemy.addAbility(new FurballAttack());

        player.addRune(new Rune(Rune.Type.ATTACK));
        player.addRune(new Rune(Rune.Type.ATTACK));
        player.addRune(new Rune(Rune.Type.ATTACK));
        player.addRune(new Rune(Rune.Type.ATTACK));
        player.addRune(new Rune(Rune.Type.HP));
        player.addRune(new Rune(Rune.Type.HP));

        BattleEngine battle = new BattleEngine(player, enemy);
        battle.start();
    }
}