package Section_9.Exercises.Ex47_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }



    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(this.name);
        values.add(Integer.toString(getHitPoints()));
        values.add(Integer.toString(getStrength()));
        values.add(this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && !savedValues.isEmpty()) {
            setName(savedValues.get(0));
            setHitPoints(Integer.parseInt(savedValues.get(1)));
            setStrength(Integer.parseInt(savedValues.get(2)));
            setWeapon(savedValues.get(3));
        }
    }
}
