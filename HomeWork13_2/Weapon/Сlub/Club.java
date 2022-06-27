package HomeWork13_2.Weapon.Сlub;

import HomeWork13_2.Weapon.Axe.FactoryAxe;

public class Club extends FactoryAxe {
    public String name;
    public int attack;

    public Club(String name, int attack){
        this.name = name;
        this.attack = attack;
    }
}
