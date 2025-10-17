package entities;

import java.util.ArrayList;
import java.util.List;

public class Creature {
    private final String name;
    private double hp;
    private final double attack;
    private final double defense;
    private final double speed;
    private final List<Ability> abilities = new ArrayList<>();

    public Creature(String name, double hp, double attack, double defense, double speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }

    public double getSpeed() {
        return speed;
    }

    public void  takeDamage(double dmg) {
        hp = Math.max(0, hp - dmg);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void addAbility(Ability ability) {
        abilities.add(ability);
    }

    public List<Ability> getAbilities() {
        return abilities;
    }
}