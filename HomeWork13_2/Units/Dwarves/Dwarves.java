package HomeWork13_2.Units.Dwarves;


import HomeWork13_2.Weapon.Weapon;

public class Dwarves extends FactoryDwarves {
    public String name;
    public int HP;
    public Weapon weapon;
    public Weapon def;

    public Dwarves(String name, int HP, Weapon weapon,Weapon def){
        this.name = name;
        this.HP = HP;
        this.weapon = weapon;
        this.def = def;
    }
}
