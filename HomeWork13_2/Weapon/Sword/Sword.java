package HomeWork13_2.Weapon.Sword;

public class Sword extends FactorySword {
    public String name;
    public int attack;

    public Sword(String name, int attack){
        this.name = name;
        this.attack = attack;
    }
}
