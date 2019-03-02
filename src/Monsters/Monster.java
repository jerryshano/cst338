package Monsters;

import Abilities.Attack;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class Monster {

    private int hp;
    private int xp;
    private int maxHP;
    private HashMap<String, Integer> items;
    int agi;
    int def;
    int str;
    Attack attack;

    public Monster attackTarget(Monster monster){
        return monster;
    }

    public Monster(Integer maxHP,Integer xp, HashMap<String, Integer> items ) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public int getAgi() {
        return agi;
    }

    public int getDef() {
        return def;
    }

    public int getStr() {
        return str;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;
        Monster monster = (Monster) o;
        return getHp() == monster.getHp() &&
                getXp() == monster.getXp() &&
                getMaxHP() == monster.getMaxHP() &&
                getItems().equals(monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems());
    }
/**
 * This method returns an integer value between min and max.
 * This is goofy. rand.nextInt(n) returns a number between 0-n.
 * to get this value we want, a value between str - maxStr,
 * we need to get a random number from maxStr str and
 * add str back in.
 * @param min an integer
 * @param min an integer
 * @return a random integer between min and max.
 *
*/

    Integer getAttribute (Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
//    returns a random number between min and max inclusive
        return rand.nextInt(max-min) + min;
    }


}
