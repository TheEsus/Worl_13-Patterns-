package HomeWork13_2.Units.Humans;


import HomeWork13_2.Weapon.Weapon;

public class Human extends FactoryUnits {
    public String name;
    public int HP;
    public Weapon weapon;
    public Weapon armor;

    public Human(String name, int HP, Weapon weapon, Weapon armor){
        this.name = name;
        this.HP = HP;
        this.weapon = weapon;
        this.armor = armor;
    }
}
