package HomeWork13_1.Unit;


import HomeWork13_1.Items.Armors.Armors;
import HomeWork13_1.Items.Weapons.Weapons;

public class Unit {
    public String name;
    public Weapons weapons;
    public Armors armors;
    public int attack;
    public int def;

    public Unit(String name, Weapons weapons, Armors armors, int attack, int def){
        this.name = name;
        this.weapons = weapons;
        this.armors = armors;
        this.attack = attack;
        this.def = def;
    }


}
