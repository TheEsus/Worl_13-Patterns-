package HomeWork13_2.Units.Giants;

import HomeWork13_2.Weapon.Weapon;

public class Giants extends FactoryGiants {
    public String name;
    public int HP;
    public Weapon weapon;

    public Giants(String name, int HP, Weapon weapon){
        this.name = name;
        this.HP = HP;
        this.weapon = weapon;
    }
}
